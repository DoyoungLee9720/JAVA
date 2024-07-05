package ch04.question;

public class q3 {
	public static void main(String[] args) {
		int hap = 0;
		for(int i=1;i<=100;i++) {
			if(i%3==0) hap+=i; 
		}
		System.out.println(hap);
	}
}
