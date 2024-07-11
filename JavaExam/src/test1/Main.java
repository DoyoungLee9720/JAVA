package test1;
import java.util.Arrays;
import java.io.IOException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException{

        Scanner sc = new Scanner(System.in);

        String S =sc.nextLine();
        char oneword = 'a';
        int[] check = new int[26];
        for(int i=0; i<26;i++) {
        	check[i] = -1;
        }
        for(int i=0; i<S.length();i++) {
        	for(int j=0;j<26;j++) {
        		if(oneword == S.charAt(i)) {
        			if(check[j] == -1) {
        				check[j] = i;
        			}
        		}
        		oneword++;
        	}
        	oneword = 'a';
        }
        for(int i=0;i<26;i++) {
        	System.out.print(check[i] + " ");
        }
    }
}