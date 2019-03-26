package com.projectStore.projectStore.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by 111 on 25.03.2019.
 */
@Data
@Entity
@Table(name = "description")
public class  Description {
    @Id
    @Column(name = "description_id")
    @SequenceGenerator(name = "description_seq", sequenceName = "description_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "description_seq")
    private int descriptionId;

    @Column(name = "description_goods")
    private String descriptionGoods;
}
