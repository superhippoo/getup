package com.board.svc;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.dao.storeDao;
import com.board.dao.txtDao;
import com.board.dto.storeVO;
import com.board.dto.txtVO;
import com.board.util.uidUtil;

@Service("storeSvc")
public class storeSvcImpl implements storeSvc {
	@Autowired
	private storeDao storedao;
	
	@Autowired
	private txtDao txtdao;

	@Override
	public List<storeVO> selectStoreList(storeVO storevo) {
		// TODO Auto-generated method stub
		return storedao.selectStoreList(storevo);
	}
	
	@Override
	public List<storeVO> searchstorelist(storeVO storevo) {
		// TODO Auto-generated method stub
		return storedao.searchstorelist(storevo);
	}
	
	@Override
	public storeVO selectStore(storeVO storevo) {
		// TODO Auto-generated method stub
		return storedao.selectStore(storevo);
	}

	@Override
	public int insertStore(storeVO storevo) {
		storevo.setStore_id(uidUtil.generateUid("S"));
		Timestamp time = new Timestamp(System.currentTimeMillis());
		storevo.setReg_dt(time);
		storevo.setMdfy_dt(time);
		storevo.setVal_yn("N");
		
		txtVO txtvo = new txtVO();
		
		txtvo.setTxt_id(storevo.getStore_id());
		txtvo.setTxt_content(storevo.getTxt_content());;
		txtvo.setReg_dt(storevo.getReg_dt());
		txtvo.setReg_id(storevo.getReg_id());
		txtvo.setMdfy_dt(storevo.getMdfy_dt());
		txtvo.setMdfy_id(storevo.getMdfy_id());
		
		if (storedao.insertStore(storevo) == 1) {
			return txtdao.inserttxt(txtvo);
		}else {
			return 0; 
		}
		

	}

	@Override
	public int updateStore(storeVO storevo) {
		Timestamp time = new Timestamp(System.currentTimeMillis());
		storevo.setMdfy_dt(time);
		
		txtVO txtvo = new txtVO();
		
		txtvo.setTxt_id(storevo.getStore_id());
		txtvo.setTxt_content(storevo.getTxt_content());;
		txtvo.setMdfy_dt(storevo.getMdfy_dt());
		txtvo.setMdfy_id(storevo.getMdfy_id());
		if (storedao.updateStore(storevo) == 1) {
			return txtdao.updatetxt(txtvo);
		}else {
			return 0; 
		}
	}

	@Override
	public int deleteStore(storeVO storevo) {
		Timestamp time = new Timestamp(System.currentTimeMillis());
		storevo.setMdfy_dt(time);
		storevo.setVal_yn("N");
		storevo.setMdfy_id(storevo.getUid());
		return storedao.deleteStore(storevo);	
	}
	
	@Override
	public int approveStore(storeVO storevo) {
		Timestamp time = new Timestamp(System.currentTimeMillis());
		storevo.setMdfy_dt(time);
		storevo.setVal_yn("Y");
		storevo.setMdfy_id(storevo.getUid());
		return storedao.approveStore(storevo);
	}
	
	@Override
	public int permanentdeleteStore(storeVO storevo) {

		txtVO txtvo = new txtVO();
		
		txtvo.setTxt_id(storevo.getStore_id());

		if (storedao.permanentdeleteStore(storevo) == 1) {
			return txtdao.permanentdeletetxt(txtvo);
		}else {
			return 0; 
		}
	}
	

	



}
