package com.mycom.biz.board.impl;

import com.mycom.biz.board.vo.BoardVO;
import com.mycom.biz.common.JDBCUtil;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

@Repository
public class BoardDAO {
    private Connection conn;
    private PreparedStatement stmt;
    private ResultSet rs;

    public ArrayList<BoardVO> getBoardList(BoardVO vo) {
        ArrayList<BoardVO> VoList = new ArrayList<>();
        try {
            conn = JDBCUtil.getConnection();
            String sql = "select * from board where title like ? or content like ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, vo.getSearchKeyword());
            stmt.setString(2, vo.getSearchKeyword());
            rs = stmt.executeQuery();

            while (rs.next()) {
                BoardVO boardVO = new BoardVO();
                boardVO.setTitle(rs.getString("TITLE"));
                boardVO.setContent(rs.getString("CONTENT"));
                boardVO.setWriter(rs.getString("WRITER"));
                VoList.add(boardVO);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(rs, stmt, conn);
        }
        return VoList;
    }

    public boolean addBoard(BoardVO vo) {
        try {
            conn = JDBCUtil.getConnection();
            String sql = "INSERT INTO BOARD(TITLE, WRITER, CONTENT) VALUES(?, ?, ?); ";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, vo.getTitle());
            stmt.setString(2, vo.getWriter());
            stmt.setString(3, vo.getContent());
            rs = stmt.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            JDBCUtil.close(rs, stmt, conn);
        }
        return true;
    }
}