package com.board.dao;

import java.util.List;

import com.board.dto.userVO;

public interface userDao {
	
	public List<userVO> selectUserList(userVO uservo);
	
	public userVO selectUser(userVO uservo);

	public int insertUser(userVO uservo);

	public int updateUser(userVO uservo);
	
	public int deleteUser(userVO uservo);
	
	public int approveUser(userVO uservo);
	
	public int permanentdeleteUser(userVO uservo);

	public userVO login(userVO uservo);
	
	public int isexist(userVO uservo);



}
