package com.ohgiraffers.practice03.annotationconfig;

import com.ohgiraffers.common.BoardDTO;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class BoardDAO {

    private final Map<Long, BoardDTO> boardMap;

    public BoardDAO(){
        boardMap = new HashMap<>();

        boardMap.put(1L, new BoardDTO(1L, "제목1", "내용1", "글쓴이1"));
        boardMap.put(2L, new BoardDTO(2L, "제목2", "내용2", "글쓴이2"));

    }

    public BoardDTO selectBoard(Long id){
        return boardMap.get(id);
    }

    public boolean insertBoard(BoardDTO newBoard){
        int before = boardMap.size();

        boardMap.put(newBoard.getId(), newBoard);

        int after = boardMap.size();

        return after > before ? true : false;
    }
}
