package com.javamaster.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
/*
* WebMvcConfigurerAdapter — этот класс имплементирует интерфейс WebMvcConfigurer,
* которые имеет очень много методов. Из них самые используемые: настройка ресурсов,
* валидации, сообщений (messaging), интерцепторы (interceptors) и другие. */
@Configuration
public class RootConfig extends WebMvcConfigurerAdapter {
}
