package com.example.JPA_practice.DataAccess;

import com.example.JPA_practice.entities.JpaStudent;
import com.example.JPA_practice.entities.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<JpaStudent, Long> {
}
