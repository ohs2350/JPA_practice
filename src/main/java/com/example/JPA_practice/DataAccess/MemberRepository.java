package com.example.JPA_practice.DataAccess;

import com.example.JPA_practice.entities.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface MemberRepository extends JpaRepository<MemberEntity, String> {

}
