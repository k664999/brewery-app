//package guru.springframework.msscbrewery.web.config;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//@Configuration
//@EnableSwagger2
//@RequiredArgsConstructor
//public class BeerConfig {
//    private static final String BASE_PACKAGE = "guru.springframework.msscbrewery.web.controller" ;
//
//
//    @Bean
//    public Docket docket () {
//        return new Docket(DocumentationType. SWAGGER_2 )
//                .select()
//                .apis(RequestHandlerSelectors. basePackage ( BASE_PACKAGE ))
//                .build() ;
//    }}
