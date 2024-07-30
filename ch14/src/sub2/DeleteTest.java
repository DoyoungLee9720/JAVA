package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteTest {
	public static void main(String[] args) {
		//DB 정보
	    String host="jdbc:mysql://127.0.0.1:3306/studydb"; //<-- 마지막 접속 데이터베이스명
	    String user="root";
	    String pass="1234";

		try {
			//1단계
			Connection conn = DriverManager.getConnection(host,user,pass);
			//2단계
			Statement stmt = conn.createStatement();
			//3단계
			String sql = "Delete from `user1` where `uid` = 'J101'";
			stmt.executeUpdate(sql);
			//4단계
			//5단계
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Delete 완료...");
	}
}
