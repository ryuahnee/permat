package com.diffuser.permat.member.controller;

        import com.diffuser.permat.member.domain.MemberDTO;
        import com.diffuser.permat.member.service.MemberService;
        import org.junit.jupiter.api.Test;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.boot.test.context.SpringBootTest;
        import org.springframework.transaction.annotation.Transactional;

        import java.text.SimpleDateFormat;
        import java.time.LocalDateTime;
        import java.util.Date;

@SpringBootTest
class MemberControllerTest {

    @Autowired
    private MemberService memberService;

    @Autowired
    private MemberController memberController;

    @Test
    @Transactional
    void join() throws Exception {
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setMemberId("testUser");
        memberDTO.setPwd("testPassword");
        memberDTO.setEmail("testUser@example.com");
        memberDTO.setMemberName("Test User");
        memberDTO.setPhone("123-456-7890");
        memberDTO.setAddress("123 Test Street, City");
        memberDTO.setGender('M');

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthDate = sdf.parse("1990-01-01");
        memberDTO.setBirth(birthDate);

        memberDTO.setLevel("vip");
        memberDTO.setRole("user");
        memberDTO.setJoinDate(LocalDateTime.now());
        memberDTO.setSnsJoin("N");
        memberDTO.setSnsConsent(false);
        memberController.join(memberDTO);
    }


}