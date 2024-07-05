package ch04.question;

import java.util.Scanner;

public class q7 {
	public static void main(String[] args) {
		boolean run	= true;
		int money = 0;
		while(run) {
			String checkmoney;
			System.out.println("--------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------");
			System.out.print("선택>");
			Scanner scanner = new Scanner(System.in);
			String select = scanner.nextLine();
			switch(select) {
				case "1": 
					System.out.print("예금액>");
					Scanner scanner2 = new Scanner(System.in);
					checkmoney = scanner2.nextLine();
					money += Integer.parseInt(checkmoney);
					break;
				case "2":
					System.out.print("출금액>");
					Scanner scanner3 = new Scanner(System.in);
					checkmoney = scanner3.nextLine();
					money -= Integer.parseInt(checkmoney);
					break;
				case "3":
					System.out.println("잔고>" + money);
					break;
				case "4":
					System.out.println("시스템 종료");
					run = false;
					break;
				default :
					System.out.println("다시 입력해 주세요");
					break;
			}
		}
	}
}
