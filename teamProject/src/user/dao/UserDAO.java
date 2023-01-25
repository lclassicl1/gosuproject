package user.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.UserInfo;

public class UserDAO {
	
	//회원가입시 사전에 해당 아이디가 있는지 확인하는 메서드
	public UserInfo selectById(Connection conn, String user_id) {
		StringBuffer sql = new StringBuffer();
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		sql.append("select user_id"); 
		sql.append(" from userinfo");
		sql.append(" where user_id = ?");
		
		
		try {
			psmt = conn.prepareStatement(sql.toString());
			psmt.setString(1, user_id);
			rs = psmt.executeQuery();
			
			UserInfo userinfo = null;
			
			if(rs.next()) {
				userinfo = new UserInfo(user_id);
			}
			
			return userinfo;
			
		} catch (SQLException e) {
			System.out.println("아이디 검색 실패");
			e.printStackTrace();
		}
		
		
		
		return null;
		
	}
	
	public UserInfo insert(Connection conn, UserInfo userinfo) {
	
		
		
		return userinfo;
		
	}
}
