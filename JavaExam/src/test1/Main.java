package test1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        boolean check = true;
        Scanner sc = new Scanner(System.in);
        while(check) {
        	
        	String text = sc.next();
        	if(text =="") {
        		check = false;
        	}else {
        		System.out.println(text);	
        	}
        	
        }
    }
}