package com.group1.twelone.demo.repository;

import com.group1.twelone.demo.domain.Member;
import com.group1.twelone.demo.domain.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu, Long> {
    List<Menu> findAllByOrderByMenuOrderAsc();
}
