package model;

import java.util.Date;

//트레이드 게시판 데이터를 보관하고 있는 클래스
public class TradeArticle {
	private int trade_no;
	private String user_name;
	private String trade_title;
	private String trade_content;
	private Date trade_credate;
	private Date trade_update;
	private int trade_readcnt;
	private String trade_isshow;
	private int user_no;
	
	
	public TradeArticle(int trade_no, String user_name, String trade_title, String trade_content, Date trade_credate, int trade_readcnt) {
		this.trade_no = trade_no;
		this.user_name = user_name;
		this.trade_title = trade_title;
		this.trade_content = trade_content;
		this.trade_credate = trade_credate;
		this.trade_readcnt = trade_readcnt;
	}
	
	
	public TradeArticle(int trade_no, String user_name, String trade_title, String trade_content, Date trade_credate,
			Date trade_update, int trade_readcnt, String trade_isshow, int user_no) {
		this.trade_no = trade_no;
		this.user_name = user_name;
		this.trade_title = trade_title;
		this.trade_content = trade_content;
		this.trade_credate = trade_credate;
		this.trade_update = trade_update;
		this.trade_readcnt = trade_readcnt;
		this.trade_isshow = trade_isshow;
		this.user_no = user_no;
	}
	

	public TradeArticle(String trade_title, String trade_content) {
		this.trade_title = trade_title;
		this.trade_content = trade_content;
	}


	public int getTrade_no() {
		return trade_no;
	}
	public String getUser_name() {
		return user_name;
	}
	public String getTrade_title() {
		return trade_title;
	}
	public String getTrade_content() {
		return trade_content;
	}
	public Date getTrade_credate() {
		return trade_credate;
	}
	public Date getTrade_update() {
		return trade_update;
	}
	public int getTrade_readcnt() {
		return trade_readcnt;
	}
	public String getTrade_isshow() {
		return trade_isshow;
	}
	public int getUser_no() {
		return user_no;
	}
	
	
	
	
}
