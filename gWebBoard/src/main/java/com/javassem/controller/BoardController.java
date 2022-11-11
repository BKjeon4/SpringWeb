package com.javassem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javassem.domain.BoardVO;
import com.javassem.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping("getBoardList.do")
	public String getBoardList(Model m) {
		List<BoardVO> list = boardService.getBoardList();
		m.addAttribute("boardList", list);
		return "getBoardList";
	}
	
	@RequestMapping("insertBoard.do")
	public void insertBoard() {
		
	}
	
	@RequestMapping("saveBoard.do")
	public String saveBoard(BoardVO boardVO) {
		//System.out.println(boardVO.getContent());
		boardService.insertBoard(boardVO);
		return "redirect:getBoardList.do";
	}
	
	@RequestMapping("getBoard.do")
	public String getBoard(BoardVO boardVO, Model m) {
		BoardVO resultVO = boardService.getBoard(boardVO);
		m.addAttribute("board",resultVO);
		return "getBoard";
		
	}
	
	@RequestMapping("deleteBoard.do")
	public String deleteBoard(BoardVO vo) {
		boardService.deleteBoard(vo);
		return "redirect:getBoardList.do";
	}
	
	@RequestMapping("updateBoard.do")
	public String updateBoard(BoardVO boardVO, Model m) {
		boardService.updateBoard(boardVO);
		m.addAttribute("board", boardService.getBoard(boardVO));
		return "getBoard";
	}
	
	
	


}
