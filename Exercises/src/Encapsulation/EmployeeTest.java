package Encapsulation;

class Employee {
	private String employeeId;
	private String employeeName;
	private int salary;
	private int bonus;
	private int jobLevel;

	// constructor
	public Employee(String employeeId, String employeeName, int salary, int jobLevel) {

		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
//		this.bonus = bonus;
		this.jobLevel = jobLevel;
	}

	// getters and setters

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeName() {
		return this.employeeName;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getSalary() {
		return this.salary;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public int getBonus() {
		return this.bonus;
	}

	public void setJobLevel(int jobLevel) {
		this.jobLevel = jobLevel;
	}

	public int getJobLevel() {
		return this.jobLevel;
	}

	public void calculateSalary() {
		if (this.jobLevel >= 4) {
			this.bonus = 100;
		} else {
			this.bonus = 50;
		}
		this.salary += this.bonus;

	}
}

public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee = new Employee("C101", "Pavan", 100000, 4);

		employee.calculateSalary();

		System.out.println("Employee Details ");
		System.out.println("======================");
		System.out.println("Employee id      : " + employee.getEmployeeId());
		System.out.println("Employee Name    : " + employee.getEmployeeName());
		System.out.println("Employee salary  : " + employee.getSalary());
		System.out.println("Employee bonus   : " + employee.getBonus());
		System.out.println("Employee jobLevel: " + employee.getJobLevel());
	}
}
