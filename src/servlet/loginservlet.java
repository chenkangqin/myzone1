package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.org.apache.bcel.internal.generic.NEW;

import dao.SetIndexData;
import dao.rijidao;
import dao.shuodao;

public class loginservlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		String anserString = new String(req.getParameter("anser").getBytes("iso-8859-1"), "utf-8"); 
		String bString=req.getRemoteAddr();
		
		System.out.println(bString+"ip");
		if (anserString.equals("爱")) {
			HttpSession session=req.getSession();
			try {
				session.setAttribute("initlist",SetIndexData.getMainData());
				session.setAttribute("shuolist",shuodao.getShuoData());
				session.setAttribute("rijilist", rijidao.getrijiData());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			req.getRequestDispatcher("/welcome.jsp").forward(req, resp);
		}else{
			req.setAttribute("notlove","不爱我你就不能查看哦");
			req.getRequestDispatcher("/Login.jsp").forward(req, resp);;
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
