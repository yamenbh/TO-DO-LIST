package ma.emsi.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.emsi.todo.entities.TodoList;

public interface TodoListRepository extends JpaRepository<TodoList, Integer> {
    // You can add custom query methods here if needed
}
