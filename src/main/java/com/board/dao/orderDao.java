package com.board.dao;

import java.util.List;

import com.board.dto.orderVO;

public interface orderDao {
	
	public List<orderVO> selectOrderList(orderVO ordervo);
	
	public orderVO selectOrder(orderVO ordervo);
	
	public List<orderVO> selectMyOrderList(orderVO ordervo);
	
	public List<orderVO> selectMyAuthorOrderList(orderVO ordervo);

	public int insertOrder(orderVO ordervo);

	public int updateOrder(orderVO ordervo);	
	
	public int permanentdeleteOrder(orderVO ordervo);

	




}
