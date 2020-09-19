package com.board.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.board.dto.userVO;

@Repository
public class userDaoImple implements userDao{
	
	@Autowired
	private JdbcTemplate jdbdtemplate;

	@Override
	public List<userVO> selectUserList(userVO uservo) {
		
		String q = "select * from mk_user";
		return jdbdtemplate.query(q, new BeanPropertyRowMapper<userVO>(userVO.class));
		
	}
	
	@Override
	public userVO selectUser(userVO uservo) {
		
		String q = "select * from mk_user where uid = ?";
		Object[] args = {uservo.getUid()};
		try {
			return jdbdtemplate.queryForObject(q, args,new BeanPropertyRowMapper<userVO>(userVO.class));
		} catch (Exception e) {
			return null;
		}
		
	}


	@Override
	public int insertUser(userVO uservo) {

		String q = "  INSERT INTO mk_user VALUES(?,?,?,?,?,?,?,?,?)";
		Object[] args = { uservo.getUid(), uservo.getNikname(), uservo.getUser_type(), uservo.getVal_yn(),
				uservo.getAuth_info(), uservo.getReg_dt(), uservo.getMdfy_dt(), uservo.getReg_id(),
				uservo.getMdfy_id() };
		return jdbdtemplate.update(q, args);

	}


	@Override
	public int updateUser(userVO uservo) {
		String q = "update mk_user set "
				+ "nikname = ? , "
				+ "user_type = ? , "
				+ "val_yn = ? ,"
				+ "auth_info = ? ,"
//				+ "reg_dt = ? ,"
				+ "mdfy_dt = ? ,"
//				+ "reg_id = ? ,"
				+ "mdfy_id = ? "				
				+ "where uid = ?" ;
		Object[] args = { uservo.getNikname(), uservo.getUser_type(), uservo.getVal_yn(), uservo.getAuth_info(),
				uservo.getMdfy_dt(), uservo.getMdfy_id(), uservo.getUid() };
		return jdbdtemplate.update(q, args);
	}

	@Override
	public int deleteUser(userVO uservo) {
		String q = "update mk_user set "
				+ "val_yn = ? ,"
				+ "mdfy_dt = ? ,"
				+ "mdfy_id = ? "
				+ "where uid = ?" ;
		Object[] args = { uservo.getVal_yn(),uservo.getMdfy_dt(), uservo.getMdfy_id(), uservo.getUid() };
		return jdbdtemplate.update(q, args);
	}
	
	@Override
	public int approveUser(userVO uservo) {
		String q = "update mk_user set "
				+ "val_yn = ? ,"
				+ "mdfy_dt = ? ,"
				+ "mdfy_id = ? "				
				+ "where uid = ?" ;
		Object[] args = { uservo.getVal_yn(),uservo.getMdfy_dt(), uservo.getMdfy_id(), uservo.getUid() };
		return jdbdtemplate.update(q, args);
	}
	
	@Override
	public int permanentdeleteUser(userVO uservo) {
		String q = "delete from mk_user where uid = ?" ;
		Object[] args = {uservo.getUid()};
		return jdbdtemplate.update(q,args);
	}
	
	@Override
	public userVO login(userVO uservo) {
		String q = "select * from mk_user where nikname = ?" ;
		Object[] args = {uservo.getNikname()};
		try {
			return jdbdtemplate.queryForObject(q, args,new BeanPropertyRowMapper<userVO>(userVO.class));
		} catch (Exception e) {
			return uservo;
		}
	}
	
	@Override
	public int isexist(userVO uservo) {
		String q = "select count(*) from mk_user where nikname = ?" ;
		Object[] args = {uservo.getNikname()};
		return jdbdtemplate.queryForObject(q, args,Integer.class);
	}
	
	
	
	

}
