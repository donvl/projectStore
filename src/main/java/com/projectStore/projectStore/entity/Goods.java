package com.projectStore.projectStore.entity;

import lombok.Data;


import javax.persistence.*;
import java.util.Set;

/**
 * Created by 111 on 25.03.2019.
 */
@Data
@Entity
@Table(name = "goods")
public class Goods {
    @Id
    @Column(name = "goods_id")
    @SequenceGenerator(name = "goods_seq", sequenceName = "goods_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "goods_seq")
    private int goodsId;

    @Column(name = "goods_name")
    private String goodsName;

    @Column(name = "manufacturer")
    private String manufacturer;

    @Column(name = "goods_size")
    private String goodsSize;

    @Column(name = "paper_max_size")
    private String paperMaxSize;

    @Column(name = "speed_of_printing")
    private String speedOfPrinting;

    @Column(name = "wifi")
    private boolean wifi;

    @Column(name = "ethernet")
    private boolean ethernet;

    @Column(name = "color_print")
    private boolean colorPrint;

    @Column(name = "goods_color")
    private String goodsColor;

    @Column(name = "quantity")
    private int quantity;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "goods")
    private Set<OrdersTable> ordersTables;

    @OneToOne
    @JoinColumn(name = "goods_type_id")
    private GoodsType goodsType;

    @OneToOne
    @JoinColumn(name = "description_id")
    private  Description description;
}
