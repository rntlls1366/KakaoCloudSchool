package com.mycom.biz.board;
import java.util.ArrayList; 
import com.mycom.biz.board.vo.BoardVO;
import org.springframework.stereotype.Service;


public interface BoardService { 
      public boolean addBoard(BoardVO vo);
      public void updateBoard(BoardVO vo); 
      public void deleteBoard(BoardVO vo); 
      public BoardVO getBoard(BoardVO vo); 
      public ArrayList<BoardVO> getBoardList(BoardVO vo); 
}