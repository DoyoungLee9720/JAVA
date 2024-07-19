package test4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/*
	날짜 : 2024/07/19
	이름 : 이도영
	내용 : 자바 파일 입출력 연습문제
*/
public class Test10 {
	public static void main(String[] args) {
		String path = "C:\\Users\\lotte4\\Desktop\\Gugudan.txt";
		try {
			File file = new File(path);
			FileWriter fw = new FileWriter(file);
			for(int x=2;x<=9;x++) {
				fw.write(x + "단\n");
				System.out.println(x + "단");
				for(int y=1;y<=9;y++) {
					int z = x * y;
					fw.write(x + " x "+ y + " = " + z+"\n");
					System.out.println(x + " x "+ y + " = " + z );
				}
			}
			fw.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("구구단 파일생성 완료...");
	}
}
