package com.group1.twelone.demo.controller;

import com.group1.twelone.demo.domain.Member;
import com.group1.twelone.demo.service.MemberService;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
@RequestMapping("/api/member")
@Log4j2
public class MemberRestController {

    private final MemberService memberService;

    public MemberRestController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("list")
    public List<Member> getAllMembers() {
        return memberService.findAllMembers();
    }

    @GetMapping("login")
    public String loginForm() {
        return memberService.getMessage();
    }

    @PostMapping("/loginPost")
    public RedirectView login() {
        //return memberService.findAllMembers();
        return new RedirectView("/loginForm.html");
    }
}
