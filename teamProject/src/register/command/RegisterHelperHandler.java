package register.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.command.CommandHandler;

public class RegisterHelperHandler implements CommandHandler {
	private final static String REGISTER_VIEW = "/view/register/registerForm.jsp";
	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("회원가입 핸들러진입");
		return REGISTER_VIEW;
	}

}
