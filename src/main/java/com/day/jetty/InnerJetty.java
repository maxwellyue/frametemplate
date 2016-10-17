package com.day.jetty;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class InnerJetty {
	public static void main(String[] args) throws Exception {
		
		Server server = new Server(8888);
		
		WebAppContext context = new WebAppContext();  
		context.setContextPath("/innerJetty");  
        context.setWar("F:/develop/shimh-develop/target/shimh-develop.war");  
        server.setHandler(context);  
  
        server.start();  
        server.join();  
		 
	}
}
