package sub1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

/*
	날짜 : 2024/07/18
	이름 : 이도영
	내용 : 파일 입출력 스트림 실습하기
	C:\Users\lotte4\Desktop\sample1.txt
*/
public class FileIOTest {
	public static void main(String[] args) {
		String source = "C:\\Users\\lotte4\\Desktop\\sample1.txt";
		String target = "C:\\Users\\lotte4\\Desktop\\sample2.txt";
		
		try {
			//입력스트림 생성 및 파일 연결
			FileInputStream fis = new FileInputStream(source);
			FileOutputStream fos = new FileOutputStream(target);
			while(true) {
				//파일 읽기
				int data = fis.read();
				if(data == -1) {
					//더이상 읽을 파일 내용이 없을 경우
					break;
				}
				char ch = (char)data;
				//파일 읽은 내용 그대로 출력
				System.out.print((char)data);
				
				//파일 쓰기
				fos.write(data);
			}
			//스트림 해제
			fis.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}
}
