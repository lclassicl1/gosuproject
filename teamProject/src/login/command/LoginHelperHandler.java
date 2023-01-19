package login.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.command.CommandHandler;

public class LoginHelperHandler implements CommandHandler {
	private final static String LOGIN_VIEW = "/view/login/loginSuccess.jsp";

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("고수 로그인 핸들러 진입");		
		return LOGIN_VIEW;
	}
	


}
