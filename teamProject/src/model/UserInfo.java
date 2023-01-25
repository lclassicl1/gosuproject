package model;

import java.util.Date;

//회원 정보를 보관하고 있는 클래스. 
public class UserInfo {
	private int user_no;
	private String user_id;
	private String user_pwd;
	private String user_name;
	private int user_hp;
	private Date user_regdate;
	private String user_address;
	private int user_grade;
	private String user_email;
	private String user_skill;
	private String user_school;
	private int user_birth;
	
	//아이디만 검증
	public UserInfo(String user_id) {
		this.user_id = user_id;
	}
	
	
	public UserInfo(int user_no, String user_id, String user_pwd, String user_name, int user_hp, Date user_regdate,
			String user_address, int user_grade, String user_email, String user_skill, String user_school,
			int user_birth) {
		this.user_no = user_no;
		this.user_id = user_id;
		this.user_pwd = user_pwd;
		this.user_name = user_name;
		this.user_hp = user_hp;
		this.user_regdate = user_regdate;
		this.user_address = user_address;
		this.user_grade = user_grade;
		this.user_email = user_email;
		this.user_skill = user_skill;
		this.user_school = user_school;
		this.user_birth = user_birth;
	}
	
	public int getUser_no() {
		return user_no;
	}
	public String getUser_id() {
		return user_id;
	}
	public String getUser_pwd() {
		return user_pwd;
	}
	public String getUser_name() {
		return user_name;
	}
	public int getUser_hp() {
		return user_hp;
	}
	public Date getUser_regdate() {
		return user_regdate;
	}
	public String getUser_address() {
		return user_address;
	}
	public int getUser_grade() {
		return user_grade;
	}
	public String getUser_email() {
		return user_email;
	}
	public String getUser_skill() {
		return user_skill;
	}
	public String getUser_school() {
		return user_school;
	}
	public int getUser_birth() {
		return user_birth;
	}
	
	
}
