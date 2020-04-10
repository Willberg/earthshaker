package fun.johntaylor.earthshaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EarthshakerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EarthshakerApplication.class, args);
	}

}
