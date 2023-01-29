package user.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbc.JdbcUtil;
import model.UserInfo;

public class UserDAO {
	
	//회원가입시 사전에 해당 아이디가 있는지 확인하는 메서드
	public UserInfo selectById(Connection conn, String user_id) {
		StringBuffer sql = new StringBuffer();
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		sql.append("select *"); 
		sql.append(" from userinfo");
		sql.append(" where user_id = ?");
		
		
		try {
			psmt = conn.prepareStatement(sql.toString());
			psmt.setString(1, user_id);
			rs = psmt.executeQuery();
			System.out.println("rs:"+rs);
			
			UserInfo userinfo = null;
			
			
			/* executequery에서 조회된값이 있다면 그 정보를 가지고 새 멤버를 생성 */
			if(rs.next()) {
				userinfo = new UserInfo(
							rs.getInt("user_no"),
							rs.getString("user_id"),
							rs.getString("user_pwd"),
							rs.getString("user_name"),
							rs.getInt("user_hp"),
							rs.getDate("user_regdate"),
							rs.getString("user_address"),
							rs.getInt("user_grade"),
							rs.getString("user_email"),
							rs.getString("user_gender"),
							rs.getString("user_skill"),
							rs.getString("user_school"),
							rs.getInt("user_birth")
						);
			}
			
			return userinfo;
			
		} catch (SQLException e) {
			System.out.println("아이디 검색 실패");
			e.printStackTrace();
			return null;
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(psmt);
		}
		
		
	}
	
	//회원가입 메서드
	public int insert(Connection conn, UserInfo userinfo) throws SQLException {
		StringBuffer sql = new StringBuffer();
		PreparedStatement psmt = null;
		System.out.println("insert 수행하러 왔어요");
		
		sql.append("insert into userinfo(user_id, user_pwd, user_name, user_hp, user_address, user_email, user_gender, user_birth)"); 
		sql.append(" values(?,?,?,?,?,?,?,?)");
		
		psmt = conn.prepareStatement(sql.toString());
		psmt.setString(1, userinfo.getUser_id());
		psmt.setString(2, userinfo.getUser_pwd());
		psmt.setString(3, userinfo.getUser_name());
		psmt.setInt(4, userinfo.getUser_hp());
		psmt.setString(5, userinfo.getUser_address());
		psmt.setString(6, userinfo.getUser_email());
		psmt.setString(7, userinfo.getUser_gender());
		psmt.setInt(8, userinfo.getUser_birth());
		
		int result = psmt.executeUpdate();
		System.out.println("업데이트 행 개수:"+result);
		
		if(result != 0) {
			return result;
		}
		
		return 0;
	}
}
