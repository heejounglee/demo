package com.group1.twelone.demo.service;

import com.group1.twelone.demo.domain.Member;
import com.group1.twelone.demo.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MemberService {

    @Autowired
    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public List<Member> findAllMembers() {
        return memberRepository.findAll();
    }

    public Member findMemberById(Long id) {
        // ID가 없으면 예외 발생 또는 null 반환
        return memberRepository.findById(id).orElse(null);
    }

    public Member findMemberByUserid(String userid) {
        return memberRepository.findMemberByUserid(userid);
    }

    public Member saveMember(Member member) {
        return memberRepository.save(member);
    }

    public String getMessage() {
        return "정상 처리 되었습니다";
    }

}
