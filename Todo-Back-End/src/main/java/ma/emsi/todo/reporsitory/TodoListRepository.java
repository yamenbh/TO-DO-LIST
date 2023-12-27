package ma.emsi.todo.reporsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.emsi.todo.entities.TodoList;

@Repository
public interface TodoListRepository extends JpaRepository<TodoList, Integer>{

}
