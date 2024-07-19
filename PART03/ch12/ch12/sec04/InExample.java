package ch12.sec04;

import java.io.IOException;

public class InExample {
	public static void main(String[] args) throws IOException {
		int speed =0;
		int keycode = 0;
		while(true) {
			if(keycode != 13 && keycode != 10) {
				if(keycode == 49) {
					speed++;
				}else if(keycode == 50) {
					speed--;
				}else if (keycode == 51) {
					break;
				}
				System.out.println("----------");
				System.out.println("1. 증속 | 2. 감속 | 3. 중지");
				System.out.println("----------");
				System.out.println("현재 속도 = " + speed);
				System.out.print("선택 : ");
			}
			keycode = System.in.read();
		}
		System.out.println("프로그램 종료");
	}
}
