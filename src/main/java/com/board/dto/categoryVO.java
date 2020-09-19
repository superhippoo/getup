package com.board.dto;

import java.sql.Timestamp;

public class categoryVO {
	
	private int category_id;
	private String category_nm;
	private Timestamp reg_dt;
	private Timestamp mdfy_dt;
	private String reg_id;
	private String mdfy_id;

	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public String getCategory_nm() {
		return category_nm;
	}
	public void setCategory_nm(String category_nm) {
		this.category_nm = category_nm;
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
	@Override
	public String toString() {
		return "categoryVO [category_id=" + category_id + ", category_nm=" + category_nm + ", reg_dt=" + reg_dt
				+ ", mdfy_dt=" + mdfy_dt + ", reg_id=" + reg_id + ", mdfy_id=" + mdfy_id + "]";
	}


}
