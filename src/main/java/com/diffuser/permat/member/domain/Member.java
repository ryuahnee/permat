package com.diffuser.permat.member.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name="member")
public class Member {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)	// 자동 id 생성
        private Integer  memberNo;      //  NOT NULL AUTO_INCREMENT COMMENT 회원번호
        @Column
        private String memberId;       // VARCHAR(50)     NULL        COMMENT 아이디,
        @Column
        private String pwd;             // VARCHAR(50)     NULL        COMMENT 비밀번호,
        @Column
        private String email;           //VARCHAR(50)     NULL        COMMENT 이메일,
        @Column
        private String memberName;     // VARCHAR(50)     NULL        COMMENT 이름,
        @Column
        private String phone;           //VARCHAR(50)     NULL        COMMENT 연락처,
        @Column
        private String address;         //VARCHAR(100)    NULL        COMMENT 주소,
        @Column
        private Character gender;       //CHAR(1)         NULL        COMMENT 성별,
        @Column
        private Date birth;           //DATE            NULL        COMMENT 생년월일,
        @Column
        private String level;            //VARCHAR(50)     NULL        COMMENT '회원등급',
        @Column
        private String role;         //VARCHAR(50)     NULL        COMMENT '권한',
        @Column
        private LocalDateTime joinDate;       //DATETIME        NOT NULL    COMMENT 가입일,
        @Column
        private String snssnsJoin;     //VARCHAR(50)     NOT NULL    COMMENT sns가입여부,
        @Column
        private Boolean snsConsent;     //CHAR(1)         NOT NULL    COMMENT 마케팅동의,

        // Member 엔터티에서 MemberDTO로 수동 변환하는 메서드
        public MemberDTO toDTO() {
                return MemberDTO.builder()
                        .memberNo(this.memberNo)
                        .memberId(this.memberId)
                        .email(this.email)
                        .memberName(this.memberName)
                        .phone(this.phone)
                        .address(this.address)
                        .gender(this.gender)
                        .birth(this.birth)
                        .level(this.level)
                        .role(this.role)
                        .joinDate(this.joinDate)
                        .snssnsJoin(this.snssnsJoin)
                        .snsConsent(this.snsConsent)
                        .build();
        }
}


