package com.group1.twelone.demo.repository;

import com.group1.twelone.demo.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface  MemberRepository extends JpaRepository<Member, Long> {

    Member findMemberByUserid(String userid);
}
