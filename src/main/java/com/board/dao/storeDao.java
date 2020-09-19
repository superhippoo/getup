package com.board.dao;

import java.util.List;

import com.board.dto.storeVO;

public interface storeDao {
	
	public List<storeVO> selectStoreList(storeVO storevo);
	
	public List<storeVO> searchstorelist(storeVO storevo);

	public storeVO selectStore(storeVO storevo);

	public int insertStore(storeVO storevo);

	public int updateStore(storeVO storevo);
	
	public int deleteStore(storeVO storevo);
	
	public int approveStore(storeVO storevo);
	
	public int permanentdeleteStore(storeVO storevo);



}
