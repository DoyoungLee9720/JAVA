package test08;

public class Employee extends Person{
	private String emplyeeId;
	private String dept;
	private int salary;
	
	public Employee(String name, String birth, String emplyeeId, String dept, int salary) {
		super(name, birth);
		this.emplyeeId = emplyeeId;
		this.dept = dept;
		this.salary = salary;
	}
	public void raiseSalary(int salary) {
		this.salary += salary;
		System.out.println("급여 인상");
	}
	public void changeDept(String dept) {
		this.dept = dept;
	}
	public void printEmployeeInfo() {
		super.printPersonInfo();
		System.out.println("직원 아이디 : " + emplyeeId);
		System.out.println("부서 : " + dept);
		System.out.println("급여 : " + salary);
	}
}
