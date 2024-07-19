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
	내용 : 내용 : 바이트 배열을 이용한 버퍼 실습하기
*/
public class BufferdStreamTest {
	public static void main(String[] args) {
		String source = "C:\\Users\\lotte4\\Desktop\\workspace.zip";
		String target = "C:\\Users\\lotte4\\Desktop\\workspace3.zip";
		
		//버퍼로 이용한 byte 배열
		byte[] buffer = new byte[1024];//1KB
		
		try {
			//입력스트림 생성 및 파일 연결
			FileInputStream fis = new FileInputStream(source);
			FileOutputStream fos = new FileOutputStream(target);
			
			while(true) {
				//파일 읽기
				int data = fis.read(buffer); // 한번에 1KB 단위로 읽기
				if(data == -1) {
					//더이상 읽을 파일 내용이 없을 경우
					break;
				}
//				char ch = (char)data;
//				//파일 읽은 내용 그대로 출력
//				System.out.print((char)data);
				
				//파일 쓰기
				fos.write(buffer, 0, data);
			}
			
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
