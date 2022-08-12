package com.ndnam.ecommerBE.config;

/**
 * @author namnd
 * @created 26/03/2021 - 9:18 AM
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author itsol.hungtt on 1/4/2021
 */
@Configuration
//@EnableWebMvc
public class WebConfig {

    public WebConfig() {
        super();
    }


    /**
     * Bean to define global CORS.
     *
     * @return
     */
//    @Bean
////    public WebMvcConfigurer corsConfigurer() {
////        return new WebMvcConfigurerAdapter() {
////            @Override
////            public void addCorsMappings(CorsRegistry registry) {
////                registry.addMapping("/**").allowedMethods("HEAD", "GET", "PUT", "POST", "DELETE", "PATCH");
////            }
////        };
////    }
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("*")
                        .allowedMethods("GET", "PUT", "POST", "PATCH", "DELETE", "OPTIONS");
            }
        };
    }
}
