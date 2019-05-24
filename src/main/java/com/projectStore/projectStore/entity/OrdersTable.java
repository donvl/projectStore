package com.projectStore.projectStore.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "orders_table")
public class OrdersTable {
    @Id
    @Column(name = "order_table_id")
    @SequenceGenerator(name = "orders_table_seq", sequenceName = "orders_table_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "orders_table_seq")
    private Long orderTableId;

    @Column(name = "order_price")
    private BigDecimal orderPrice;

    @Column(name = "count")
    private int count;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "goods_id")
    private Goods goods;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private OrdersHeader ordersHeader;
}
