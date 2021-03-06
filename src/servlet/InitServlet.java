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
        System.out.println("================>[Servlet]自动加载启动开始.");  
        // 读取Spring容器中的Bean[此时Bean已加载,可以使用]  
        //执行想要的代码  
        System.out.println("================>[Servlet]自动加载启动结束.");  
    }  
}