package login.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.command.CommandHandler;

public class LoginHandler implements CommandHandler {
	private final static String LOGIN_VIEW = "/view/login/loginSuccess.jsp";
	private final static String LOGINFORM_VIEW = "/index.jsp";

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("고수 로그인 핸들러 진입");		
		if(request.getMethod().equalsIgnoreCase("get")) {
			System.out.println("get방식");
			return processForm(request, response); //메소드가 get으로 요청되면 수정 폼으로 이동시키는 method
		} else if(request.getMethod().equalsIgnoreCase("post")) {
			System.out.println("post방식");
			return processSubmit(request, response); //메소드가 post로 요청되면 수정처리요청 page로 이동시키는 method
		} else {
			//HttpServletResponse.SC_METHOD_NOT_ALLOWED 상태코드 405(허용되지않는 메소드)
			//요청에 지정된 방법을 사용할수없다
			//예)post 방식으로 요청받는 서버에 get요청한다던지
			//또는 읽기전용소스에 put 요청을한다던지 이런경우에 405 코드를 제공
			response.setStatus(HttpServletResponse.SC_METHOD_NOT_ALLOWED); //error가 없다는 상태코드를 보여주는 메소드
	}
		return null;
	
	}
		
	private String processSubmit(HttpServletRequest request, HttpServletResponse response) {
		return null;
	}

	private String processForm(HttpServletRequest request, HttpServletResponse response) {
			return LOGINFORM_VIEW;
	}



}

	