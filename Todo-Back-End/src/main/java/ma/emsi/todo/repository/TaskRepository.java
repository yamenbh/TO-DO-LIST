package ma.emsi.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ma.emsi.todo.entities.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {
    // You can add custom query methods here if needed
}
