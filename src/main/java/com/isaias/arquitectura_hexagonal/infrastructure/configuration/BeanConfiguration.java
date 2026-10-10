package com.isaias.arquitectura_hexagonal.infrastructure.configuration;

import com.isaias.arquitectura_hexagonal.application.annotation.UseCase;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(
		basePackages = "com.isaias.arquitectura_hexagonal.application",
		useDefaultFilters = false,
		includeFilters = @ComponentScan.Filter(
				type = FilterType.ANNOTATION,
				classes = UseCase.class
		)
)
public class BeanConfiguration {
}
