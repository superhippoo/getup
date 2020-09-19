package com.board.dto;

import java.sql.Timestamp;

public class authorVO {
	
	private String uid;
	private String val_yn;
	private int deal_cnt;
	private String account_add;
	private Timestamp reg_dt;
	private Timestamp mdfy_dt;
	private String reg_id;
	private String mdfy_id;

	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getVal_yn() {
		return val_yn;
	}
	public void setVal_yn(String val_yn) {
		this.val_yn = val_yn;
	}
	public int getDeal_cnt() {
		return deal_cnt;
	}
	public void setDeal_cnt(int deal_cnt) {
		this.deal_cnt = deal_cnt;
	}
	public String getAccount_add() {
		return account_add;
	}
	public void setAccount_add(String account_add) {
		this.account_add = account_add;
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
		return "authorVO [uid=" + uid + ", val_yn=" + val_yn + ", deal_cnt=" + deal_cnt + ", account_add=" + account_add
				+ ", reg_dt=" + reg_dt + ", mdfy_dt=" + mdfy_dt + ", reg_id=" + reg_id + ", mdfy_id=" + mdfy_id + "]";
	}

}
