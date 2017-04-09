package com.jekss.config;

import com.jekss.service.security.UserDetailServiceImpl;
import com.jekss.util.registration.HashPasswordUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailServiceImpl userDetailsService;

	@Autowired
	private HashPasswordUser hpu;

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		//auth.inMemoryAuthentication().withUser("user").password("user").roles("USER");
		auth.inMemoryAuthentication().withUser("admin").password("admin").roles("ADMIN");
		auth.userDetailsService(userDetailsService);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.formLogin()
				// указываем страницу с формой логина
				.loginPage("/_header")
				.loginPage("/create_an_account")
				// указываем action с формы логина
				.loginProcessingUrl("/j_spring_security_check")
				// указываем URL при неудачном логине
				.failureUrl("/login?error")
				// Указываем параметры логина и пароля с формы логина
				.usernameParameter("j_username")
				.passwordParameter("j_password")
				// даем доступ к форме логина всем
				.permitAll();

		http.logout()
				// разрешаем делать логаут всем
				.permitAll()
				// указываем URL логаута
				.logoutUrl("/logout")
				// указываем URL при удачном логауте
				.logoutSuccessUrl("/")
				// делаем не валидной текущую сессию
				.invalidateHttpSession(true);

		http.authorizeRequests()
				.antMatchers("/upload/**").access("hasRole('ROLE_ADMIN')")
				.antMatchers("/listfileindirectory/**").access("hasRole('ROLE_ADMIN')")
				.antMatchers("/uploadCsv/**").access("hasRole('ROLE_ADMIN')")
				.antMatchers("/*").permitAll()
				//.antMatchers("/productpage").access("hasRole('ROLE_USER')")
				.antMatchers("create_an_account.jsp").permitAll()
				.antMatchers("/bucket/**").permitAll()
				.antMatchers("_header.jsp").permitAll()
				.and().formLogin().defaultSuccessUrl("/", false);

		// включаем защиту от CSRF атак
		http.csrf()
				.disable()
				// указываем правила запросов
				// по которым будет определятся доступ к ресурсам и остальным данным
				.authorizeRequests()
				.antMatchers("/resources/**", "/**").permitAll()
				.anyRequest().permitAll()
				.and();

	}

//	@Bean
//	public ShaPasswordEncoder getShaPasswordEncoder(){
//		return new ShaPasswordEncoder();
//	}

}
