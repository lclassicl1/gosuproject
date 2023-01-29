package user.service;

import java.sql.Connection;
import java.sql.SQLException;

import jdbc.JdbcUtil;
import jdbc.conn.ConnectionProvider;
import model.UserInfo;
import user.dao.UserDAO;

public class RegisterService {
	private UserDAO userDAO = new UserDAO();
	Connection conn = null;
	public void register(UserRequest userReq) {
		try {
			conn = ConnectionProvider.getConnection();
			conn.setAutoCommit(false); //오토커밋 방지
			
			//서비스에서 커넥션과 유저가 입력한 ID를 DAO의 selectByID를 호출하며 넘겨준다
			//selectById는  새 userinfo의 객체를 리턴해준다
			System.out.println("받아온 ID:"+userReq.getUser_id());
			UserInfo userinfo = userDAO.selectById(conn, userReq.getUser_id());
			System.out.println("registerService의 userinfo="+userinfo);
			
			//userinfo가 Null이 아니면 기존에 동일한 id가 있다는뜻
			if(userinfo != null) {
				JdbcUtil.rollback(conn);
				
			}
			
			//클라이언트의 입력값으로 insert를 실행, 수행결과를 int값으로 받음
			int result = userDAO.insert(conn, new UserInfo(userReq.getUser_id(),
												userReq.getUser_pwd(),
												userReq.getUser_name(),
												userReq.getUser_hp(),
												userReq.getUser_address(),
												userReq.getUser_email(),
												userReq.getUser_gender(),
												userReq.getUser_school(),
												userReq.getUser_skill(),
												userReq.getUser_birth()
												));
			
			System.out.println("insert 결과값:"+result);
			//result의 결과값이 있다는건 insert가 성공했다는뜻. commit 실행
			if(result != 0) {
				conn.commit();
			}
			
		} catch (SQLException e) {
			JdbcUtil.rollback(conn);
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn);
		}
		
	}
	
	
	
}
