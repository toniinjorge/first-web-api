package dio.web.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"dio.web.api.controller", "dio.web.api.repository", "dio.web.api.model", "dio.web.api.doc"})
public class MyFirsWebApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirsWebApiApplication.class, args);
	}

}
