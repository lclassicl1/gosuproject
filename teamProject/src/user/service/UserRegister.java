package user.service;

import java.util.Date;

//회원가입 요청이 들어오면 파라미터값을 저장하여 요청 데이터들을 담는 클래스
public class UserRegister {
	private String user_id;
	private String user_pwd;
	private String user_name;
	private int user_hp;
	private String user_address;
	private String user_email;
	private String user_skill;
	private String user_school;
	private int user_birth;
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_pwd() {
		return user_pwd;
	}
	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public int getUser_hp() {
		return user_hp;
	}
	public void setUser_hp(int user_hp) {
		this.user_hp = user_hp;
	}
	public String getUser_address() {
		return user_address;
	}
	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_skill() {
		return user_skill;
	}
	public void setUser_skill(String user_skill) {
		this.user_skill = user_skill;
	}
	public String getUser_school() {
		return user_school;
	}
	public void setUser_school(String user_school) {
		this.user_school = user_school;
	}
	public int getUser_birth() {
		return user_birth;
	}
	public void setUser_birth(int user_birth) {
		this.user_birth = user_birth;
	}
	
	public UserRegister(String user_id, String user_pwd, String user_name, int user_hp, String user_address,
			String user_email, String user_skill, String user_school, int user_birth) {
		this.user_id = user_id;
		this.user_pwd = user_pwd;
		this.user_name = user_name;
		this.user_hp = user_hp;
		this.user_address = user_address;
		this.user_email = user_email;
		this.user_skill = user_skill;
		this.user_school = user_school;
		this.user_birth = user_birth;
	}
	
	
}
