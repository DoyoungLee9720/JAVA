package test05;

public class Subject {
	private String subName;
	private Student[] students = new Student[10];
	private int studentCount = 0;
	
	public Subject(String subName) {
		this.subName = subName;
	}
	public void addStudent(Student student) {
		
		if (studentCount < students.length) {
			students[studentCount] = student;
			studentCount++;
		} else {
			System.out.println("더 이상 학생을 추가할 수 없습니다.");
		}
	}
	public void printSubjectInfo() {
		System.out.println("과목명 : " + subName);
		System.out.print("수강생 : ");
		for(int i=0;i<students.length;i++) {
			if(students[i]!=null)System.out.print(students[i].getName() + " ");
		}
		System.out.println("");
	}
	public String getName(){
		return subName;
	}
}
