package com.ihmhny.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author: xiaobei
 * @createTime: 2018-02-03 6:35
 * @since: JDK 1.8
 * @description: Swagger2配置类
 * 我们通过@ApiOperation注解来给API增加说明、
 * 通过@ApiImplicitParams、@ApiImplicitParam注解来给参数增加说明。
 * 启动程序之后可以通过： http://localhost:8080/swagger-ui.html 来访问
 * 页面中不仅展示了所有的接口信息，还可以在页面进行接口调试
 * 在构建RESTful API的同时，加入swagger来对API文档进行管理，是个不错的选择。
 */
@Configuration//表明当前类是一个配置类，Spring启动时会加载该类
@EnableSwagger2//启用Swagger2
public class Swagger2 {


    /**
     * select()函数返回一个ApiSelectorBuilder实例用来控制哪些接口暴露给Swagger来展现，
     * 本例采用指定扫描的包路径来定义，
     * Swagger会扫描该包下所有Controller定义的API，
     * 并产生文档内容（除了被@ApiIgnore指定的请求）。
     * @return
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //指定要生成api文档的扫描路径
                .apis(RequestHandlerSelectors.basePackage("com.ihmhny.demo.web"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 用来创建该Api的基本信息（这些基本信息会展现在文档页面中）
     * 是对整个接口文档的说明
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //大标题
                .title("Spring Boot中使用Swagger2构建RESTful APIs")
                //描述信息，或者叫小标题吧
                .description("这是一个描述")
                .termsOfServiceUrl("www.baidu.com")
                //创建者信息
                .contact("Spring Boot相关")
                //版本信息
                .version("1.0")
                .build();
    }
}
