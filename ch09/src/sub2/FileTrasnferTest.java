package sub2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
	날짜 : 2024/07/17
	이름 : 이도영
	내용 : 내용 : 파일 메서드를 이용한 파일복사 실습하기
*/
public class FileTrasnferTest {
	public static void main(String[] args) {
		String source = "C:\\Users\\lotte4\\Desktop\\workspace.zip";
		String target = "C:\\Users\\lotte4\\Desktop\\workspace2.zip";
		
		try {
			//입력스트림 생성 및 파일 연결
			FileInputStream fis = new FileInputStream(source);
			FileOutputStream fos = new FileOutputStream(target);
			
			fis.transferTo(fos);
			
			fis.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}
}
