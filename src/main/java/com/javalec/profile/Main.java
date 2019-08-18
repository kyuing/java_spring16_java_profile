package com.javalec.profile;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		//setting beans with a profile (java annotation) 
		String config = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an environment type between 'dev' and 'run'.");
		String str = sc.next();
		
		//this is a test so if-statement doesn't do any further conditional test in accuracy 
		if (str.equalsIgnoreCase("dev")) {
			config = "dev";
			
		}else {
			config = "run";
		}
		sc.close();
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.getEnvironment().setActiveProfiles(config);	//dev or run
		ctx.register(ApplicationConfigDev.class, ApplicationConfigRun.class);
		ctx.refresh();
		
		ServerInfo myInfo = ctx.getBean("serverInfo", ServerInfo.class);
		System.out.println("ip: " + myInfo.getIp());
		System.out.println("port: " + myInfo.getPort());

	}

}
