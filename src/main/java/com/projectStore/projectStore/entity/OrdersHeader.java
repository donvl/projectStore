package com.projectStore.projectStore.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;

@Data
@Entity
@Table(name = "orders_header")
public class OrdersHeader implements Serializable {
    @Id
    @Column (name = "order_id")
    @SequenceGenerator(name = "orders_header_seq", sequenceName = "orders_header_seq", allocationSize = 1)
    @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "orders_header_seq")
    private Long orderId;

    @Column(name = "order_time")
    private int orderTime;

    @Column(name = "sum")
    private BigDecimal sum;

    @Column(name = "client_name")
    private String clientName;

    @Column(name = "client_phone")
    private String clientPhone;

    @Column(name = "address")
    private String address;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "ordersHeader")
    private Sells sells;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "ordersHeader")
    private Set<OrdersTable> ordersTables;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_status_id")
    private OrderStatus orderStatus;
}
