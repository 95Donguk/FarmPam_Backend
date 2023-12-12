package com.fp.backend.auction.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@Table(name="item")
@Entity
public class Item extends BaseEntity {

    @Column(name="item_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(nullable = false)
    private String userName;

    @Column(nullable = false, length = 50)
    private String itemTitle;

    @Column(nullable = false)
    private int minPrice;

    @Lob
    @Column(nullable = false)
    private String itemDetail;

    @Column(nullable = false)
    private long time;

    @Column(nullable = false)
    private String itemType;

    @Column(nullable = false)
    private int weight;

    @Column
    private Boolean isSoldout;

}
