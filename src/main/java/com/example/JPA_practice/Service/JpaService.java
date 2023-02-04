package com.example.JPA_practice.Service;

import com.example.JPA_practice.DataAccess.MemberRepository;
import com.example.JPA_practice.entities.MemberEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class JpaService {
    @Autowired
    private  MemberRepository memberRepository;

    public List<MemberEntity> selectAllMember() {
        return memberRepository.findAll();
    }
}
