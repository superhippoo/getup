package com.board.svc;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.dao.authorDao;
import com.board.dto.authorVO;

@Service("authorSvc")
public class authotSvcImpl implements authorSvc {
	
	@Autowired
	private authorDao authordao;

	@Override
	public List<authorVO> selectAuthorList(authorVO authorvo) {
		// TODO Auto-generated method stub
		return authordao.selectAuthorList(authorvo);
	}

	@Override
	public List<authorVO> selectAuthor(authorVO authorvo) {
		// TODO Auto-generated method stub
		return authordao.selectAuthor(authorvo);
	}
	

	@Override
	public int insertAuthor(authorVO authorvo) {
		Timestamp time = new Timestamp(System.currentTimeMillis());
		authorvo.setReg_dt(time);
		authorvo.setMdfy_dt(time);
		authorvo.setVal_yn("N");
		return authordao.insertAuthor(authorvo);
	}

	@Override
	public int updateAuthor(authorVO authorvo) {
		Timestamp time = new Timestamp(System.currentTimeMillis());
		authorvo.setMdfy_dt(time);
		return authordao.updateAuthor(authorvo);
	}

	@Override
	public int deleteAuthor(authorVO authorvo) {
		Timestamp time = new Timestamp(System.currentTimeMillis());
		authorvo.setMdfy_dt(time);
		authorvo.setVal_yn("N");
		authorvo.setMdfy_id(authorvo.getUid());
		return authordao.deleteAuthor(authorvo);
	}
	
	@Override
	public int approveAuthor(authorVO authorvo) {
		Timestamp time = new Timestamp(System.currentTimeMillis());
		authorvo.setMdfy_dt(time);
		authorvo.setVal_yn("Y");
		authorvo.setMdfy_id(authorvo.getUid());
		return authordao.approveAuthor(authorvo);
	}
	
	@Override
	public int permanentdeleteAuthor(authorVO authorvo) {
		return authordao.permanentdeleteAuthor(authorvo);
	}

}
