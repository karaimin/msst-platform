package com.msstp.restapi;

import com.msstp.domain.DomainConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.msstp"})
public class MsstParentApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsstParentApplication.class, args);
	}
}
