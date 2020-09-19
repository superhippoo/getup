package com.board.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.board.dto.authorVO;

@Repository
public class authorDaoImple implements authorDao{
	
	@Autowired
	private JdbcTemplate jdbdtemplate;

	@Override
	public List<authorVO> selectAuthorList(authorVO authorvo) {
		
		String q = "select * from mk_author";
		return jdbdtemplate.query(q, new BeanPropertyRowMapper<authorVO>(authorVO.class));
		
	}
	
	@Override
	public List<authorVO> selectAuthor(authorVO authorvo) {
		
		String q = "select * from mk_author where uid = ?";
		Object[] args = {authorvo.getUid()};
		return jdbdtemplate.query(q, args,new BeanPropertyRowMapper<authorVO>(authorVO.class));
		
	}
	
	@Override
	public int insertAuthor(authorVO authorvo) {

		String q = "  INSERT INTO mk_author VALUES(?,?,?,?,?,?,?,?)";
		Object[] args = { authorvo.getUid(),authorvo.getVal_yn(),authorvo.getDeal_cnt(),authorvo.getAccount_add(),
				authorvo.getReg_dt(), authorvo.getMdfy_dt(), authorvo.getReg_id(),
				authorvo.getMdfy_id() };
		return jdbdtemplate.update(q, args);

	}


	@Override
	public int updateAuthor(authorVO authorvo) {
		String q = "update mk_author set "
				+ "val_yn = ? ,"
				+ "deal_cnt = ? ,"
				+ "account_add = ? ,"
				+ "mdfy_dt = ? ,"
//				+ "reg_id = ? ,"
				+ "mdfy_id = ? "				
				+ "where uid = ?" ;
		Object[] args = {  authorvo.getVal_yn(), authorvo.getDeal_cnt(),authorvo.getAccount_add(),
				authorvo.getMdfy_dt(), authorvo.getMdfy_id(), authorvo.getUid() };
		return jdbdtemplate.update(q, args);
	}

	@Override
	public int deleteAuthor(authorVO authorvo) {
		String q = "update mk_author set "
				+ "val_yn = ? ,"
				+ "mdfy_dt = ? ,"
				+ "mdfy_id = ? "
				+ "where uid = ?" ;
		Object[] args = { authorvo.getVal_yn(),authorvo.getMdfy_dt(), authorvo.getMdfy_id(), authorvo.getUid() };
		return jdbdtemplate.update(q, args);
	}
	
	@Override
	public int approveAuthor(authorVO authorvo) {
		String q = "update mk_author set "
				+ "val_yn = ? ,"
				+ "mdfy_dt = ? ,"
				+ "mdfy_id = ? "				
				+ "where uid = ?" ;
		Object[] args = { authorvo.getVal_yn(),authorvo.getMdfy_dt(), authorvo.getMdfy_id(), authorvo.getUid() };
		return jdbdtemplate.update(q, args);
	}
	
	@Override
	public int permanentdeleteAuthor(authorVO authorvo) {
		String q = "delete from mk_author where uid = ?" ;
		Object[] args = {authorvo.getUid()};
		return jdbdtemplate.update(q,args);
	}
	
	

}
