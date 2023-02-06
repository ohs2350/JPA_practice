package com.example.JPA_practice.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "jpa_seminar")
public class JpaSeminar {
    @Id
    @GeneratedValue
    private Long seminar_ID;
    private String seminar_NAME;
    private String seminar_SUBJECT;

    /*
    * 양방향 N:N (1:N N:1로 구현)
    */
    @OneToMany(mappedBy = "jpaSeminar")
    private List<JpaSignup> jpaSignups = new ArrayList<JpaSignup>();
}
