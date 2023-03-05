package com.example.imageboard.controller;

import org.imgscalr.Scalr;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/board")
public class BoardController {

    @Value("${folder.path.base}")
    private String path;

    //List 부르기
    @RequestMapping(value = "/list")
    public String list() {
        return "index";
    }

    //Detail 보기
    public void detail(){

    }

    @PostMapping("/create")
    // 데이터 생성하기
    public void create(@RequestParam String title, @RequestParam MultipartFile file) throws Exception {

        try {
//            BufferedImage bi = ImageIO.read(file.getInputStream());
//            int width = bi.getWidth();
//            int height = bi.getHeight();
//            System.out.println(width);
//            System.out.println(height);
            String realPath = this.path+title+"\\";
            File Folder = new File(realPath);
            Folder.mkdir();

//            File newFileName = new File(realPath+file.getOriginalFilename());
//            file.transferTo(newFileName);
            //mutipartfile->bufferedImage
            BufferedImage bi=ImageIO.read(file.getInputStream());
            //이미지 사이즈변경
            bi=resizeImage(bi,30,30);
            System.out.println("bi 성공");
            //이미지 위치에 저장
            ImageIO.write(bi, "jpg", new File(realPath+file.getOriginalFilename()));
            System.out.println("위치 저장");
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    // 데이터 수정하기
    public void update(){

    }

    // 데이터 삭제하기
    public void delete(){

    }
    //baeldung에서 가져온 이미지 리사이징 해주는 메서드
    BufferedImage resizeImage(BufferedImage originalImage, int targetWidth, int targetHeight) throws Exception {
        // resize에 들어가는 속성을 변경해서 여러 모드로 변경해줄수있다
        return Scalr.resize(originalImage, Scalr.Method.AUTOMATIC, Scalr.Mode.FIT_EXACT, targetWidth, targetHeight, Scalr.OP_ANTIALIAS);
    }
}
