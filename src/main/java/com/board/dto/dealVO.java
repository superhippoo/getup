package com.board.dto;

public class dealVO {

	private String deal_id;
	private String author_id;
	private String user_id;
	private String deal_yn;

	public String getDeal_id() {
		return deal_id;
	}
	public void setDeal_id(String deal_id) {
		this.deal_id = deal_id;
	}
	public String getAuthor_id() {
		return author_id;
	}
	public void setAuthor_id(String author_id) {
		this.author_id = author_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getDeal_yn() {
		return deal_yn;
	}
	public void setDeal_yn(String deal_yn) {
		this.deal_yn = deal_yn;
	}
	@Override
	public String toString() {
		return "dealVO [deal_id=" + deal_id + ", author_id=" + author_id + ", user_id=" + user_id + ", deal_yn="
				+ deal_yn + "]";
	}


	

}
