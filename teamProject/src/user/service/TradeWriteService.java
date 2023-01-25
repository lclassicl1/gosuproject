package user.service;

import java.sql.Connection;
import java.sql.SQLException;

import jdbc.JdbcUtil;
import jdbc.conn.ConnectionProvider;
import model.TradeArticle;
import trade.dao.TradeDAO;

public class TradeWriteService {
	private TradeDAO tradeDAO = new TradeDAO();
	
	public int write(TradeWriter writer) {
		Connection conn = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			conn.setAutoCommit(false);
			
			TradeArticle tradeArticle = toArticle(writer);
			TradeArticle savedArticle = tradeDAO.insert(conn, tradeArticle);
			
			if(savedArticle == null) {
				throw new RuntimeException("글 작성 실패");
			}
			
			conn.commit();
			
			return savedArticle.getTrade_no();
			
		} catch (SQLException e) {
			JdbcUtil.rollback(conn);
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	
	
	
	private TradeArticle toArticle(TradeWriter writer) {
		
		return new TradeArticle(writer.getTrade_title(), writer.getTrade_content());
	}
	
	
}
