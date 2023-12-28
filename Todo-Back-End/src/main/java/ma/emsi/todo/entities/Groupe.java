package ma.emsi.todo.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;


@Entity
public class Groupe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	
	@OneToOne(mappedBy = "groupe")
    private TodoList todoList;
	
	@ManyToMany(mappedBy = "groupes")
    private List<User> users;
	
	@ManyToMany
    @JoinTable(
        name = "SharedTask",
        joinColumns = @JoinColumn(name = "groupe_id"),
        inverseJoinColumns = @JoinColumn(name = "task_id")
    )
    private List<Task> tasks;
	
	
	public Groupe() {
		super();
		// TODO Auto-generated constructor stub
	}

	








	public Groupe(String nom, TodoList todoList, List<User> users, List<Task> tasks) {
		super();
		this.nom = nom;
		this.todoList = todoList;
		this.users = users;
		this.tasks = tasks;
	}










	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}





	public TodoList getTodoList() {
		return todoList;
	}





	public void setTodoList(TodoList todoList) {
		this.todoList = todoList;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}










	public List<Task> getTasks() {
		return tasks;
	}










	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}
	
	
	
	
	
	

}
