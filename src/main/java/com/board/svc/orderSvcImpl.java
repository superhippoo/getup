package com.board.svc;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.dao.orderDao;
import com.board.dao.txtDao;
import com.board.dto.orderVO;
import com.board.dto.txtVO;
import com.board.util.uidUtil;

@Service("orderSvc")
public class orderSvcImpl implements orderSvc {
	@Autowired
	private orderDao orderdao;
	
	@Autowired
	private txtDao txtdao;

	@Override
	public List<orderVO> selectOrderList(orderVO ordervo) {
		// TODO Auto-generated method stub
		return orderdao.selectOrderList(ordervo);
	}

	@Override
	public orderVO selectOrder(orderVO ordervo) {
		// TODO Auto-generated method stub
		return orderdao.selectOrder(ordervo);
	}
	
	@Override
	public List<orderVO> selectMyOrderList(orderVO ordervo) {
		// TODO Auto-generated method stub
		return orderdao.selectMyOrderList(ordervo);
	}
	
	@Override
	public List<orderVO> selectMyAuthorOrderList(orderVO ordervo) {
		// TODO Auto-generated method stub
		return orderdao.selectMyAuthorOrderList(ordervo);
	}

	@Override
	public int insertOrder(orderVO ordervo) {
		ordervo.setOrder_id(uidUtil.generateUid("O"));
		Timestamp time = new Timestamp(System.currentTimeMillis());
		ordervo.setReg_dt(time);
		ordervo.setMdfy_dt(time);
		
		txtVO txtvo = new txtVO();
		
		txtvo.setTxt_id(ordervo.getOrder_id());
		txtvo.setTxt_content(ordervo.getTxt_content());;
		txtvo.setReg_dt(ordervo.getReg_dt());
		txtvo.setReg_id(ordervo.getReg_id());
		txtvo.setMdfy_dt(ordervo.getMdfy_dt());
		txtvo.setMdfy_id(ordervo.getMdfy_id());
		
		if (orderdao.insertOrder(ordervo) == 1) {
			return txtdao.inserttxt(txtvo);
		}else {
			return 0; 
		}
		

	}

	@Override
	public int updateOrder(orderVO ordervo) {
		Timestamp time = new Timestamp(System.currentTimeMillis());
		ordervo.setMdfy_dt(time);
		
		txtVO txtvo = new txtVO();
		
		txtvo.setTxt_id(ordervo.getOrder_id());
		txtvo.setTxt_content(ordervo.getTxt_content());;
		txtvo.setMdfy_dt(ordervo.getMdfy_dt());
		txtvo.setMdfy_id(ordervo.getMdfy_id());
		if (orderdao.updateOrder(ordervo) == 1) {
			return txtdao.updatetxt(txtvo);
		}else {
			return 0; 
		}
	}


	@Override
	public int permanentdeleteOrder(orderVO ordervo) {

		txtVO txtvo = new txtVO();
		
		txtvo.setTxt_id(ordervo.getOrder_id());

		if (orderdao.permanentdeleteOrder(ordervo) == 1) {
			return txtdao.permanentdeletetxt(txtvo);
		}else {
			return 0; 
		}
	}
	

	



}
