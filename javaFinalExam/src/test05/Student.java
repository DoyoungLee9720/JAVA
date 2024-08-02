package test05;

public class Student {
	private String name;
	private String studentId;
	private Subject[] subjects = new Subject[10];
	private int[] scores = new int[10];
	private int subjectCount = 0;
	
	public Student(String name, String studentId) {
		this.name = name;
		this.studentId = studentId;
	}
	public void enrollSubject(Subject subject) {
		if (subjectCount < subjects.length) {
			subjects[subjectCount] = subject;
			subjectCount++;
			subject.addStudent(this);
			System.out.println(name + " - " + subject.getName() + " 과목 신청완료");
		} else {
			System.out.println("더 이상 과목을 추가할 수 없습니다.");
		}
	}
	public void setScore(Subject subject, int score) {
		for(int i =0; i<subjects.length;i++) {
			if(subjects[i]==subject) {
				scores[i] = score;
				System.out.println(name + " - " + subject.getName() + " 점수 입력 완료");
				return;
			}
		}
	}
	public void printStudentInfo() {
		System.out.println("학생명 : " + name);
		System.out.println("아이디 : " + studentId);
		System.out.println("성정");
		for(int i =0;i<subjectCount;i++) {
			System.out.println(" - " + subjects[i].getName() + " : " + scores[i]);
		}
	}
	public String getName() {
		return name;
	}
}
