package user4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.Result;


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
	public void insertUser(User4VO vo) {
		String sql = "INSERT INTO `user4` values(?,?,?,?,?,?)";
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, vo.getUid());
			pstm.setString(2, vo.getName());
			pstm.setString(3, vo.getGender());
			pstm.setInt(4, vo.getAge());
			pstm.setString(5, vo.getHp());
			pstm.setString(6, vo.getAddr());
			
			pstm.executeUpdate();

			pstm.close();
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public User4VO selectUser(String uid) {
		String sql = "SELECT * FROM `user4` where `uid`=?";
		User4VO user = null;
		
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, uid);
			ResultSet rst = pstm.executeQuery();
			if(rst.next()) {
				user = new User4VO();
				user.setUid(rst.getString(1));
				user.setName(rst.getString(2));
				user.setGender(rst.getString(3));
				user.setAge(rst.getInt(4));
				user.setHp(rst.getString(5));
				user.setAddr(rst.getString(6));
			}
			rst.close();
			pstm.close();
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
	
	public List<User4VO> selectuUsers() {
		String sql = "SELECT * FROM `user4`";
		List<User4VO> users= new ArrayList<>();
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			Statement pstm = conn.createStatement();
			ResultSet rst = pstm.executeQuery(sql);
			
			while(rst.next()) {
				User4VO vo = new User4VO();
				vo.setUid(rst.getString(1));
				vo.setName(rst.getString(2));
				vo.setGender(rst.getString(3));
				vo.setAge(rst.getInt(4));
				vo.setHp(rst.getString(5));
				vo.setAddr(rst.getString(6));
				users.add(vo);
			}
			rst.close();
			pstm.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}
	
	public int updateUser(User4VO vo) {
		String sql = "update user4 set `name`=?,`gender`=?,`age`=?,`hp`=?,`addr`=? where `uid`=?";
		int result =0;
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, vo.getName());
			pstm.setString(2, vo.getGender());
			pstm.setInt(3, vo.getAge());
			pstm.setString(4, vo.getHp());
			pstm.setString(5, vo.getAddr());
			pstm.setString(6, vo.getUid());
			
			result = pstm.executeUpdate();

			pstm.close();
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	public int deleteUser(String uid) {
		String sql = "Delete From `user4` where `uid`=?";
		int result= 0;
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, uid);
			
			result = psmt.executeUpdate(); 
			psmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
