package ma.emsi.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ma.emsi.todo.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    // You can add custom query methods here if needed
}
