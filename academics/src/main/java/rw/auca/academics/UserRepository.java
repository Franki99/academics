package rw.auca.academics;

import org.springframework.data.jpa.repository.JpaRepository;
import rw.auca.academics.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
