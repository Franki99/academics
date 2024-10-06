package rw.auca.academics;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import rw.auca.academics.repository.UserRepository;
import rw.auca.academics.model.User;



@SpringBootApplication
public class AcademicsApplication implements CommandLineRunner {

    private final UserRepository userRepository;

    public AcademicsApplication(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(AcademicsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setEmail("test@example.com");
        user.setPassword("password");
        userRepository.save(user);

        System.out.println("User saved: " + userRepository.findByEmail("test@example.com").orElse(null));
    }
}

