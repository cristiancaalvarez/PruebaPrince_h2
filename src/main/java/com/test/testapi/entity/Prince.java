package com.test.testapi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table (name = "PRINCE")
public class Prince {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "BRAND_ID")
    private Long id;
    @Column (name = "START_DATE ")
    private Date startDate;
    @Column (name = "END_DATE")
    private Date endDate;
    @Column(name = "PRICE_LIST")
    private Long priceList;
    @Column (name = "PRODUCT_ID")
    private long productId;
    @Column (name = "PRIORITY")
    private Integer priority;
    @Column (name = "PRICE")
    private Double price;
    @Column (name = "CURR")
    private String curr;


}
