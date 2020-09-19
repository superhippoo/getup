package com.board.svc;

import java.util.List;

import com.board.dto.categoryVO;

public interface  categorySvc {
	
	public List<categoryVO> selectCategoryList(categoryVO categoryvo);
	
	public int insertCategory(categoryVO categoryvo);

	public int updateCategory(categoryVO categoryvo);

	public int permanentdeleteCategory(categoryVO categoryvo);

}
