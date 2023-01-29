package user.command;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.command.CommandHandler;
import user.service.RegisterService;
import user.service.UserRequest;

public class RegisterHandler implements CommandHandler {
	private final static String REGISTER_VIEW = "/view/register/registerForm.jsp";
	private final static String REGISTERSUCCESS_VIEW = "/view/register/registerSuccess.jsp";
	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("회원가입 핸들러진입");
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
		return REGISTER_VIEW;
	}
}		
		private String processForm(HttpServletRequest request, HttpServletResponse response) {
			// TODO Auto-generated method stub
			return REGISTER_VIEW;
		}
		
		private String processSubmit(HttpServletRequest request, HttpServletResponse response) {
			System.out.println("registersubmit 진입");
			UserRequest userReq = new UserRequest();
			userReq.setUser_id(request.getParameter("user_id"));
			userReq.setUser_pwd(request.getParameter("user_pwd"));
			userReq.setUser_repwd(request.getParameter("user_repwd"));
			userReq.setUser_name(request.getParameter("user_name"));
			userReq.setUser_hp(Integer.parseInt(request.getParameter("user_hp")));
			userReq.setUser_address(request.getParameter("user_address"));
			userReq.setUser_email(request.getParameter("user_email"));
			userReq.setUser_gender(request.getParameter("user_gender"));
			userReq.setUser_skill(request.getParameter("user_skill"));
			userReq.setUser_school(request.getParameter("user_school"));
			userReq.setUser_birth(Integer.parseInt(request.getParameter("user_birth")));
			
			System.out.println("userReq = "+userReq);
			
			Map<String, Boolean> errors = new HashMap<String,Boolean>();
			request.setAttribute("errors", errors);
			
			//에러가 있을시 회원가입 폼으로 다시 보내준다.
			if(!errors.isEmpty()) {
				return REGISTER_VIEW;
			}
			
			RegisterService resService = new RegisterService();
			
			resService.register(userReq);
			
			return REGISTERSUCCESS_VIEW;
		}
		

}
	
