package com.domain.swagger;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
        .select()
        .apis(RequestHandlerSelectors.basePackage("com.domain.controllers")) //.any()
        .build()
        .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo(){
        ApiInfo apiInfo = new ApiInfo(
            "My Demo API",
            "Ini adalah demo API dengan SpringBoot oleh KelasKoding",
            "v1.0",
            "Terms of service",
            new Contact("Hendro Steven", "www.kelaskoding.com", "hendo.steven@gmail.com"),
            "Apache License",
            "www.apache.com",
            Collections.emptyList()
        );
        return apiInfo;
    }
}
