package trade.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jdbc.JdbcUtil;
import model.TradeArticle;

//Trade 게시판의 데이터를 가지고 있는 DAO 클래스
public class TradeDAO {
	
	public int selectCount(Connection conn) {
		PreparedStatement psmt = null;
		ResultSet rs = null;
		StringBuffer sql = new StringBuffer();
		
		
		
		try {
			// 전체 게시글의 수를 가져오는 쿼리문
			sql.append("select count(*)"); 
			sql.append(" from tradeboard");
			
			psmt = conn.prepareStatement(sql.toString());
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				return rs.getInt(1);
			}
			
			return 0;
		} catch (SQLException e) {
			System.out.println("게시글수 조회 실패");
			e.printStackTrace();
			return 0;
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(psmt);
		}
		
	}
	
	public List<TradeArticle> select(Connection conn, int startRow, int size) {
		PreparedStatement psmt = null;
		ResultSet rs = null;
		StringBuffer sql = new StringBuffer();
		sql.append("select trade_no, user_name, trade_title, trade_content, trade_credate, trade_readcnt"); 
		sql.append(" from tradeboard"); 
		sql.append(" where isshow = 'Y'"); 
		sql.append(" order by trade_credate desc limit ?,?");
		
		try {
			psmt = conn.prepareStatement(sql.toString());
			psmt.setInt(1, startRow);
			psmt.setInt(2, size);
			rs = psmt.executeQuery();
			System.out.println("rs는:"+rs);
			List<TradeArticle> tradeArticle = new ArrayList<TradeArticle>();
			
			while(rs.next()) {
				tradeArticle.add(convertArticle(rs));
			}
			
			return tradeArticle;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return null;
		
	}

	private TradeArticle convertArticle(ResultSet rs) {
		try {
			int no = rs.getInt("trade_no");
			String name = rs.getString("user_name");
			String title = rs.getString("trade_title");
			String content = rs.getString("trade_content");
			Date credate = rs.getDate("trade_credate");
			int readcnt = rs.getInt("trade_readcnt");
			
			return new TradeArticle(no, name, title, content, credate, readcnt); 
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
		
		
	}
	
	public TradeArticle insert(Connection conn, TradeArticle article) {
		PreparedStatement psmt = null;
		StringBuffer sql = new StringBuffer();
		ResultSet rs = null;
		
		sql.append("insert into tradeboard(user_name, trade_title, trade_content, user_no)"); 
		sql.append(" values(?,?,?,?)");
		
		
		
		try {
			psmt = conn.prepareStatement(sql.toString());
			psmt.setString(1, article.getUser_name());
			psmt.setString(2, article.getTrade_title());
			psmt.setString(3, article.getTrade_content());
			psmt.setInt(4, article.getUser_no());
			
			int result = psmt.executeUpdate();
			
			if(result > 0) {
				rs = psmt.executeQuery("select last_insert_id() from tradeboard");
				
				if(rs.next()) {
					int newNum = rs.getInt(1);
					return new TradeArticle(newNum, article.getUser_name(), article.getTrade_title(), article.getTrade_content(), article.getTrade_credate(), article.getTrade_readcnt());
				}
			}
			
			return null;
		} catch (SQLException e) {
			
			e.printStackTrace();
			return null;
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(psmt);
			JdbcUtil.close(conn);
		}
	}

}
