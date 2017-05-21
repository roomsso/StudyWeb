package hoge;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ItemServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req,resp);
	}

	private void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		
		String status = req.getParameter("status");
		if(status == null){
			init(req, resp);
		}
	}
	
	private void init(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		req.setAttribute("kenList", StudyUtils.getKenList());
		
		req.getRequestDispatcher("/WEB-INF/jsp/profile_input.jsp").forward(req, resp);
	}
}