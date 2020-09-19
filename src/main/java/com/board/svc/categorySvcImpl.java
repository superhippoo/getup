package com.board.svc;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.dao.categoryDao;
import com.board.dto.categoryVO;

@Service("categorySvc")
public class categorySvcImpl implements categorySvc {
	@Autowired
	private categoryDao categorydao;
	
	@Override
	public List<categoryVO> selectCategoryList(categoryVO categoryvo) {
		// TODO Auto-generated method stub
		return categorydao.selectCategoryList(categoryvo);
	}
	

	@Override
	public int insertCategory(categoryVO categoryvo) {
		categoryvo.setCategory_id(categorydao.selectMaxCategoryId()+1);
		Timestamp time = new Timestamp(System.currentTimeMillis());
		categoryvo.setReg_dt(time);
		categoryvo.setMdfy_dt(time);

		return categorydao.insertCategory(categoryvo);
	}

	@Override
	public int updateCategory(categoryVO categoryvo) {
		Timestamp time = new Timestamp(System.currentTimeMillis());
		categoryvo.setMdfy_dt(time);
		
		return categorydao.updateCategory(categoryvo);

	}

	@Override
	public int permanentdeleteCategory(categoryVO categoryvo) {

		return categorydao.permanentdeleteCategory(categoryvo);

	}
	

	



}
