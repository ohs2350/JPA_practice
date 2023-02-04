package com.example.JPA_practice.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.Date;

@Data
public class MemberDTO {
    // DTO : 데이터 전송 객체, 로직을 가지지 않고, 데이터 객체에 대한 정보만 담고 있다.

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
