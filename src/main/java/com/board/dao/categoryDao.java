package com.board.dao;

import java.util.List;

import com.board.dto.categoryVO;

public interface categoryDao {
	
	public List<categoryVO> selectCategoryList(categoryVO categoryvo);

	public int insertCategory(categoryVO categoryvo);

	public int updateCategory(categoryVO categoryvo);

	public int permanentdeleteCategory(categoryVO categoryvo);
	
	public int selectMaxCategoryId();

}
