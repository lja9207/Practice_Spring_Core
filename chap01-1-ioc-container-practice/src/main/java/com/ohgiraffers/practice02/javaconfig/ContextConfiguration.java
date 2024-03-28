package com.ohgiraffers.practice02.javaconfig;

import com.ohgiraffers.common.BoardDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration("configurationPractice02")
public class ContextConfiguration {


    @Bean(name= "board")
    public BoardDTO getBoard() {
        return new BoardDTO(2l, "제목2", "내용2", "글쓴이2");


    }


}
