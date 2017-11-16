package servlet;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.shuodao;

public class shuoservlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String shuoString = new String(req.getParameter("shuotext").getBytes("iso-8859-1"), "utf-8"); 
		try {
			if(shuoString.length()>1){
			int a = shuodao.setShuoData(shuoString);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			List<Map<String, String>> shuoList=shuodao.getShuoData();
			System.out.println(shuoList.size());
			HttpSession session= req.getSession();
			session.removeAttribute("shuolist");
			session.setAttribute("shuolist",shuoList);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
      
}
