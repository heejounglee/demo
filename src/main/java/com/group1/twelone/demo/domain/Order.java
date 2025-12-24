package com.group1.twelone.demo.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "torder")
@Getter @Setter
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false)
    private String ordno; // 주문 번호

    @Column(length = 100, nullable = false)
    private String userid; // 고객 아이디 (React의 customerName 역할)

    @Column(nullable = false)
    private Long productid;

    @Column(length = 8, nullable = false)
    private String odate; // 주문 날짜 (YYYYMMDD)

    @Column(length = 6, nullable = false)
    private String otime; // 주문 시간 (HHmmss)

    @Column(nullable = false)
    private Integer qty;

    @Column(nullable = false)
    private Integer price;

    @Column(nullable = false)
    private Long amount; // 총 금액

    @Column(length = 50)
    private String paytype; // 결제 수단

    @Column(length = 50)
    private String ostatus; // 상태 (완료, 취소, 대기중 등)
}
