package com.projectStore.projectStore.entity;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "description")
public class  Description {
    @Id
    @Column(name = "description_id")
    @SequenceGenerator(name = "description_seq", sequenceName = "description_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "description_seq")
    private Long descriptionId;

    @Column(name = "description_goods")
    private String descriptionGoods;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "description")
    private Goods goods;
}
