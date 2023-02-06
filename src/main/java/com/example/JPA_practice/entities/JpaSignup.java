package com.example.JPA_practice.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "jpa_signup")
public class JpaSignup {
    @Id
    @GeneratedValue
    private Long signup_ID;
    private Date signup_DATE;

    /*
     * 양방향 N:N (연결 테이블)
     */
    @ManyToOne
    @JoinColumn(name = "teacher_ID")
    private JpaTeacher jpaTeacher;

    @ManyToOne
    @JoinColumn(name = "seminar_ID")
    private JpaSeminar jpaSeminar;
}
