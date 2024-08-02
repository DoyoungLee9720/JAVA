package test01;

public class StudentScore {
	private String studentName;
	private String studentId;
	private String subject;
	private double score;
	public StudentScore(String studentName, String studentId, String subject, double score) {
		this.studentName = studentName;
		this.studentId = studentId;
		this.subject = subject;
		this.score = score;
	}
	public double getScore() {
		return score;
	}
	public void updateScore(double score) {
		if(score>100) {
			System.out.println("잘못된 점수 입력");
		}else {
			System.out.println("점수 수정 완료");
			this.score = score;	
		}
		
	}
	public void printStudentInfo() {
		System.out.println("학생이름 : " + studentName);
		System.out.println("학생ID : " + studentId);
		System.out.println("과목 : " + subject);
		System.out.println("점수 : " + score);
	}
}