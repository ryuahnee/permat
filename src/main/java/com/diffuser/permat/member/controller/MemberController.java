package com.diffuser.permat.member.controller;

import com.diffuser.permat.member.domain.MemberDTO;
import com.diffuser.permat.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/members")
public class MemberController {
    @Autowired
    private MemberService memberService;

    // 회원 가입 처리
    @PostMapping("/join")
    public String join(MemberDTO memberDTO){
        memberService.join(memberDTO);
        return "";
    }
}
