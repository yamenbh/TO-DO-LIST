package ma.emsi.todo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.emsi.todo.entities.TodoList;
import ma.emsi.todo.reporsitory.TodoListRepository;

@Service
public class TodoListService {
	 @Autowired
	    private TodoListRepository todoListRepository;

	    public List<TodoList> getAllTodoLists() {
	        return todoListRepository.findAll();
	    }

	    public Optional<TodoList> getTodoListById(int id) {
	        return todoListRepository.findById(id);
	    }

	    public TodoList saveTodoList(TodoList todoList) {
	        return todoListRepository.save(todoList);
	    }

	    public void deleteTodoList(int id) {
	        todoListRepository.deleteById(id);
	    }

}
