package ma.emsi.todo.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;


@Entity
@Table(name = "User")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_user;
	
	@Column(nullable = true, name = "firstname", length = 30)
	private String firstname;
	
	@Column(nullable = true, name = "lastname", length = 30)
	private String lastname;
	
	@Column(unique = true, nullable = false, name = "email", length = 60)
	private String email;
	
    @Column(name = "password", nullable = false , length= 100)
    private String password;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "todo_list_id") 
    private TodoList todoList;
    
    @ManyToMany
    private List<Groupe> groupes;
    
    @ManyToMany
    @JoinTable(
        name = "SharedTask",
        joinColumns = @JoinColumn(name = "user_id"),
        inverseJoinColumns = @JoinColumn(name = "task_id")
    )
    private List<Task> tasks;
    

	public User() {
		super();
	}

	

	public User(String firstname, String lastname, String email, String password, TodoList todoList,
			List<Groupe> groupes, List<Task> tasks) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.todoList = todoList;
		this.groupes = groupes;
		this.tasks = tasks;
	}



	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public int getId_user() {
		return id_user;
	}


	public void setId_user(int id_user) {
		this.id_user = id_user;
	}


	public TodoList getTodoList() {
		return todoList;
	}


	public void setTodoList(TodoList todoList) {
		this.todoList = todoList;
	}

	public List<Groupe> getGroupes() {
		return groupes;
	}

	public void setGroupes(List<Groupe> groupes) {
		this.groupes = groupes;
	}



	public List<Task> getTasks() {
		return tasks;
	}



	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}
	
	
	

	



	

	 
}

