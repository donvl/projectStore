package com.projectStore.projectStore.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "comments_table")

public class Comments {
    @Id
    @Column(name = "comment_id")
    @SequenceGenerator(name = "comment_seq", sequenceName = "comment_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "comment_seq")
    private int commentId;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "comment")
    private String comment;

    @Column(name = "comment_time")
    private Date orderId;

}
