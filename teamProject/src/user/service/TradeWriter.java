package user.service;

import java.util.Map;

public class TradeWriter {
	private String user_name;
	private String trade_title;
	private String trade_content;
	private String user_id;
	
	public String getUser_id() {
		return user_id;
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
	
	
	public void validate(Map<String, Boolean> errors) {
		if(trade_title == null || trade_title.trim().isEmpty()) {
			errors.put("errors", Boolean.TRUE);
		}
	}
	
}
