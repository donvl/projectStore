package com.projectStore.projectStore.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Set;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "user_id")
    @SequenceGenerator(name = "user_seq", sequenceName = "user_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    private Long userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "mobile")
    @Size(min = 10, max = 14, message = "Номер должен быть от 10 до 14 символов")
    private String mobile;

    @Column(name = "user_mail")
    private String userMail;

    @Column(name = "user_login")
    private String userLogin;

    @Column(name = "user_pass")
    private String userPass;

    @Column(name = "admin")
    private boolean admin;

    @Column(name = "active")
    private boolean active;

    @Transient
    private String passwordConfirm;

    @ManyToMany
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = "user_id"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "role_id"))
    private Set<Role> roles;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private Set<OrdersHeader> ordersHeaders;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "user")
    private Set<Comments> comments;

}
