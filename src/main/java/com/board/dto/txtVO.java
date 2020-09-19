package com.board.dto;

import java.sql.Timestamp;

public class txtVO {
	
	private String txt_id;
	private String txt_content;
	private Timestamp reg_dt;
	private Timestamp mdfy_dt;
	private String reg_id;
	private String mdfy_id;
	
	public String getTxt_id() {
		return txt_id;
	}
	public void setTxt_id(String txt_id) {
		this.txt_id = txt_id;
	}
	public String getTxt_content() {
		return txt_content;
	}
	public void setTxt_content(String txt_content) {
		this.txt_content = txt_content;
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


}
