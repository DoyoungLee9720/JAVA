package test1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String F1 = sc.next();
        String F2 = sc.next();
        StringBuffer str1 = new StringBuffer(F1);
        F1 = str1.reverse().toString();
        
        StringBuffer str2 = new StringBuffer(F2);
        F2 = str2.reverse().toString();
        
        if(Integer.parseInt(F1)>Integer.parseInt(F2)) {
        	System.out.println(F1);
        }else {
        	System.out.println(F2);
        }
    }
}