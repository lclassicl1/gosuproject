package user.service;

import java.sql.Connection;
import java.sql.SQLException;

import jdbc.JdbcUtil;
import jdbc.conn.ConnectionProvider;
import model.UserInfo;
import user.dao.UserDAO;

public class RegisterService {
	private UserDAO userDAO = new UserDAO();
	
	public void register(UserRegister userregi) {
		try {
			Connection conn = ConnectionProvider.getConnection();
			conn.setAutoCommit(false); //오토커밋 방지
			UserInfo userinfo = userDAO.selectById(conn, userregi.getUser_id());
			
			if(userinfo == null) {
				JdbcUtil.rollback(conn);
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
}
