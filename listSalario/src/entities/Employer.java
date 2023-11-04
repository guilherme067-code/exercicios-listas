package entities;

public class Employer {

	private int id;
	private String name;
	private Double salary;

	public Employer(int id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	public Double getSalary() {
		return salary;
	}

	

	public String toString() {
		return "employer id=" + id + ", name " + name + ", salary " + salary + "]";
	}
	
	public void increaseSalary(double percente)
	{
		salary+=salary * percente /100.0;
		
		
	}

}
