package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tool.sendMailTest;

public class mailservlet extends HttpServlet {

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
		String passwordString=req.getParameter("password");
		if(passwordString.equals("123")){
		String targetmail=new String(req.getParameter("targetmail").getBytes("iso-8859-1"), "utf-8");
		String titleString=new String(req.getParameter("title").getBytes("iso-8859-1"), "utf-8");
		String maintextString=new String(req.getParameter("maintext").getBytes("iso-8859-1"), "utf-8");
		try {
			sendMailTest.sendMail(targetmail, titleString, maintextString);
			req.getRequestDispatcher("/index.jsp").forward(req, resp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}else{
		req.getRequestDispatcher("/mail.jsp").forward(req, resp);
	}
	}
}
