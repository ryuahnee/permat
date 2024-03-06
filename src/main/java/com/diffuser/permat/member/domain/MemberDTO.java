package com.diffuser.permat.member.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.Date;

@Data
public class MemberDTO {

        private Integer  memberNo;      //  NOT NULL AUTO_INCREMENT COMMENT 회원번호
        private String memberId;       // VARCHAR(50)     NULL        COMMENT 아이디,
        private String pwd;             // VARCHAR(50)     NULL        COMMENT 비밀번호,
        private String email;           //VARCHAR(50)     NULL        COMMENT 이메일,
        private String memberName;     // VARCHAR(50)     NULL        COMMENT 이름,
        private String phone;           //VARCHAR(50)     NULL        COMMENT 연락처,
        private String address;         //VARCHAR(100)    NULL        COMMENT 주소,
        private Character gender;       //CHAR(1)         NULL        COMMENT 성별,
        private Date birth;           //DATE            NULL        COMMENT 생년월일,
        private String level;            //VARCHAR(50)     NULL        COMMENT '회원등급',
        private String role;         //VARCHAR(50)     NULL        COMMENT '권한',
        private LocalDateTime joinDate;       //DATETIME        NOT NULL    COMMENT 가입일,
        private String snssnsJoin;     //VARCHAR(50)     NOT NULL    COMMENT sns가입여부,
        private Boolean snsConsent;     //CHAR(1)         NOT NULL    COMMENT 마케팅동의,

        @Builder
        public MemberDTO(Integer memberNo, String memberId, String pwd, String email, String memberName, String phone, String address, Character gender, Date birth, String level, String role, LocalDateTime joinDate, String snssnsJoin, Boolean snsConsent) {
                this.memberNo = memberNo;
                this.memberId = memberId;
                this.pwd = pwd;
                this.email = email;
                this.memberName = memberName;
                this.phone = phone;
                this.address = address;
                this.gender = gender;
                this.birth = birth;
                this.level = level;
                this.role = role;
                this.joinDate = joinDate;
                this.snssnsJoin = snssnsJoin;
                this.snsConsent = snsConsent;
        }


        // MemberDTO에서 Member 엔터티로 수동 변환하는 메서드
        public Member toEntity() {
                Member member = new Member();
                member.setMemberNo(this.memberNo);
                member.setMemberId(this.memberId);
                member.setEmail(this.email);
                member.setMemberName(this.memberName);
                member.setPhone(this.phone);
                member.setAddress(this.address);
                member.setGender(this.gender);
                member.setBirth(this.birth);
                member.setLevel(this.level);
                member.setRole(this.role);
                member.setJoinDate(this.joinDate);
                member.setSnssnsJoin(this.snssnsJoin);
                member.setSnsConsent(this.snsConsent);
                return member;
        }



}


