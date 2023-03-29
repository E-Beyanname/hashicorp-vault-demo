package com.example.vaultdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VaultDemoApplication{

//	private final MyConfiguration configuration;
//
//	public VaultDemoApplication(MyConfiguration configuration) {
//		this.configuration = configuration;
//	}
	public static void main(String[] args) {
		SpringApplication.run(VaultDemoApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		Logger logger = LoggerFactory.getLogger(VaultDemoApplication.class);
//
//		logger.info("----------------------------------------");
//		logger.info("Configuration properties");
//		logger.info("		example.username is {}", configuration.getUsername());
//		logger.info("		example.password is {}", configuration.getPassword());
//		logger.info("----------------------------------------");
//	}
}
