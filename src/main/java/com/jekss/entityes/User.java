package com.jekss.entityes;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by jekss on 16.10.16.
 */
@Entity
@Table(name = "user")
public class User {

    private int id;
    private String name;
    private String email;
    private String login;
    private String password;
    private int numberTell;
    private String city;
    private String adress;

    public User() {
    }

    public User(int id,
                String name,
                String email,
                String password,
                int numberTell,
                String city,
                String adress) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.numberTell = numberTell;
        this.city = city;
        this.adress = adress;
    }

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    @Column(name = "id", nullable = false, length = 6)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name", nullable = false, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "email", nullable = false, length = 255)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "login", nullable = false)
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Column(name = "password", nullable = false, length = 255)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "numberTell")
    public int getNumberTell() {
        return numberTell;
    }

    public void setNumberTell(int numberTell) {
        this.numberTell = numberTell;
    }

    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Column(name = "adress")
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != user.id) return false;
        if (numberTell != user.numberTell) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        if (email != null ? !email.equals(user.email) : user.email != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (city != null ? !city.equals(user.city) : user.city != null) return false;
        return adress != null ? adress.equals(user.adress) : user.adress == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + numberTell;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (adress != null ? adress.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", numberTell=" + numberTell +
                ", city='" + city + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
