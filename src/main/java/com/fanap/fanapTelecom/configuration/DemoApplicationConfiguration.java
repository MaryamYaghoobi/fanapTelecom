package com.fanap.fanapTelecom.configuration;

import com.fanap.fanapTelecom.rest.CommissionRestController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@ComponentScan(basePackages = "com.example.demo")
@EnableSwagger2
public class DemoApplicationConfiguration {
    @Bean
    public Docket samEWalletTransactionInquiryApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("user-info")
                .select()
                .apis(input -> CommissionRestController.class.equals(input.declaringClass()))
                .apis(RequestHandlerSelectors.any())
                .build();
    }
}

