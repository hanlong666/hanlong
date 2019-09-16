package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.List;

@Configuration
@EnableSwagger2
public class Swagger2 {

    @Bean
    public Docket createRestApi() {
//        ParameterBuilder tokenPar = new ParameterBuilder();
//        List<Parameter> pars = new ArrayList<Parameter>();
//        tokenPar.name("X-Token").description("令牌").modelRef(new ModelRef("string")).parameterType("header").required(false).build();
//        pars.add(tokenPar.build());
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("女神1.0")//第一栏搜索框
                .genericModelSubstitutes(DeferredResult.class)
                .useDefaultResponseMessages(false)
                .globalResponseMessage(RequestMethod.GET,customerResponseMessage())
//                .globalOperationParameters(pars)
                .forCodeGeneration(true)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.demo.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("女神")
                .description("女神1.0")
                .termsOfServiceUrl("http://www.baidu.cn")//添加网址
                //.contact(new Contact("Michael.chen", "", "chenyongqdu@foxmail.com"))
                //.contact(new Contact("Michael.chen", "", "xiaocong@163.com"))
                .contact("heizi")
                .version("1.0")
                .build();
    }

    /**
     * 自定义返回信息
     * @param
     * @return
     */
    private List<ResponseMessage> customerResponseMessage(){
        return Arrays.asList(
                new ResponseMessageBuilder()//500
                        .code(500)
                        .message("系统繁忙")
                        .responseModel(new ModelRef("Error"))
                        .build(),
                new ResponseMessageBuilder()//401
                        .code(401)
                        .message("未授权访问")
                        .build());
    }


}