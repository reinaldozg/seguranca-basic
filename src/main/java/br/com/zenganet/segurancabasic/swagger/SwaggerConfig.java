package br.com.zenganet.segurancabasic.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
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
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(apis()).paths(PathSelectors.any()).build()
				.apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		ApiInfo apiInfo = new ApiInfoBuilder().title("Autenticação básica com Spring Security").description(
				"Este projeto tem como objetivo implementar a segurança basica do Spring Security ")
				.version("1.0.0")
				.contact(new Contact("Reinaldo dos Santos", "reinaldo.developer@outlook.com",
						"reinaldo.santos@live.com"))
				.build();

		return apiInfo;
	}

	private Predicate<RequestHandler> apis() {
		return RequestHandlerSelectors.basePackage("br.com.zenganet.segurancabasic");
	}
}