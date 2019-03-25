package com.projectStore.projectStore.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "orders_header")
public class OrdersHeader {
    @Id
    @Column (name = "order_id")
    @SequenceGenerator(name = "orders_header_seq", sequenceName = "orders_header_seq", allocationSize = 1)
    @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "orders_header_seq")
    private int orderId;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "order_time")
    private int orderTime;

    @Column(name = "order_status_id")
    private int orderStatusId;

    @Column(name = "sum")
    private BigDecimal sum;

    @Column(name = "client_name")
    private String clientName;

    @Column(name = "client_phone")
    private String clientPhone;
}
