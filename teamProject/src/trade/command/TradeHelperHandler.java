package trade.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import article.service.TradeArticleService;
import article.service.TradePage;
import mvc.command.CommandHandler;

public class TradeHelperHandler implements CommandHandler {
	private final static String TRADE_LIST = "/view/trade/tradeList.jsp";
	private TradeArticleService tradeService = new TradeArticleService();
	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("트레이드 게시판 핸들러 진입");
		
		String strpageNo = request.getParameter("pageNo");
		
		int pageNo = 1;
		
		if(strpageNo != null) {
			pageNo = Integer.parseInt(strpageNo);
		}
		
		TradePage tradePage = tradeService.getTradeArticlePage(pageNo);
		request.setAttribute("tradePage", tradePage);
		
		return TRADE_LIST;
	}

}
