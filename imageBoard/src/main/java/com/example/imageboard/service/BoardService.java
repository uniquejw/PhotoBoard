package com.example.imageboard.service;

import com.example.imageboard.dto.BoardDto;

import java.util.List;

public interface BoardService {
    public List<BoardDto> list();
    public BoardDto detail();
    public void create();
    public void update();
    public void delete();
}
