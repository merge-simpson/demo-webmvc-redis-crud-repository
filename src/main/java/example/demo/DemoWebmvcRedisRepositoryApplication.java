package example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "example")
public class DemoWebmvcRedisRepositoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoWebmvcRedisRepositoryApplication.class, args);
    }

}
