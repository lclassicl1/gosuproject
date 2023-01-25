package article.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import jdbc.conn.ConnectionProvider;
import model.TradeArticle;
import trade.dao.TradeDAO;

public class TradeArticleService {
	private TradeDAO tradeDAO = new TradeDAO();
	private int size = 3; //한페이지당 보여줄 게시글의 수
	
	public TradePage getTradeArticlePage(int pageNo) {
		try {
			Connection conn = ConnectionProvider.getConnection();
			int total = tradeDAO.selectCount(conn);
					
			List<TradeArticle> tradelist = tradeDAO.select(conn, (pageNo - 1) * size, size);
			System.out.println("tradelist"+tradelist);
			
			return new TradePage(total, pageNo, size, tradelist);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}
}
