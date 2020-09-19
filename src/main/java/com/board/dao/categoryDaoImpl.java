package com.board.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.board.dto.categoryVO;

@Repository
public class categoryDaoImpl implements categoryDao{
	
	@Autowired
	private JdbcTemplate jdbdtemplate;
	


	@Override
	public List<categoryVO> selectCategoryList(categoryVO categoryvo) {
		String q = "select * from mk_category";
		return jdbdtemplate.query(q, new BeanPropertyRowMapper<categoryVO>(categoryVO.class));
	}

	@Override
	public int insertCategory(categoryVO categoryvo) {

		String q = "  INSERT INTO mk_category VALUES(?,?,?,?,?,?)";
		Object[] args = {categoryvo.getCategory_id(),categoryvo.getCategory_nm(),
				         categoryvo.getReg_dt(),categoryvo.getMdfy_dt(),categoryvo.getReg_id(),categoryvo.getMdfy_id()};
		return jdbdtemplate.update(q, args);

	}


	@Override
	public int updateCategory(categoryVO categoryvo) {
		String q = "update mk_category set "
				+ "category_nm = ? , "
//				+ "reg_dt = ? ,"
				+ "mdfy_dt = ? ,"
//				+ "reg_id = ? ,"
				+ "mdfy_id = ? "				
				+ "where category_id = ?" ;
		Object[] args = { categoryvo.getCategory_nm(),categoryvo.getMdfy_dt(),categoryvo.getMdfy_id(),categoryvo.getCategory_id()};
		return jdbdtemplate.update(q, args);
	}

	@Override
	public int permanentdeleteCategory(categoryVO categoryvo) {
		String q = "delete from mk_category where category_id = ?" ;
		Object[] args = {categoryvo.getCategory_id()};
		return jdbdtemplate.update(q,args);
	}


	@Override
	public int selectMaxCategoryId() {
		String q = "select max(category_id) from mk_category" ;
		return jdbdtemplate.queryForObject(q, Integer.class);
	}


	
	
	

}
