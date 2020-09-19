package com.board.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.board.dto.storeVO;

@Repository
public class storeDaoImple implements storeDao{
	
	@Autowired
	private JdbcTemplate jdbdtemplate;

	@Override
	public List<storeVO> selectStoreList(storeVO storevo) {
		
		String q = "select * from mk_store";
		return jdbdtemplate.query(q, new BeanPropertyRowMapper<storeVO>(storeVO.class));
		
	}
	
	@Override
	public List<storeVO> searchstorelist(storeVO storevo) {
		if (storevo.getCatetory_id() == 0) {
			String q = "select * from mk_store where (title like ? or summary like ?)";
			Object[] args = {"%"+storevo.getKeyword()+"%","%"+storevo.getKeyword()+"%"};
			return jdbdtemplate.query(q, args,new BeanPropertyRowMapper<storeVO>(storeVO.class));
		}else {
			String q = "select * from mk_store where (title like ? or summary like ?) and category_id = ?";
			Object[] args = {"%"+storevo.getKeyword()+"%","%"+storevo.getKeyword()+"%",storevo.getCatetory_id()};
			return jdbdtemplate.query(q, args,new BeanPropertyRowMapper<storeVO>(storeVO.class));
		}
	}
	
	
	
	@Override
	public storeVO selectStore(storeVO storevo) {
		
//		String q = "select * from mk_store where store_id = ?";
		String q = "select a.*,b.txt_content "
				+ "from mk_store a, mk_txt b "
				+ "where a.store_id = b.txt_id "
				+ "and store_id = ?";

		Object[] args = {storevo.getStore_id()};
		try {
			return jdbdtemplate.queryForObject(q, args,new BeanPropertyRowMapper<storeVO>(storeVO.class));
		} catch (Exception e) {
			return storevo;
		}
		
	}
	
	


	@Override
	public int insertStore(storeVO storevo) {

		String q = "  INSERT INTO mk_store VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
		Object[] args = { storevo.getStore_id(),storevo.getVal_yn(),storevo.getUid(),storevo.getCatetory_id(),storevo.getTitle(),
				          storevo.getPrice(),storevo.getWork_period(),storevo.getSummary(),storevo.getSam1(),storevo.getSam2(),storevo.getSam3(),storevo.getSam4(),
						  storevo.getReg_dt(),storevo.getMdfy_dt(),storevo.getReg_id(),storevo.getMdfy_id()};
		return jdbdtemplate.update(q, args);

	}


	@Override
	public int updateStore(storeVO storevo) {
		String q = "update mk_store set "
				+ "uid = ? , "
				+ "val_yn = ? , "
				+ "catetory_id = ? ,"
				+ "title = ? ,"
				+ "price = ? ,"
				+ "work_period = ? ,"
				+ "summary = ? ,"
				+ "sam1 = ? ,"
				+ "sam2 = ? ,"
				+ "sam3 = ? ,"
				+ "sam4 = ? ,"
//				+ "reg_dt = ? ,"
				+ "mdfy_dt = ? ,"
//				+ "reg_id = ? ,"
				+ "mdfy_id = ? "				
				+ "where store_id = ?" ;
		Object[] args = { storevo.getUid(),storevo.getVal_yn(),storevo.getCatetory_id(),storevo.getTitle(),storevo.getPrice(),
				  storevo.getWork_period(),storevo.getSummary(),storevo.getSam1(),storevo.getSam2(),storevo.getSam3(),storevo.getSam4(),
				  storevo.getMdfy_dt(),storevo.getMdfy_id(),storevo.getStore_id()};
		return jdbdtemplate.update(q, args);
	}

	@Override
	public int deleteStore(storeVO storevo) {
		String q = "update mk_store set "
				+ "val_yn = ? ,"
				+ "mdfy_dt = ? ,"
				+ "mdfy_id = ? "
				+ "where store_id = ?" ;
		Object[] args = { storevo.getVal_yn(),storevo.getMdfy_dt(), storevo.getMdfy_id(), storevo.getStore_id() };
		return jdbdtemplate.update(q, args);
	}
	
	@Override
	public int approveStore(storeVO storevo) {
		String q = "update mk_store set "
				+ "val_yn = ? ,"
				+ "mdfy_dt = ? ,"
				+ "mdfy_id = ? "				
				+ "where store_id = ?" ;
		Object[] args = { storevo.getVal_yn(),storevo.getMdfy_dt(), storevo.getMdfy_id(), storevo.getStore_id()};
		return jdbdtemplate.update(q, args);
	}
	
	@Override
	public int permanentdeleteStore(storeVO storevo) {
		String q = "delete from mk_store where store_id = ?" ;
		Object[] args = {storevo.getStore_id()};
		return jdbdtemplate.update(q,args);
	}
	
	
	
	
	

}
