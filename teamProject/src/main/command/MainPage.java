package main.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.command.CommandHandler;

public class MainPage implements CommandHandler {
	private final static String MAIN_VIEW = "main.jsp";

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		if(request.getMethod().equalsIgnoreCase("get")) {
			System.out.println("메인핸들러 겟방식");
			return null;
		} else if(request.getMethod().equalsIgnoreCase("post")) {
			System.out.println("메인핸들러 포스트방식");
			return MAIN_VIEW;
		}
		
		return null;
	}

}
