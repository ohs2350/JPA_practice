package com.example.JPA_practice.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
@Setter
public class MemberEntity {
    // Domain(Entity) : 실제 DB 테이블과 매핑시키는 클래스
    @Id
    private String member_ID;
    private String member_PW;
    private String member_NAME;
    private String member_ADDRESS;
    private String member_POST;
    private String member_PHONE;
    private Date member_JOINDATE;
    private Date member_BIRTH;
    private String member_LEVEL;
    private int member_BUY;
}
