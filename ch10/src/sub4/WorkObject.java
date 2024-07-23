package sub4;

public class WorkObject {
	public synchronized void methodA() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + " : method A 작업 실행");
		notify(); //다른 스레드 실행상태로 전환
		try {
			wait(); //자기 자신을 일시정지 상태로 전환
		} catch (Exception e) {
		}
	}
	public synchronized void methodB() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + " : methodB 작업 실행");
		notify();
		try {
			wait();
		} catch (Exception e) {
		}
	}
}
