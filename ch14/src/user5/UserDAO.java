package user5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
	private static UserDAO instance = new UserDAO();
	public static UserDAO getInstance() {
		return instance;
	}
	private UserDAO() {}
	
	//DB정보
	private final static String HOST = "jdbc:mysql://localhost:3306/studydb";
	private final static String USER = "root";
	private final static String PASS = "1234";
	
	//CRUD 메서드
	public void insertUser(User5VO vo) {
		String sql = "INSERT INTO `user5` (`name`,`gender`,`age`,`addr`) values(?,?,?,?)";
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getName());
			psmt.setString(2, vo.getGender());
			psmt.setInt(3, vo.getAge());
			psmt.setString(4, vo.getAddr());
			
			psmt.executeUpdate();
			
			psmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public User5VO selectUser(String seq) {
		String sql = "SELECT * FROM `user5` where `seq`=?";
		User5VO user = null;
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, seq);
			ResultSet rs = psmt.executeQuery();
			if(rs.next()) {
				user = new User5VO();
				user.setSeq(rs.getInt(1));
				user.setName(rs.getString(2));
				user.setGender(rs.getString(3));
				user.setAge(rs.getInt(4));
				user.setAddr(rs.getString(5));
			}
			rs.close();
			psmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	
	public List<User5VO> selectuUsers() {
		String sql = "SELECT * FROM `user5`";
		List<User5VO> users = new ArrayList<>();
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				User5VO vo = new User5VO();
				vo.setSeq(rs.getInt(1));
				vo.setName(rs.getString(2));
				vo.setGender(rs.getString(3));
				vo.setAge(rs.getInt(4));
				vo.setAddr(rs.getString(5));
				users.add(vo);
			}
			
			rs.close();
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}
	
	public int updateUser(User5VO vo) {
		String sql = "update `user5` set `name`=?,`gender`=?,`age`=?,`addr`=? where `seq`=?";
		int result =0;
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getName());
			psmt.setString(2, vo.getGender());
			psmt.setInt(3, vo.getAge());
			psmt.setString(4, vo.getAddr());
			psmt.setInt(5, vo.getSeq());
			
			result = psmt.executeUpdate();
			
			psmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
		
	}
	public int deleteUser(String seq) {
		int result = 0;
		String sql = "Delete From `user5` where `seq` = ?";
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, seq);
			
			result= psmt.executeUpdate();
			psmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
