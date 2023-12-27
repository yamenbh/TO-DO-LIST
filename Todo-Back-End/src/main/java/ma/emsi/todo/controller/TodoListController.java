package ma.emsi.todo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.emsi.todo.entities.TodoList;
import ma.emsi.todo.service.TodoListService;

@RestController
@RequestMapping("/api/todolists")
public class TodoListController {

    @Autowired
    private TodoListService todoListService;

    @GetMapping
    public List<TodoList> getAllTodoLists() {
        return todoListService.getAllTodoLists();
    }

    @GetMapping("/{id}")
    public Optional<TodoList> getTodoListById(@PathVariable int id) {
        return todoListService.getTodoListById(id);
    }

    @PostMapping
    public TodoList saveTodoList(@RequestBody TodoList todoList) {
        return todoListService.saveTodoList(todoList);
    }

    @DeleteMapping("/{id}")
    public void deleteTodoList(@PathVariable int id) {
        todoListService.deleteTodoList(id);
    }
}
