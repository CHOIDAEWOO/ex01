package org.childfund.persistence;

import java.util.List;

import org.childfund.domain.BoardVO;
import org.childfund.domain.Criteria;

public interface BoardDAO {

	void create(BoardVO vo) throws Exception;

	BoardVO read(Integer bno) throws Exception;

	void update(BoardVO vo) throws Exception;

	void delete(Integer bno) throws Exception;

	List<BoardVO> listAll() throws Exception;
	
	List<BoardVO> listPage(int page) throws Exception;
	
	List<BoardVO> listCriteria(Criteria cri) throws Exception;
	
	int countPaging(Criteria cri) throws Exception;

}