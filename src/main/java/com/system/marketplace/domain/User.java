package com.system.marketplace.domain;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="tbl_user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int user_id;

    @Column
    private String user_email;

    @Column
    private String user_password;

    @Column
    private String user_type;

    @Column
    private String teacher_firstName;

    @Column
    private String teacher_lastName;

    @Column
    private String telephone_home;

    @Column
    private String telephone_work;

    @Column
    private String address_country;

    @Column
    private String address_state;

    @Column
    private String address_city;

    @Column
    private String address_street;

    @Column
    private String address_postal;

    @Column
    private String user_website;

}
