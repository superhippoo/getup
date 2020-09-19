package com.board.dto;

import java.sql.Timestamp;

public class storeVO {

	private String store_id;
	private String val_yn;
	private String uid;
	private int catetory_id;
	private String title;
	private int price;
	private int work_period;
	private String summary;
	private String sam1;
	private String sam2;
	private String sam3;
	private String sam4;
	private String txt_content;
	private String keyword;
	private Timestamp reg_dt;
	private Timestamp mdfy_dt;
	private String reg_id;
	private String mdfy_id;
	
	public String getStore_id() {
		return store_id;
	}
	public void setStore_id(String store_id) {
		this.store_id = store_id;
	}
	public String getVal_yn() {
		return val_yn;
	}
	public void setVal_yn(String val_yn) {
		this.val_yn = val_yn;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public int getCatetory_id() {
		return catetory_id;
	}
	public void setCatetory_id(int catetory_id) {
		this.catetory_id = catetory_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getWork_period() {
		return work_period;
	}
	public void setWork_period(int work_period) {
		this.work_period = work_period;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getSam1() {
		return sam1;
	}
	public void setSam1(String sam1) {
		this.sam1 = sam1;
	}
	public String getSam2() {
		return sam2;
	}
	public void setSam2(String sam2) {
		this.sam2 = sam2;
	}
	public String getSam3() {
		return sam3;
	}
	public void setSam3(String sam3) {
		this.sam3 = sam3;
	}
	public String getSam4() {
		return sam4;
	}
	public void setSam4(String sam4) {
		this.sam4 = sam4;
	}
	public String getTxt_content() {
		return txt_content;
	}
	public void setTxt_content(String txt_content) {
		this.txt_content = txt_content;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
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
		return "storeVO [store_id=" + store_id + ", val_yn=" + val_yn + ", uid=" + uid + ", catetory_id=" + catetory_id
				+ ", title=" + title + ", price=" + price + ", work_period=" + work_period + ", sam1=" + sam1
				+ ", sam2=" + sam2 + ", sam3=" + sam3 + ", sam4=" + sam4 + ", reg_dt=" + reg_dt + ", mdfy_dt=" + mdfy_dt
				+ ", reg_id=" + reg_id + ", mdfy_id=" + mdfy_id + "]";
	}

}
