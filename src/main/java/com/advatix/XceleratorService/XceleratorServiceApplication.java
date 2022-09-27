package com.advatix.XceleratorService;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.List;


@SpringBootApplication
@EnableJpaRepositories("com.advatix.XceleratorService.repository")
@ComponentScan("com")
@EnableSwagger2
@EnableAsync
@PropertySource(ignoreResourceNotFound = true, value = {
		"file:${" + XceleratorServiceApplication.PROPERTIES_LOCATION_ENV + "}/"
				+ XceleratorServiceApplication.APPLICATION_PROPERTY + ".properties",
		"file:${" + XceleratorServiceApplication.PROPERTIES_LOCATION_ENV + "}/"
				+ XceleratorServiceApplication.ERROR_MESSAGES_PROPERTY + ".properties" })

@EnableWebMvc
public class XceleratorServiceApplication {

	public static final String PROPERTIES_LOCATION_ENV = "spring.config.location";
	public static final String APPLICATION_PROPERTY = "xceleratorservice-application";
	public static final String ERROR_MESSAGES_PROPERTY = "xceleratorservice-error";
	protected static final List<String> PROPERTY_FILES = Arrays.asList(APPLICATION_PROPERTY, ERROR_MESSAGES_PROPERTY);
	public static final String PROPERTIES_FILE_NAME = String.join(",", PROPERTY_FILES);
	private static final Logger log = LoggerFactory.getLogger(XceleratorServiceApplication.class);

	public static void main(String[] args) {
		log.info("This is Xcelerator Carrier Integration Xpdel project");
		String configLocation = System.getProperty(XceleratorServiceApplication.PROPERTIES_LOCATION_ENV, "classpath:/");
		if (StringUtils.isNotBlank(configLocation)) {
			ConfigurableApplicationContext applicationContext = new SpringApplicationBuilder(
					XceleratorServiceApplication.class).properties(
							"spring.config.name:" + XceleratorServiceApplication.PROPERTIES_FILE_NAME,
							"spring.config.location:" + XceleratorServiceApplication.PROPERTIES_LOCATION_ENV,
							"spring.config.location:optional:classpath:/,optional:classpath:/config/properties/")
					.build().run(args);
			applicationContext.getEnvironment();
		} else {
			SpringApplication.run(XceleratorServiceApplication.class, args);
		}
	}

}

