package org.crazyit.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class JpaApp {

	public static void main(String[] args) {
		new SpringApplicationBuilder(JpaApp.class).run(args);
	}

}
