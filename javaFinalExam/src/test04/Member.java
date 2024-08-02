package test04;

public class Member {
	private String name;
	private String memberId;
	Book borrowedBook =null;
	
	public Member(String name, String memberId) {
		this.name = name;
		this.memberId = memberId;
	}
	public void borrowBook(Book book) {
		this.borrowedBook = book;
		borrowedBook.borrowBook();
	}
	public void returnBook(Book book) {
		borrowedBook.returnBook();
		this.borrowedBook = null;
		
	}
	public void getMemberInfo() {
		System.out.println("회원명 : " + name);
		System.out.println("아이디 : " + memberId);
		if(borrowedBook==null)System.out.println("대출한 도서 : 없음");
		else System.out.println("대출한 도서 : " +borrowedBook.getTitle());
		
	}
}
