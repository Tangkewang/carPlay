package com.fl.aigentdata.system.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {
    /**
     * 配置RestTemplate模板
     */
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
