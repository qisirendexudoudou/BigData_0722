package com.atguigu.listener;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


public class MyListener implements HttpSessionListener {

  
    public MyListener() {
        System.out.println("MyListener create!");
    }

	// session一旦创建，执行sessionCreated
    public void sessionCreated(HttpSessionEvent se)  { 
    	
    	 ServletContext application = se.getSession().getServletContext();
        
    	// 从application域中取出count，+1
    	Integer count = (Integer)application.getAttribute("count");
    	
    	if (count==null) {
			
    		application.setAttribute("count", 1);
    		
		}else {
			
			count++;
			
			application.setAttribute("count", count);
		}
    	
    	
    	
    }

	
    // session一旦销毁，执行sessionDestroyed
    public void sessionDestroyed(HttpSessionEvent se)  { 
    	
    	 ServletContext application = se.getSession().getServletContext();
    	 
    	 Integer count = (Integer)application.getAttribute("count");
    	 
    	 count--;

    }
	
}
