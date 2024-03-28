package com.ohgiraffers.practice02.javaconfig;

import com.ohgiraffers.common.BoardDTO;
import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean
    public MemberDTO memberDTO(){
        MemberDTO mem = new MemberDTO();
        mem.setId(2L);
        mem.setNickname("user02");

        return mem;
    }

    @Bean
    public BoardDTO boardDTO(){
        BoardDTO board = new BoardDTO();

        board.setId(2L);
        board.setTitle("제목2");
        board.setContent("내용2");
        board.setWriter(memberDTO());

        return board;
    }
}
