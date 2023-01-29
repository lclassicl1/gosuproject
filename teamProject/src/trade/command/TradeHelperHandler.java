package trade.command;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.command.CommandHandler;
import user.service.TradeWriter;

public class TradeHelperHandler implements CommandHandler {
	private final static String TRADE_WRITE_SUCCESS = "/view/trade/tradeList.jsp";
	private final static String TRADE_WRITE_VIEW = "/view/trade/tradeWrite.jsp";
	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		if(request.getMethod().equalsIgnoreCase("get")) {
			System.out.println("트레이드 게시판 글쓰기 핸들러 get방식");
			return processForm(request, response);
		} else if (request.getMethod().equalsIgnoreCase("post")) {
			System.out.println("트레이드 게시판 글쓰기 핸들러 post방식");
			return processSubmit(request, response);
		} else {
			response.setStatus(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
			return TRADE_WRITE_SUCCESS;
		}
		
	}
	private String processForm(HttpServletRequest request, HttpServletResponse response) {
		
		return TRADE_WRITE_VIEW;
	}
	private String processSubmit(HttpServletRequest request, HttpServletResponse response) {
		
		String title = request.getParameter("tradetitle");
		String content = request.getParameter("tradecontent");

		
		Map<String, Boolean> errors = new HashMap<String, Boolean>();
		//세션에 에러 객체 담기
		request.setAttribute("errors", errors);
		
		TradeWriter writer = (TradeWriter) request.getSession(false).getAttribute("authUser");
		
		
		
		return null;
	}
	
	
	

}
