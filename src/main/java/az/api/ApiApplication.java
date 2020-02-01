package az.api;

import az.api.service.EnvironmentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {

    public ApiApplication() {
        // constructor
    }

    public static void main(String[] args) {
        System.setProperty("file.encoding", "UTF-8");
        new EnvironmentService().validateEnvironmentVar();
        SpringApplication.run(ApiApplication.class, args);
    }

}
