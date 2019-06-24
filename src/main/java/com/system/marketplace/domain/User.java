package com.system.marketplace.domain;

import lombok.Data;

import java.util.List;

@Data
public class User {

    private int user_id;
    private String user_photo;
    private String user_name;
    private String user_login;
    private String user_password;
    private String user_type;
    private String user_firstName;
    private String user_LastName;
    private String user_lastName;
    private String telephone_home;
    private String telephone_work;
    private String user_address;
    private String user_mail;
    private String currentLocation;
    private String nationality;
    private String website;

    public User() {}

    public User(int user_id, String user_photo, String user_name, String user_login, String user_password, String user_type, String user_firstName, String user_LastName, String user_lastName, String telephone_home, String telephone_work, String user_address, String user_mail, String currentLocation, String nationality, String website) {
        this.user_id = user_id;
        this.user_photo = user_photo;
        this.user_name = user_name;
        this.user_login = user_login;
        this.user_password = user_password;
        this.user_type = user_type;
        this.user_firstName = user_firstName;
        this.user_LastName = user_LastName;
        this.user_lastName = user_lastName;
        this.telephone_home = telephone_home;
        this.telephone_work = telephone_work;
        this.user_address = user_address;
        this.user_mail = user_mail;
        this.currentLocation = currentLocation;
        this.nationality = nationality;
        this.website = website;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_photo() {
        return user_photo;
    }

    public void setUser_photo(String user_photo) {
        this.user_photo = user_photo;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_login() {
        return user_login;
    }

    public void setUser_login(String user_login) {
        this.user_login = user_login;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public String getUser_firstName() {
        return user_firstName;
    }

    public void setUser_firstName(String user_firstName) {
        this.user_firstName = user_firstName;
    }

    public String getUser_LastName() {
        return user_LastName;
    }

    public void setUser_LastName(String user_LastName) {
        this.user_LastName = user_LastName;
    }

    public String getUser_lastName() {
        return user_lastName;
    }

    public void setUser_lastName(String user_lastName) {
        this.user_lastName = user_lastName;
    }

    public String getTelephone_home() {
        return telephone_home;
    }

    public void setTelephone_home(String telephone_home) {
        this.telephone_home = telephone_home;
    }

    public String getTelephone_work() {
        return telephone_work;
    }

    public void setTelephone_work(String telephone_work) {
        this.telephone_work = telephone_work;
    }

    public String getUser_address() {
        return user_address;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }

    public String getUser_mail() {
        return user_mail;
    }

    public void setUser_mail(String user_mail) {
        this.user_mail = user_mail;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_photo='" + user_photo + '\'' +
                ", user_name='" + user_name + '\'' +
                ", user_login='" + user_login + '\'' +
                ", user_password='" + user_password + '\'' +
                ", user_type='" + user_type + '\'' +
                ", user_firstName='" + user_firstName + '\'' +
                ", user_LastName='" + user_LastName + '\'' +
                ", user_lastName='" + user_lastName + '\'' +
                ", telephone_home='" + telephone_home + '\'' +
                ", telephone_work='" + telephone_work + '\'' +
                ", user_address='" + user_address + '\'' +
                ", user_mail='" + user_mail + '\'' +
                ", currentLocation='" + currentLocation + '\'' +
                ", nationality='" + nationality + '\'' +
                ", website='" + website + '\'' +
                '}';
    }
}
