package com.system.marketplace.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name="tbl_user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)

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
    private UserType type;

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
