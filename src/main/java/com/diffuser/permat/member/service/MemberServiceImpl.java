package com.diffuser.permat.member.service;

import com.diffuser.permat.member.domain.Member;
import com.diffuser.permat.member.domain.MemberDTO;
import com.diffuser.permat.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService{
    @Autowired
    private MemberRepository memberRepository;

    @Override
    public String join(MemberDTO memberDTO) {
        Member member = memberDTO.toEntity();
        memberRepository.save(member);
        return "";
    }
}
