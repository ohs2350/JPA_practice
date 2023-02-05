package com.example.JPA_practice.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@Table(name = "jpa_student")
public class JpaStudent {
    @Id @GeneratedValue
    private Long student_ID;
    private String student_NAME;
    private String student_ADDRESS;
    private int student_level;

    /*
    * 1. 연관관계 매핑x 코드
    * fk를 변수로 선언하여 사용
    * 문제점 : 객체를 객처처럼 사용하지 못함, DB스타일에 맞게 사용하는 방식 / 객체간 연관관계가 없다. 즉, 객체지향적이 아니다
    */
    // private Long teacher_ID;

    /*
    * 2. 연관관계 매핑O
    * 객체와 테이블의 외래키를 매핑시켜준다.
    * 엔티티 객체를 효율적으로 사용하기 위해 DB의 테이블과는 별개로 연관관계를 맺어준다.
    */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "teacher_ID")
    private JpaTeacher jpaTeacher;
}
