package listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class ContextInitListener
 *
 */
@WebListener
public class ContextInitListener implements ServletContextListener {

 
    public ContextInitListener() {
       System.out.println("난 서버 시작할때 호출됨~");
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    
    public void contextInitialized(ServletContextEvent sce)  { 
    	ServletContext sc = sce.getServletContext();
    	String contextConfigLication = sc.getInitParameter("contextConfig");
    	System.out.println(contextConfigLication);
    	sc.setAttribute("name", "홍길동");
    	System.out.println("생성자 호출되 호출됨~");
    }
	
}
