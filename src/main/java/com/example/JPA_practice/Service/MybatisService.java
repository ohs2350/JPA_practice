package com.example.JPA_practice.Service;

import com.example.JPA_practice.DataAccess.MybatisDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MybatisService {
    @Autowired
    private MybatisDAO mybatisDAO;

    /**** 회원 정보 조회 - Mybatis ****/
    public List<Map<String, Object>> selectAllMember() {

        return mybatisDAO.selectAllMember();
    }
}
