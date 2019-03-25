package com.projectStore.projectStore.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "order_status")
public class OrderStatus {
    @Id
    @Column(name = "order_status_id")
    @SequenceGenerator(name = "order_status_seq", sequenceName = "order_status_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_status_seq")
    private int orderStatusId;

    @Column(name = "status_name")
    private String statusName;
}
