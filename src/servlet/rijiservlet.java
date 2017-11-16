package servlet;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.rijidao;
import dao.shuodao;

public class rijiservlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String rijiString=new String(req.getParameter("rijitext").getBytes("iso-8859-1"), "utf-8"); 
		String enddate = req.getParameter("rijiend");
		if(rijiString.length()>0){
			try {
				int a=rijidao.setrijiData(rijiString, enddate);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			List<Map<String, String>> rijiList=rijidao.getrijiData();
			System.out.println(rijiList.size());
			HttpSession session= req.getSession();
			session.removeAttribute("rijilist");
			session.setAttribute("rijilist",rijiList);
			System.out.println("TEST"+((List)session.getAttribute("rijilist")).size());
			req.getRequestDispatcher("/riji.jsp").forward(req, resp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(arg0, arg1);
	}
}
