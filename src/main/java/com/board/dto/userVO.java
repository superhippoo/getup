package com.board.dto;

import java.sql.Timestamp;

public class userVO {
	
	private String uid;
	private String nikname;
	private String user_type;
	private String val_yn;
	private String auth_info;
	private Timestamp reg_dt;
	private Timestamp mdfy_dt;
	private String reg_id;
	private String mdfy_id;
	private String message;

	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getNikname() {
		return nikname;
	}
	public void setNikname(String nikname) {
		this.nikname = nikname;
	}
	public String getUser_type() {
		return user_type;
	}
	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}
	public String getVal_yn() {
		return val_yn;
	}
	public void setVal_yn(String val_yn) {
		this.val_yn = val_yn;
	}
	public String getAuth_info() {
		return auth_info;
	}
	public void setAuth_info(String auth_info) {
		this.auth_info = auth_info;
	}
	public Timestamp getReg_dt() {
		return reg_dt;
	}
	public void setReg_dt(Timestamp reg_dt) {
		this.reg_dt = reg_dt;
	}
	public Timestamp getMdfy_dt() {
		return mdfy_dt;
	}
	public void setMdfy_dt(Timestamp mdfy_dt) {
		this.mdfy_dt = mdfy_dt;
	}
	public String getReg_id() {
		return reg_id;
	}
	public void setReg_id(String reg_id) {
		this.reg_id = reg_id;
	}
	public String getMdfy_id() {
		return mdfy_id;
	}
	public void setMdfy_id(String mdfy_id) {
		this.mdfy_id = mdfy_id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {//message Æ÷ÇÔ¾ÈµÊ
		return "userVO [uid=" + uid + ", nikname=" + nikname + ", user_type=" + user_type + ", val_yn=" + val_yn
				+ ", auth_info=" + auth_info + ", reg_dt=" + reg_dt + ", mdfy_dt=" + mdfy_dt + ", reg_id=" + reg_id
				+ ", mdfy_id=" + mdfy_id + "]";
	}

	
}
