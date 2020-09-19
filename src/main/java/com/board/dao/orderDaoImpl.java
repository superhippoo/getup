package com.board.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.board.dto.orderVO;

@Repository
public class orderDaoImpl implements orderDao{
	
	@Autowired
	private JdbcTemplate jdbdtemplate;

	@Override
	public List<orderVO> selectOrderList(orderVO ordervo) {
		
		String q = "select * from mk_order";
		return jdbdtemplate.query(q, new BeanPropertyRowMapper<orderVO>(orderVO.class));
		
	}
	
	@Override
	public orderVO selectOrder(orderVO ordervo) {
		
//		String q = "select * from mk_store where store_id = ?";
		String q = "select a.*,b.txt_content "
				+ "from mk_order a, mk_txt b "
				+ "where a.order_id = b.txt_id "
				+ "and order_id = ?";

		Object[] args = {ordervo.getOrder_id()};
		try {
			return jdbdtemplate.queryForObject(q, args,new BeanPropertyRowMapper<orderVO>(orderVO.class));
		} catch (Exception e) {
			return null;
		}
		
	}
	
	@Override
	public List<orderVO> selectMyOrderList(orderVO ordervo) {
		
		String q = "select * from mk_order where uid = ?";

		Object[] args = {ordervo.getUid()};
		return jdbdtemplate.query(q, args,new BeanPropertyRowMapper<orderVO>(orderVO.class));
		
	}
	
	@Override
	public List<orderVO> selectMyAuthorOrderList(orderVO ordervo) {
		
		String q = "select a.*,b.nikname from mk_order a, mk_user b where a.uid = b.uid and a.author_id = ?";

		Object[] args = {ordervo.getAuthor_id()};
		return jdbdtemplate.query(q, args,new BeanPropertyRowMapper<orderVO>(orderVO.class));
		
	}


	@Override
	public int insertOrder(orderVO ordervo) {

		String q = "  INSERT INTO mk_order VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?);";
		Object[] args = { ordervo.getOrder_id(),ordervo.getUid(),ordervo.getAuthor_id(),ordervo.getStore_id(),ordervo.getTitle(),
				          ordervo.getAddress(),ordervo.getEtc_info(),ordervo.getOrder_stat(),ordervo.getPrice(),ordervo.getReg_dt(),
				          ordervo.getMdfy_dt(),ordervo.getReg_id(),ordervo.getMdfy_id()};
		return jdbdtemplate.update(q, args);

	}


	@Override
	public int updateOrder(orderVO ordervo) {
		String q = "update mk_order set "
				+ "uid = ? , "
				+ "author_id = ? , "
				+ "store_id = ? , "
				+ "title = ? ,"
				+ "address = ? ,"
				+ "etc_info = ? ,"
				+ "order_stat = ? ,"
				+ "price = ? ,"
//				+ "reg_dt = ? ,"
				+ "mdfy_dt = ? ,"
//				+ "reg_id = ? ,"
				+ "mdfy_id = ? "				
				+ "where order_id = ?" ;
		Object[] args = {ordervo.getUid(),ordervo.getAuthor_id(),ordervo.getStore_id(),ordervo.getTitle(),ordervo.getAddress(),
				         ordervo.getEtc_info(),ordervo.getOrder_stat(),ordervo.getPrice(),ordervo.getMdfy_dt(),
				         ordervo.getMdfy_id(),ordervo.getOrder_id()};
		return jdbdtemplate.update(q, args);
	}

	
	@Override
	public int permanentdeleteOrder(orderVO ordervo) {
		String q = "delete from mk_order where order_id = ?" ;
		Object[] args = {ordervo.getOrder_id()};
		return jdbdtemplate.update(q,args);
	}
	
	
	
	
	

}
