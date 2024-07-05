package test1;

import java.util.Arrays;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] checkpoint = new int[10];
		int count =0;
		int realcount =0;
		for(int i=0;i<checkpoint.length;i++) {
			checkpoint[i] = (sc.nextInt())%42;
		}
		for(int i=0;i<checkpoint.length;i++) {
			for(int j=i;j<checkpoint.length;j++) {
				if(checkpoint[i]==checkpoint[j]&& i!=j) {
					count++;
				}
			}
			if(count==0) {
				realcount++;
			}
			count=0;
		}
		System.out.println(realcount);
	}
}
