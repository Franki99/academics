package rw.auca.academics;

import org.springframework.beans.factory.annotation.Autowired;  // Import this
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import rw.auca.academics.repository.UserRepository;
import rw.auca.academics.model.User;
import rw.auca.academics.service.UserService;  // Import your UserService

@SpringBootApplication
public class AcademicsApplication implements CommandLineRunner {

    private final UserRepository userRepository;

    @Autowired
    private UserService userService;  // Add this line

    public AcademicsApplication(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(AcademicsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Test the User registration with password encoding
        User user = new User();
        user.setEmail("secure@example.com");
        user.setPassword("plaintextpassword");
        userService.registerUser(user);  // Use the UserService to register the user

        // Print the registered user to confirm
        System.out.println("User registered: " + userService.findByEmail("secure@example.com").orElse(null));
    }
}
