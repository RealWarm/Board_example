package org.zerock.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.zerock.domain.BoardVO;
import org.zerock.persistence.BoardDAO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BoardServiceImpl implements BoardService {
	
	@Inject
	private BoardDAO dao;
	
	@Override
	public void register(BoardVO bd) throws Exception {
		log.info("BoardServiceImpl :: register(BoardVO bd) invoked!!");
		dao.create(bd);		
	}//register

	@Override
	public BoardVO read(Integer bno) throws Exception {
		log.info("BoardServiceImpl :: read(Integer bno) invoked!!");
		return dao.read(bno);
	}//read

	@Override
	public void modify(BoardVO bd) throws Exception {
		log.info("BoardServiceImpl :: read(Integer bno) invoked!!");
		dao.update(bd);
	}//modify

	@Override
	public void remove(Integer bno) throws Exception {
		log.info("BoardServiceImpl :: read(Integer bno) invoked!!");
		dao.delete(bno);
	}//remove

	@Override
	public List<BoardVO> listAll() throws Exception {
		log.info("BoardServiceImpl :: read(Integer bno) invoked!!");
		return dao.listAll();
	}//listAll

}//end
