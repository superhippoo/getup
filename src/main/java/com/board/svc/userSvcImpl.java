package com.board.svc;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.dao.userDao;
import com.board.dto.userVO;
import com.board.util.uidUtil;

@Service("userSvc")
public class userSvcImpl implements userSvc {
	@Autowired
	private userDao userdao;

	@Override
	public List<userVO> selectUserList(userVO uservo) {
		// TODO Auto-generated method stub
		return userdao.selectUserList(uservo);
	}

	@Override
	public userVO selectUser(userVO uservo) {
		// TODO Auto-generated method stub
		return userdao.selectUser(uservo);
	}

	@Override
	public int insertUser(userVO uservo) {
		uservo.setUid(uidUtil.generateUid("U"));
		Timestamp time = new Timestamp(System.currentTimeMillis());
		uservo.setReg_dt(time);
		uservo.setMdfy_dt(time);
		uservo.setVal_yn("Y");
		return userdao.insertUser(uservo);
	}

	@Override
	public int updateUser(userVO uservo) {
		Timestamp time = new Timestamp(System.currentTimeMillis());
		uservo.setMdfy_dt(time);
		return userdao.updateUser(uservo);
	}

	@Override
	public int deleteUser(userVO uservo) {
		Timestamp time = new Timestamp(System.currentTimeMillis());
		uservo.setMdfy_dt(time);
		uservo.setVal_yn("N");
		uservo.setMdfy_id(uservo.getUid());
		return userdao.deleteUser(uservo);	
	}
	
	@Override
	public int approveUser(userVO uservo) {
		Timestamp time = new Timestamp(System.currentTimeMillis());
		uservo.setMdfy_dt(time);
		uservo.setVal_yn("Y");
		uservo.setMdfy_id(uservo.getUid());
		return userdao.approveUser(uservo);
	}
	
	@Override
	public int permanentdeleteUser(userVO uservo) {
		return userdao.permanentdeleteUser(uservo);
	}
	
	@Override
	public userVO login(userVO uservo) {
		
		userVO tempuservo = new userVO(); 		
		tempuservo = userdao.login(uservo);
		
		if (tempuservo.getUid() == null) {// 가입정보가 없으면
			uservo.setUid(uidUtil.generateUid("U"));//신규가입정보세팅
			uservo.setUser_type("U");
			uservo.setVal_yn("Y");
			uservo.setAuth_info(null);			
			Timestamp time = new Timestamp(System.currentTimeMillis());
			uservo.setReg_dt(time);
			uservo.setMdfy_dt(time);
			uservo.setReg_id("system");
			uservo.setMdfy_id("system");
			
			if (userdao.insertUser(uservo)> 0) {//가입성공
				tempuservo = userdao.selectUser(uservo);
				tempuservo.setMessage("regist ok");
				return tempuservo;				
			}else {//가입이 안되면
				tempuservo.setMessage("regist system check reqiured");
				return tempuservo;
			}
			
		}else if(tempuservo.getVal_yn() == "N") {//비활성화 계정
			tempuservo.setMessage("account check required");
			return tempuservo;
		}else {//로그인 성공
			tempuservo.setMessage("login ok");
			return tempuservo;
		}
		
	}
	

	



}
