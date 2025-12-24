package com.group1.twelone.demo.controller;

import com.group1.twelone.demo.domain.Menu;
import com.group1.twelone.demo.repository.MenuRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/menus")
@CrossOrigin(origins = "http://localhost:3000")
public class MenuController {
    private final MenuRepository menuRepository;

    public MenuController(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    @GetMapping
    public List<Menu> getAllMenus() {
        return menuRepository.findAllByOrderByMenuOrderAsc();
    }
}
