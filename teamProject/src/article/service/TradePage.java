package article.service;

import java.util.List;

import model.TradeArticle;

//게시판 페이징 처리하는 클래스
public class TradePage {
	private int total; //전체 게시글수?
	private int currentPage; //현재 페이지
	private List<TradeArticle> article;
	private int totalPage; // 전체 페이지갯수( 전체게시글을 한게시글당보여줄 게시글수로 나누면 전체페이지가 나옴)
	private int startPage; // 시작페이지
	private int endPage; // 끝페이지
	
	public TradePage(int total, int currentPage, int size, List<TradeArticle> article) {
		this.total = total;
		this.currentPage = currentPage;
		this.article = article;
		
		if(total == 0) {
			totalPage = 0;
			startPage = 0;
			endPage = 0;
		} else {
			totalPage = total/size;
			if(total % size > 0) {
				totalPage++;
			}
			
			int modVal = currentPage % 5;
			startPage = currentPage / 5 * 5 + 1;
			if(modVal == 0) {startPage -= 5;}
			
			endPage = startPage + 4;
			if(endPage > totalPage) endPage = totalPage;
		}
		
		
		
	}
	
	
	
	public int getTotal() {
		return total;
	}
	
	public boolean hasNoArticles() {
		return total == 0;
	}
	
	public boolean hasArticles() {
		return total > 0;
	}
	
	public int getCurrentPage() {
		return currentPage;
	}
	
	public int getTotalPage() {
		return totalPage;
	}
	
	public List<TradeArticle> getContent() {
		return article;
	}
	
	public int getStartPage() {
		return startPage;
	}
	
	public int getEndPage() {
		return endPage;
	}
	
}
