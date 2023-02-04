package com.example.JPA_practice.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Table(name = "MEMBER")
public class MemberEntity {
    // Domain(Entity) : 실제 DB 테이블과 매핑시키는 클래스

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
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

    /*
     * 1. @NoArgsConstructor(access = AccessLevel.PROTECTED) : 해당 클래스의 기본 생성자를 생성해 주는 어노테이션,
     *     access 속성을 이용해서 동일한 패키지 내의 클래스에서만 객체를 생성할 수 있도록 제어, Entity와 Repository 인터페이스는 같은 패키지에 위치 해야함
     * 2. @Setter 사용x : 엔티티 클래스는 테이블과 동일 따라서 값이 임의로 변경되지 않게 setter 선언x
     * 3. @Id : PK임을 의미
     * 4. @GeneratedValue(strategy = GenerationType.SEQUENCE) : PK 생성 전략을 설정하는 어노테이션, 오라클의 시퀀스를 사용하기 때문에 설정
     */

}
