package com.group1.twelone.demo.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@Table(name = "tmember")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String userid;
    private String pwd;
    private String email;
    private String phone;
    private int admin;
    private String status;

    public Member(String userid, String pwd) {
        this.userid = userid;
        this.pwd = pwd;
    }

}
