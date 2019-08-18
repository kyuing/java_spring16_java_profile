package com.javalec.profile;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@Configurable
@Profile("dev")	

//this method is called once the user input is dev
public class ApplicationConfigDev {

	@Bean
	  				  /* ID */
	public ServerInfo serverInfo() {
		ServerInfo info = new ServerInfo();
		info.setIp("localhost");
		info.setPort("8181");
		
		return info;
	}
}
