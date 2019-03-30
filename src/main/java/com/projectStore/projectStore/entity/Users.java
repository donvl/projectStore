package com.projectStore.projectStore.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users_table")

public class Users {
    @Id
    @Column(name = "user_id")
    @SequenceGenerator(name = "user_seq", sequenceName = "user_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    private int usersId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_ phone")
    private String userPhone;

    @Column(name = "user_mail")
    private String userMail;

    @Column(name = "user_login")
    private String userLogin;

    @Column(name = "user_pass")
    private String userPass;

    @Column(name = "admin")
    private boolean admin;

}
