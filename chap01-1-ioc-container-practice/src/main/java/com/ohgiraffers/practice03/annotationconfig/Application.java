package com.ohgiraffers.practice03.annotationconfig;

import com.ohgiraffers.common.BoardDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);
        // 2번에서 생성한 ContextConfiguration 설정 파일을 기반으로 ApplicationContext 타입의 IoC Container 를 생성한다.

        String[] beanNames = context.getBeanDefinitionNames();


        for(String beanName : beanNames){
            System.out.println("[beanName] " + beanName);
        }

        BoardDAO boardDAO = context.getBean("boardDAO", BoardDAO.class);
        // 빈 스캐닝을 통해 등록 된 BoardDAO 타입의 bean 객체를 IoC Container 에서 꺼낸다.

        System.out.println(boardDAO.selectBoard(1L));
        System.out.println(boardDAO.insertBoard(new BoardDTO(3L, "제목3", "내용3", "글쓴이3")));
        System.out.println(boardDAO.selectBoard(3L));
    }
}
