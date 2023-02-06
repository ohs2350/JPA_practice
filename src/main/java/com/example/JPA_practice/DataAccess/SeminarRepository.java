package com.example.JPA_practice.DataAccess;

import com.example.JPA_practice.entities.JpaSeminar;
import com.example.JPA_practice.entities.JpaStudent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeminarRepository extends JpaRepository<JpaSeminar, Long> {
}
