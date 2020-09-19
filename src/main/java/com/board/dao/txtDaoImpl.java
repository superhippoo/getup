package com.board.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.board.dto.txtVO;

@Repository
public class txtDaoImpl implements txtDao{
	
	@Autowired
	private JdbcTemplate jdbdtemplate;

	@Override
	public int inserttxt(txtVO txtvo) {

		String q = "  INSERT INTO mk_txt VALUES(?,?,?,?,?,?)";
		Object[] args = {txtvo.getTxt_id(),txtvo.getTxt_content(),txtvo.getReg_dt(),txtvo.getMdfy_dt(),txtvo.getReg_id(),txtvo.getMdfy_id()};
		return jdbdtemplate.update(q, args);

	}


	@Override
	public int updatetxt(txtVO txtvo) {
		String q = "update mk_txt set "
				+ "txt_content = ? , "
//				+ "reg_dt = ? ,"
				+ "mdfy_dt = ? ,"
//				+ "reg_id = ? ,"
				+ "mdfy_id = ? "				
				+ "where txt_id = ?" ;
		Object[] args = { txtvo.getTxt_content(),txtvo.getMdfy_dt(),txtvo.getMdfy_id(),txtvo.getTxt_id()};
		return jdbdtemplate.update(q, args);
	}

	@Override
	public int permanentdeletetxt(txtVO txtvo) {
		String q = "delete from mk_txt where txt_id = ?" ;
		Object[] args = {txtvo.getTxt_id()};
		return jdbdtemplate.update(q,args);
	}
	
	
	
	
	

}
