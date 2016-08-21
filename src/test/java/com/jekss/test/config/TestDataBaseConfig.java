package com.jekss.test.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.hibernate.ejb.HibernatePersistence;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.util.Properties;

@Configuration
@EnableTransactionManagement
@ComponentScan("com.jekss")
@EnableAsync
public class TestDataBaseConfig {

    private static final String PROPERTY_NAME_DATABASE_DRIVER = "org.h2.Driver";
    private static final String PROPERTY_NAME_DATABASE_URL = "jdbc:h2:~/test";
    private static final String PROPERTY_NAME_DATABASE_USERNAME = "";
    private static final String PROPERTY_NAME_DATABASE_PASSWORD = "";

    private static final String PROPERTY_NAME_HIBERNATE_DIALECT = "org.hibernate.dialect.H2Dialect";
    private static final String PROPERTY_NAME_HIBERNATE_SHOW_SQL = "false";
    private static final String PROPERTY_NAME_ENTITYMANAGER_PACKAGES_TO_SCAN = "com.jekss.entityes";
    private static final String PROPERTY_NAME_HIBERNATE_HBM2DDL_AUTO = "create";

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() throws PropertyVetoException {
        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactoryBean.setDataSource(dataSource());
        entityManagerFactoryBean.setPersistenceProviderClass(HibernatePersistence.class);
        entityManagerFactoryBean.setPackagesToScan(PROPERTY_NAME_ENTITYMANAGER_PACKAGES_TO_SCAN);

        entityManagerFactoryBean.setJpaProperties(hibernateProp());

        return entityManagerFactoryBean;
    }

    @Bean
    public JpaTransactionManager transactionManager() throws PropertyVetoException {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());

        return transactionManager;
    }

    @Bean
    public DataSource dataSource() throws PropertyVetoException {
        ComboPooledDataSource pooledDataSource = new ComboPooledDataSource();

        pooledDataSource.setDriverClass(PROPERTY_NAME_DATABASE_DRIVER);
        pooledDataSource.setJdbcUrl(PROPERTY_NAME_DATABASE_URL);
        pooledDataSource.setUser(PROPERTY_NAME_DATABASE_USERNAME);
        pooledDataSource.setPassword(PROPERTY_NAME_DATABASE_PASSWORD);
        pooledDataSource.setMinPoolSize(5);
        pooledDataSource.setAcquireIncrement(5);
        pooledDataSource.setMaxPoolSize(20);

        return pooledDataSource;
    }

    private Properties hibernateProp() {
        Properties properties = new Properties();
        properties.put("hibernate.dialect",	PROPERTY_NAME_HIBERNATE_DIALECT);
        properties.put("hibernate.show_sql", PROPERTY_NAME_HIBERNATE_SHOW_SQL);
        properties.put("hibernate.hbm2ddl.auto", PROPERTY_NAME_HIBERNATE_HBM2DDL_AUTO);
        return properties;
    }

    @Bean
    public ThreadPoolTaskExecutor threadPoolTaskExecutor(){
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(10);
        executor.setMaxPoolSize(10);
        executor.setQueueCapacity(25);
        executor.initialize();

        return  executor;
    }

}
