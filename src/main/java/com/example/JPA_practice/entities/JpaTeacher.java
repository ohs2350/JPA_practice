package com.example.JPA_practice.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@Table(name = "jpa_teacher")
public class JpaTeacher {
    @Id @GeneratedValue
    private Long teacher_ID;
    private String teacher_NAME;
    private String teacher_ADDRESS;
    private String teacher_SUBJECT;

    /*
    * 양방향 매핑 - 학생에서도 선생조회, 선생에서도 학생조회가 가능하게 함
    * mappedby는 연관 관계 객체의 반대 객체에 선언 (연관 관계 주인 : 외래키가 있는 객체)
    * mappedby에는 연관 관계 주인 객체의 연결 필드명을 넣으면 된다.
    * 아래 코드는 JpaStudent 연관관계의 주인이고 참조할 객체가 JpaTeacher 이다.
    */
    @OneToMany(mappedBy = "jpaTeacher")
    private List<JpaStudent> JpaStudents = new ArrayList<JpaStudent>();


    /*
     * 양방향 N:N (1:N N:1로 구현)
     */
    @OneToMany(mappedBy = "jpaTeacher")
    private List<JpaSignup> jpaSignups = new ArrayList<JpaSignup>();
}
