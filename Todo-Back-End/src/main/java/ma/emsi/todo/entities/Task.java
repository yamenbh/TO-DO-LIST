package ma.emsi.todo.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Task")
public class Task {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private Date startDate;
	private Date endDate;
	private String status;
	
	@ManyToOne
    @JoinColumn(name = "todo_list_id") // Assuming there's a column in the Task table to hold the TodoList ID
    private TodoList todoList;
	
	@ManyToMany(mappedBy = "tasks")
    private List<User> users;

    @ManyToMany(mappedBy = "tasks")
    private List<Groupe> groupes;
	
	public Task() {
		super();
	}

	
	



	public Task(String name, Date startDate, Date endDate, String status, TodoList todoList, List<User> users,
			List<Groupe> groupes) {
		super();
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.status = status;
		this.todoList = todoList;
		this.users = users;
		this.groupes = groupes;
	}






	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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






	public List<Groupe> getGroupes() {
		return groupes;
	}






	public void setGroupes(List<Groupe> groupes) {
		this.groupes = groupes;
	}
	
	
	


}
