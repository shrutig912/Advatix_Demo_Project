package com.advatix.freightclub;

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
@EnableJpaRepositories("com.advatix.freightclub.repository")
@ComponentScan("com")
@EnableSwagger2
@EnableAsync
@PropertySource(ignoreResourceNotFound = true, value = {
		"file:${" + FreightClubServiceApplication.PROPERTIES_LOCATION_ENV + "}/"
				+ FreightClubServiceApplication.APPLICATION_PROPERTY + ".properties",
		"file:${" + FreightClubServiceApplication.PROPERTIES_LOCATION_ENV + "}/"
				+ FreightClubServiceApplication.ERROR_MESSAGES_PROPERTY + ".properties" })

@EnableWebMvc
public class FreightClubServiceApplication {

	public static final String PROPERTIES_LOCATION_ENV = "spring.config.location";
	public static final String APPLICATION_PROPERTY = "freightclub-application";
	public static final String ERROR_MESSAGES_PROPERTY = "freightclub-error-messages";
	protected static final List<String> PROPERTY_FILES = Arrays.asList(APPLICATION_PROPERTY, ERROR_MESSAGES_PROPERTY);
	public static final String PROPERTIES_FILE_NAME = String.join(",", PROPERTY_FILES);
	private static final Logger log = LoggerFactory.getLogger(FreightClubServiceApplication.class);

	public static void main(String[] args) {
		log.info("This is FreightClub Carrier Integration Xpdel project");
		String configLocation = System.getProperty(FreightClubServiceApplication.PROPERTIES_LOCATION_ENV, "classpath:/");
		if (StringUtils.isNotBlank(configLocation)) {
			ConfigurableApplicationContext applicationContext = new SpringApplicationBuilder(
					FreightClubServiceApplication.class).properties(
							"spring.config.name:" + FreightClubServiceApplication.PROPERTIES_FILE_NAME,
							"spring.config.location:" + FreightClubServiceApplication.PROPERTIES_LOCATION_ENV,
							"spring.config.location:optional:classpath:/,optional:classpath:/config/properties/")
					.build().run(args);
			applicationContext.getEnvironment();
		} else {
			SpringApplication.run(FreightClubServiceApplication.class, args);
		}
	}

}

