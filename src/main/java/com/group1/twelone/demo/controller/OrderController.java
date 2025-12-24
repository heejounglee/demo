package com.group1.twelone.demo.controller;

import com.group1.twelone.demo.domain.Order;
import com.group1.twelone.demo.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
@CrossOrigin(origins = "*") // React 연동을 위한 CORS 허용
public class OrderController {
    private final OrderService orderService;

    // 주문 목록 조회 (GET)
    @GetMapping
    public List<Order> getOrderList() {
        return orderService.getAllOrders();
    }

    // 새 주문 등록 (POST)
    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        // 기본값 설정 (필요시)
        if (order.getOstatus() == null) order.setOstatus("완료");
        return orderService.saveOrder(order);
    }
}
