package com.example.imageboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/board")
public class BoardController {

    //List 부르기
    @RequestMapping(value = "/list")
    public String list() {
        return "index";
    }

    //Detail 보기
    public void detail(){

    }

    // 데이터 생성하기
    public void create(){

    }

    // 데이터 수정하기
    public void update(){

    }

    // 데이터 삭제하기
    public void delete(){

    }

}
