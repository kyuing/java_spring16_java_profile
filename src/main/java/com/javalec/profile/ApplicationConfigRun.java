package com.javalec.profile;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@Configurable
@Profile("run")

//this method is called once the user input is run
public class ApplicationConfigRun {
	
	@Bean
					  /* ID */
	public ServerInfo serverInfo() {
		ServerInfo info = new ServerInfo();
		info.setIp("192.186.210.10");
		info.setPort("80");
		
		return info;
	}
	
	

}
