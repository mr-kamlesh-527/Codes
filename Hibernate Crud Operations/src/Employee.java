import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	// Rules pojo / model/ entity / encapsulated / persist /bean class
	// 1) Default constructor
	// 2) Parameter constructor
	// 3) Getter and Setter method
	// 4) toString - > To get a Data from Object

	
	@Id
	private int id;
	private String name;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	

}
