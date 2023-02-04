package com.example.JPA_practice.DataAccess;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface MybatisDAO {
    List<Map<String, Object>> selectAllMember();

    @Select("SELECT * FROM member")
    List<Map<String, Object>> selectAllMemberWithAnno();
}
