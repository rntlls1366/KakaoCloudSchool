package com.mycom.biz.board.impl;

import java.util.ArrayList;

import com.mycom.biz.board.BoardService;
import com.mycom.biz.board.vo.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("boardService")
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardDAO boardDAO;

    public boolean addBoard(BoardVO vo) {
        return boardDAO.addBoard(vo);
    }

    @Override
    public void updateBoard(BoardVO vo) {

    }

    @Override
    public void deleteBoard(BoardVO vo) {

    }

    @Override
    public BoardVO getBoard(BoardVO vo) {
        return null;
    }

    public ArrayList<BoardVO> getBoardList(BoardVO vo) {
        vo.setSearchKeyword("%" + vo.getSearchKeyword() + "%");
        return boardDAO.getBoardList(vo);
    }
}