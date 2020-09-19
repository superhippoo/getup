package com.board.dto;

import java.sql.Timestamp;

public class orderVO {
	
	private String order_id;
	private String uid;
	private String author_id;
	private String store_id;
	private String title;
	private String address;
	private String etc_info; 
	private String txt_content;
	private String order_stat;
	private int price;
	private Timestamp reg_dt;
	private Timestamp mdfy_dt;
	private String reg_id;
	private String mdfy_id;
	private String nikname;
	
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getAuthor_id() {
		return author_id;
	}
	public void setAuthor_id(String author_id) {
		this.author_id = author_id;
	}
	public String getStore_id() {
		return store_id;
	}
	public void setStore_id(String store_id) {
		this.store_id = store_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEtc_info() {
		return etc_info;
	}
	public void setEtc_info(String etc_info) {
		this.etc_info = etc_info;
	}
	public String getTxt_content() {
		return txt_content;
	}
	public void setTxt_content(String txt_content) {
		this.txt_content = txt_content;
	}
	public String getOrder_stat() {
		return order_stat;
	}
	public void setOrder_stat(String order_stat) {
		this.order_stat = order_stat;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
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
	public String getNikname() {
		return nikname;
	}
	public void setNikname(String nikname) {
		this.nikname = nikname;
	}


	@Override
	public String toString() {
		return "orderVO [order_id=" + order_id + ", uid=" + uid + ", author_id=" + author_id + ", store_id=" + store_id
				+ ", title=" + title + ", address=" + address + ", etc_info=" + etc_info + ", order_stat=" + order_stat
				+ ", price=" + price + ", reg_dt=" + reg_dt + ", mdfy_dt=" + mdfy_dt + ", reg_id=" + reg_id
				+ ", mdfy_id=" + mdfy_id + "]";
	}


}
