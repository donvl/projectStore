package com.projectStore.projectStore.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "order_status")
public class OrderStatus {
    @Id
    @Column(name = "order_status_id")
    @SequenceGenerator(name = "order_status_seq", sequenceName = "order_status_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_status_seq")
    private Long orderStatusId;

    @Column(name = "status_name")
    private String statusName;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orderStatus")
    private Set<OrdersHeader> ordersHeaders;
}
