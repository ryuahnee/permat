package com.diffuser.permat.member.service;

import com.diffuser.permat.member.domain.Member;
import com.diffuser.permat.member.domain.MemberDTO;

public interface MemberService {

    //회원가입
    String join(MemberDTO memberDTO);

}
