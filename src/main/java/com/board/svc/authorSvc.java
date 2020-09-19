package com.board.svc;

import java.util.List;

import com.board.dto.authorVO;

public interface  authorSvc {
	
	public List<authorVO> selectAuthorList(authorVO authorvo);
	
	public List<authorVO> selectAuthor(authorVO authorvo);
	
	public int insertAuthor(authorVO authorvo);

	public int updateAuthor(authorVO authorvo);
	
	public int deleteAuthor(authorVO authorvo);
	
	public int approveAuthor(authorVO authorvo);
	
	public int permanentdeleteAuthor(authorVO authorvo);

}
