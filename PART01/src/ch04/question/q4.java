package ch04.question;

public class q4 {
	public static void main(String[] args) {
		int hap = 0;
		while(hap!=5) {
			int dice1 = (int)(Math.random()*6) +1;
			int dice2 = (int)(Math.random()*6) +1;
			hap = dice1 + dice2;
			System.out.println("( " + dice1 + ", " + dice2 + " )");
		}
	}
}
