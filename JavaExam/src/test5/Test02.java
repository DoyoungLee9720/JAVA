package test5;
/*
	날짜 : 2024/08/01
	이름 : 이도영
	내용 : 자바 총정리 연습문제
*/
public class Test02 {
	public static void main(String[] args) {
		int count = 0;
		for(int i = 0; i < 7; i++) {
			if(i<=3) count++;
			else count--;
			
			for(int j=1;j<5-count; j++) {
				System.out.print("☆");
			}
			for(int k=1;k<count*2;k++) {
				System.out.print("★");
			}
			for(int m=1;m<5-count; m++) {
				System.out.print("☆");
			}
			System.out.print("\n");
		}
		System.out.println("\n");
	}
}
