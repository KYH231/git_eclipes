package test.ctrl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.domain.RequestJoinDTO;
import test.service.JoinService;

@WebServlet("/joinUser")
public class JoinController extends HttpServlet {
	
	private JoinService service;
	
	public void init() {
		service = new JoinService();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");

		
		RequestJoinDTO params = new RequestJoinDTO();
		params.setId(id);
		params.setPwd(pwd);
		params.setName(name);
		params.setGender(gender);
		
		
		String resultMessage = service.join(params);
		
		
		request.setAttribute("message", resultMessage);
		
		
		request.getRequestDispatcher("joinOk.jsp").forward(request, response);
	}
}
