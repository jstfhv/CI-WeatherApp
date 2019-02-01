package at.fhv.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	/**
	* Main entry point to start the spring boot application
	* @param args The command line arguments
	*/
    public static void main(String... args) {
        SpringApplication.run(Application.class, args);
    }
}
