package rw.auca.academics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;  // Add this import

@SpringBootApplication
@EnableJpaRepositories(basePackages = "rw.auca.academics")
@EntityScan(basePackages = "rw.auca.academics.model")
public class AcademicsApplication {
    public static void main(String[] args) {
        SpringApplication.run(AcademicsApplication.class, args);
    }
}
