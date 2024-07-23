package sub2;
/*
	날짜 : 2024/07/22	
	이름 : 이도영
	내용 : 스레드 상태 실습하기
*/
class SubThread extends Thread{
	private String name;
	
	public SubThread() {
		
	}
	public SubThread(String name) {
		this.name = name;
	}
	@Override
	public void run() { // 작업 스레드로 처리할 메서드
        int i = 1;
        try {
            for (;;) {
                System.out.println(i + " " + name + " : SubThread 실행...");
                i++;
                Thread.sleep(1000); // 스레드 1초 대기
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class ThreadInterruptTest {
	public static void main(String[] args) {
		SubThread sub =new SubThread();
		sub.start();
		try {
			Thread.sleep(1000*10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sub.interrupt(); // 작업 스레드 종료
		System.out.println("Main 스레드 종료...");
	}
}





