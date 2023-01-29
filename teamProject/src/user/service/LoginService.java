package user.service;

import java.sql.Connection;
import java.sql.SQLException;

import jdbc.conn.ConnectionProvider;
import model.UserInfo;
import user.dao.UserDAO;

public class LoginService {

	private UserDAO userDAO = new UserDAO();
	
	
	public LoginUser login(String user_id, String user_pwd) {
		Connection conn = null;
		try {
			conn = ConnectionProvider.getConnection();
			UserInfo userInfo = userDAO.selectById(conn, user_id);
			
			//userinfo가 null이면 로그인할때 조회된 ID가 없다는뜻
			if(userInfo == null) {
				throw new LoginFailException();
			}
			
			if(!userInfo.matchPassword(user_pwd)) {
				throw new LoginFailException();
			}
			
			return new LoginUser(userInfo.getUser_id(), userInfo.getUser_name());
			
		} catch (SQLException | LoginFailException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
		
	}
}
