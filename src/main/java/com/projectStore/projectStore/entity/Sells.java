package com.projectStore.projectStore.entity;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "sells_table")

public class Sells implements Serializable {
    @Id
    @Column(name = "sell_id")
    @SequenceGenerator(name = "sell_seq", sequenceName = "sell_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sell_seq")
    private Long sellId;

    @Column(name = "sell_time")
    private Date sellTime;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private OrdersHeader ordersHeader;

}
