package com.demo;

import org.activiti.cloud.connectors.starter.configuration.EnableActivitiCloudConnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import com.demo.cloudImpl.slack.ActivitiCloudSlackBot;

@SpringBootApplication
@EnableActivitiCloudConnector
@EnableScheduling
@ComponentScan({"me.ramswaroop.jbot", "com.demo.cloudImpl","org.activiti.cloud.connectors.starter","com.demo","org.activiti.cloud.services.common.security"})
public class SampleActiviti7CloudConnectorApplication {

	@Autowired
    private ActivitiCloudSlackBot bot;
	
	public static void main(String[] args) {
		SpringApplication.run(SampleActiviti7CloudConnectorApplication.class, args);
	}

}
