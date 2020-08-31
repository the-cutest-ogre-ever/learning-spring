package ru.course.spring.swampy.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
@ComponentScan("ru.course.spring.swampy")
public class AppConfig {
}
