package com.example.vaultdemo;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class AppService {
    private final MyConfiguration myConfiguration;

    Logger logger = LoggerFactory.getLogger(VaultDemoApplication.class);

    public AppService(MyConfiguration myConfiguration) {
        this.myConfiguration = myConfiguration;
    }

    @PostConstruct
    public void readConfigs() {
        logger.info("Reading configuration {} - {}", myConfiguration.getToken(), myConfiguration.getUsername());
    }
}
