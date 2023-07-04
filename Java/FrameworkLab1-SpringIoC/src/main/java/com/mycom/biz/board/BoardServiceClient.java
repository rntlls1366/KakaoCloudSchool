package com.mycom.biz.board;

import com.mycom.biz.board.vo.BoardVO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;
import com.mycom.biz.user.vo.UserVO;

import java.util.ArrayList;

public class BoardServiceClient {

    public static void main(String[] args) {

        ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");

        BoardService boardService = (BoardService) factory.getBean("boardService");
        BoardVO vo = new BoardVO();
        vo.setSearchKeyword("부탁");
        System.out.println("부탁 이 포함되는 내용을 검색합니다.");
        ArrayList<BoardVO> boardList = boardService.getBoardList(vo);
        boardList.forEach((eachVo) -> {
            System.out.println("작성자 : " + eachVo.getWriter() + " 제목 : " + eachVo.getTitle() + " 내용 : " + eachVo.getContent());
        });

        System.out.println("테스트용 insert문을 수행합니다.");
        BoardVO vo2 = new BoardVO();
        vo2.setWriter("작성자테스트");
        vo2.setTitle("제목테스트");
        vo2.setContent("내용테스트");
        if(boardService.addBoard(vo2)) System.out.println("insert문이 정상적으로 수행되었습니다.");
        else System.out.println("insert문 수행에 실패하였습니다.");

    }
}

// 실행결과 : 출력형 문자열로