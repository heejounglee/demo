package com.group1.twelone.demo.repository;

import com.group1.twelone.demo.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    // 최신 주문이 위로 오도록 정렬하여 조회
    List<Order> findAllByOrderByIdDesc();
}
