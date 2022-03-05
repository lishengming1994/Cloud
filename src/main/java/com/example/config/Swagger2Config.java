package com.example.config;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Contact;
import org.reactivestreams.Publisher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.web.reactive.config.WebFluxConfigurer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebFlux;

import java.util.ArrayList;

/**
 * @program:swagger2-webflux
 * @description:swagger配置类
 * @author:lishengming
 * @create:2022/2/12
 */

@Configuration
@EnableOpenApi
public class Swagger2Config {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.OAS_30)
                .globalResponses(HttpMethod.GET, new ArrayList<>())
                .globalResponses(HttpMethod.PUT, new ArrayList<>())
                .globalResponses(HttpMethod.POST, new ArrayList<>())
                .globalResponses(HttpMethod.DELETE, new ArrayList<>())
                .genericModelSubstitutes(Mono.class, Flux.class, Publisher.class)
                .enable(true)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build().apiInfo(apiInfo());
    }

    /**
     * API 页面上半部分展示信息
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Cinder-api接口")
                .description("技术栈: Spring Boot|Web Flux|Swagger")
                .version("1.0")
                .build();
    }
}
