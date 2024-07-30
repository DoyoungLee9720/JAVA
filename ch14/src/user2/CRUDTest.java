package user2;

import java.util.List;
import java.util.Scanner;

/*
	날짜 : 2024/07/30
	이름 : 이도영
	내용 : CRUD 실습하기
*/
public class CRUDTest {
	
	public static void main(String[] args) {
		System.out.println("----------------");
		System.out.println("회원 관리 매니저 v1.0");
		System.out.println("----------------");
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("종료:0, 입력:1, 조회:2, 검색:3, 수정:4, 삭제:5");
			System.out.println("선택> ");
			int answer = sc.nextInt();
			
			if(answer ==0) {
				break;
			}else if(answer == 1){
				
				System.out.println("아이디 입력 : ");
				String uid = sc.next();
				
				System.out.println("이름 입력 : ");
				String name = sc.next();
				
				System.out.println("생년월일 입력 : ");
				String birth = sc.next();
				
				System.out.println("주소 입력 : ");
				String addr = sc.next();
				
				
				User2VO vo = new User2VO(uid, name, birth, addr);
				
				UserDAO dao = UserDAO.getInstance();
				dao.insertUser(vo);
				System.out.println("입력완료...");
			}else if(answer == 2){
				UserDAO dao = UserDAO.getInstance();
				List<User2VO> users = dao.selectuUsers();
				for(User2VO user : users) {
					System.out.println(user);
				}
			}else if(answer == 3){
				System.out.println("검색 아이디 : ");
				String searchUid = sc.next();
				
				UserDAO dao = UserDAO.getInstance();
				User2VO user = dao.selectUser(searchUid);
				
				System.out.println(user);
				
			}else if(answer == 4){
				User2VO user = new User2VO();
				
				System.out.println("수정 회원 아이디 입력 : ");
				user.setUid(sc.next());
				
				System.out.println("수정 회원 이름 입력 : ");
				user.setName(sc.next());
				
				System.out.println("수정 회원 생년월일 입력 : ");
				user.setBirth(sc.next());
				
				System.out.println("수정 회원 주소 입력 : ");
				user.setAddr(sc.next());
				
				
				int result = UserDAO.getInstance().updateUser(user);
				
				if(result > 0) {
					System.out.println("수정 완료...");
				}else {
					System.out.println("수정 할 회원 아이디가 없습니다.");
				}
				
			}else if(answer == 5){
				System.out.println("삭제할 아이디 : ");
				String searchUid = sc.next();
				
				int result = UserDAO.getInstance().deleteUser(searchUid);
				
				if(result > 0) {
					System.out.println("수정 완료...");
				}else {
					System.out.println("수정 할 회원 아이디가 없습니다.");
				}
			}
		}//end while
		sc.close();
		System.out.println("프로그램 종료...");
	}//end main
}
