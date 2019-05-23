package com.projectStore.projectStore.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by 111 on 25.03.2019.
 */
@Data
@Entity
@Table(name = "goods_type")
public class GoodsType {
    @Id
    @Column(name = "goods_type_id")
    @SequenceGenerator(name = "goods_type_seq", sequenceName = "goods_type_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "goods_type_seq")
    private int goodsTypeId;

    @Column(name = "type_name")
    private String typeName;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "goodsType")
    private Goods goods;
}
