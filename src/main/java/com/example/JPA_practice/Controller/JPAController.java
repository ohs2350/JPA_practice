package com.example.JPA_practice.Controller;

import com.example.JPA_practice.Service.JpaService;
import com.example.JPA_practice.entities.MemberEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@Controller
public class JPAController {
    @Autowired
    private JpaService jpaService;

    /**** 회원 정보 조회 - JPA ****/
    @GetMapping("/selectForJPA")
    public String selectAllMember(Model model) {
        List<MemberEntity> result = jpaService.selectAllMember();
        model.addAttribute("member", result);

        System.out.println(result.get(0).getMember_ID());

        return "main/result";
    }
}
