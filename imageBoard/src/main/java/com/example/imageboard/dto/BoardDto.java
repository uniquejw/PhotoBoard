package com.example.imageboard.dto;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class BoardDto {
    public class RequestBoardCreate {
        private int boardId;
        private String boardTitle;
        private String boardContent;
        private List<MultipartFile> image;
    }

    public class ResponseList {
        private int boardId;
        private String boardTitle;
        private String boardContent;
        private List<MultipartFile> image;
        private List<String> comment;
    }
    public class ResponseDetail {
        private int boardId;
        private String boardTitle;
        private String boardContent;
        private List<MultipartFile> image;
        private List<String> comment;
    }
}
