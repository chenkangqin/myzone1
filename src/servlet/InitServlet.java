package servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class InitServlet extends HttpServlet {  
	  
    /**  
     */  
    private static final long serialVersionUID = 1L;  
  
    @Override  
    public void init(ServletConfig config) {  
        try {  
            super.init();  
           ServletContext aContext= config.getServletContext();
            aContext.setAttribute("", "");
        } catch (ServletException e) {  
            e.printStackTrace();  
        }  
        System.out.println("================>[Servlet]�Զ�����������ʼ.");  
        // ��ȡSpring�����е�Bean[��ʱBean�Ѽ���,����ʹ��]  
        //ִ����Ҫ�Ĵ���  
        System.out.println("================>[Servlet]�Զ�������������.");  
    }  
}