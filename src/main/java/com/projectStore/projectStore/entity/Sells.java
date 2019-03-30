package com.projectStore.projectStore.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "sells_table")

public class Sells {
    @Id
    @Column(name = "sell_id")
    @SequenceGenerator(name = "sell_seq", sequenceName = "sell_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sell_seq")
    private int sellId;

    @Column(name = "order_id")
    private int orderId;

    @Column(name = "sell_time")
    private Date sellTime;

}
