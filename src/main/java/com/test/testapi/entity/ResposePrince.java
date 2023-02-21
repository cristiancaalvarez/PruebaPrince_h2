package com.test.testapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public class ResposePrince {
    private LocalDateTime Start;
    private LocalDateTime End;
    private Long List;
    private long Product;
    private Integer Priority;
    private Double Price;
    private String Curr;
}
