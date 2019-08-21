package com.projectStore.projectStore;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@ComponentScan
@SpringBootApplication
@EnableSwagger2
public class ProjectStoreApplication extends SpringBootServletInitializer {

	private static final Logger log = LogManager.getLogger(ProjectStoreApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ProjectStoreApplication.class, args);
		log.info("\n======================================= APPLICATION STARTED =======================================");
	}

	@Bean
	public PasswordEncoder getPasswordEncoder(){
		return new BCryptPasswordEncoder(4);
	}
}
