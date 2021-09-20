package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.hanul.test.TestDAO;
import com.hanul.test.TestDTO;
import com.hanul.test.UserDAO;
import com.hanul.test.UserDTO;
import com.hanul.test.planetDTO;




@WebServlet(urlPatterns = { "/home", "/join", "/test", "/result", "/login" })
public class TestController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		TestDAO testDAO = new TestDAO();
		UserDAO userDAO = new UserDAO();
		
		
		
		if (req.getServletPath().equals("/home")) {
			RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
			rd.forward(req, resp);
			
		}else if(req.getServletPath().equals("/join")) {
			
			//아직 미완성
			
		}else if(req.getServletPath().equals("/test")) {
			
			List<TestDTO> list = testDAO.getTestList();
			HttpSession session = req.getSession();
			session.setAttribute("list", list);

			RequestDispatcher rd = req.getRequestDispatcher("jsp/test.jsp");
			rd.forward(req, resp);
	
		}else if(req.getServletPath().equals("/result")){
			planetDTO dto = new planetDTO();
			HttpSession session = req.getSession();
			List<TestDTO> list = (List<TestDTO>) session.getAttribute("list");
			req.setCharacterEncoding("UTF-8");
			int score = 0;
			
			for(int i=1; i<=list.size(); i++){
				if(Integer.parseInt(req.getParameter(i+"")) == 1){
					score+=1;
				}else if(Integer.parseInt(req.getParameter(i+"")) == 2) {
					score+=2;
				}
			}
			List<planetDTO> plList = testDAO.getResult();
			if(score % 5 != 0) {
				dto = plList.get(score % 5);
			}else if(score % 5 == 0) {
				dto = plList.get(0);
			}
			
			req.setAttribute("dto", dto);
			
			RequestDispatcher rd = req.getRequestDispatcher("jsp/result.jsp");
			rd.forward(req, resp);
			
		}else if(req.getServletPath().equals("/login")) {
			HashMap<String, String> map = new HashMap<>();
			map.put("id", req.getParameter("id")+"");
			map.put("pw", req.getParameter("pw")+"");
			
			UserDTO dto = userDAO.member_login(map);
			
			HttpSession session = req.getSession();
			session.setAttribute("logininfo", dto);
			String error = null;	
			
			if(dto == null) {
				error = "아이디 또는 비밀번호가 맞지 않습니다.";
				req.setAttribute("error", error);
			}
			RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
			rd.forward(req, resp);	
			
		}
	}
}
