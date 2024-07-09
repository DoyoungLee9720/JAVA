package sub2;

public class Book {
	private String title;
	private String author;
	private String isbn;
	private int availableCopies;
	
	public Book(String title,String author, String isbn, int availableCopies) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.availableCopies = availableCopies;
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getAvailableCopies() {
		return availableCopies;
	}
	public void setAvailableCopies(int availableCopies) {
		this.availableCopies = availableCopies;
	}
	
	public void borrowBook(String surchtitle) {
		if(title == surchtitle && availableCopies>0) {
			availableCopies -=1;
			System.out.println(surchtitle+ "책을 빌렸습니다");
		}
		else {
			System.out.println(surchtitle + "책이 없습니다");
		}
	}

	
	 public boolean borrowBook() {
		 if(availableCopies > 0) {
			 availableCopies--;
			 return true; 
		 } 
		 return false; 
	 }
	 
	public void returnBook(String surchtitle) {
		if(title == surchtitle){
			availableCopies +=1;
			System.out.println(surchtitle + "책을 반납했습니다");	
		}else {
			System.out.println(surchtitle + "책을 빌린적이 없습니다");
		}
		
	}
	public void returnBook() {
		availableCopies++;
	}
	
	public void show() {
		System.out.println("책 제목 : " + title);
		System.out.println("저자 : " + author);
		System.out.println("ISBN번호 : " + isbn);
		System.out.println("이용 가능한 복사본 수 : " + availableCopies);
	}
}
