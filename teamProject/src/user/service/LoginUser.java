package user.service;


//로그인시 사용자가 입력한 파라미터값을 기준으로 User를 생성하는 클래스
public class LoginUser {
	private String user_id;
	private String user_pwd;
	private String user_name;
	
	public LoginUser(String user_id, String user_name) {
		this.user_id = user_id;
		this.user_pwd = user_name;
	}
	
	public String getUser_id() {
		return user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	
	
}
