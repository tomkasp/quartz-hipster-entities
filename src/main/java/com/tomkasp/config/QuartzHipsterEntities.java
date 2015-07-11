package com.tomkasp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(value = "com.tomkasp")
@EnableJpaRepositories(value = "com.tomkasp")
public class QuartzHipsterEntities {

}
