package sub4;
/*
	날짜 : 2024/07/22	
	이름 : 이도영
	내용 : 스레드 제어 동기화 실습하기 교제 p617~619

*/
public class ThreadWaitNotifyTest {
	public static void main(String[] args) {
		WorkObject workObject = new WorkObject();
		
		ThreadA threadA = new ThreadA(workObject);
		ThreadB threadB = new ThreadB(workObject);
		
		threadA.start();
		threadB.start();
	}
}
	

