package com.day.log;


import org.apache.log4j.BasicConfigurator;
//import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrintLog {
	
	//private Logger  log = Logger.getLogger(PrintLog.class);
	private Logger log = LoggerFactory.getLogger(PrintLog.class);
	
	public void printStartLog(){
		
		log.info("打印日志开始！");
		log.debug("打印到文件开始！");
	}
	
	public void printEndLog(){
		log.info("打印日志结束！");
		log.debug("打印到文件结束！");
	}
	public static void main(String[] args) {
		BasicConfigurator.configure ();	//加载默认log4j。properties
		PrintLog log = new PrintLog();
		log.printStartLog();
		log.printEndLog();
		
		
	}
}
