package com.example.JPA_practice.Controller;

import com.example.JPA_practice.Service.MybatisService;
import com.example.JPA_practice.entities.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@Controller
public class MybatisController {
    @Autowired
    private MybatisService mybatisService;

    /**** 회원 정보 조회 - Mybatis ****/
    @GetMapping("/selectForMybatis")
    public String selectAllMember(Model model) {
        List<Map<String, Object>> result = mybatisService.selectAllMember();
        model.addAttribute("member", result);

        return "main/result";
    }
}
