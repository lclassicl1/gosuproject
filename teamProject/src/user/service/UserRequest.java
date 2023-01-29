package user.service;

import java.util.Date;

//사용자가 입력한 회원가입 정보를 저장하는 클래스
public class UserRequest {
	private String user_id; //아이디
	private String user_pwd; //비밀번호
	private String user_repwd; //비밀번호확인
	private String user_name; //이름
	private int user_hp; //휴대폰번호
	private String user_address; //주소
	private String user_email; //이메일
	private String user_gender; //성별
	private String user_skill; //스킬
	private String user_school; //학력
	private int user_birth; // 생년월일
	
	
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
	public String getUser_repwd() {
		return user_repwd;
	}
	public void setUser_repwd(String user_repwd) {
		this.user_repwd = user_repwd;
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
	public String getUser_gender() {
		return user_gender;
	}
	public void setUser_gender(String user_gender) {
		this.user_gender = user_gender;
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
	
	@Override
	public String toString() {
		return "UserRequest [user_id=" + user_id + ", user_pwd=" + user_pwd + ", user_repwd=" + user_repwd
				+ ", user_name=" + user_name + ", user_hp=" + user_hp + ", user_address=" + user_address
				+ ", user_email=" + user_email + ", user_gender=" + user_gender + ", user_skill=" + user_skill
				+ ", user_school=" + user_school + ", user_birth=" + user_birth + "]";
	}
	
	
}
