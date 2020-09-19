package com.board.svc;

import java.util.List;

import com.board.dto.userVO;

public interface  userSvc {
	
	public List<userVO> selectUserList(userVO uservo);
	
	public userVO selectUser(userVO uservo);

	public int insertUser(userVO uservo);

	public int updateUser(userVO uservo);
	
	public int deleteUser(userVO uservo);
	
	public int approveUser(userVO uservo);

	public int permanentdeleteUser(userVO uservo);
	
	public userVO login(userVO uservo);


}
