package com.prueba.grupoasd.test.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.test.context.TestPropertySource;

@Configuration
@ComponentScan({ "com.prueba.grupoasd.dao", "com.prueba.grupoasd.service", "com.prueba.prugpoasd.web" })
@TestPropertySource(value = { "classpath:grupoasd.properties" })
@Lazy
public class AppConfig {

}
