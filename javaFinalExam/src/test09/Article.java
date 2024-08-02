package test09;

import java.util.ArrayList;
import java.util.List;

public class Article implements Commentable{
	private int no;
	private String title;
	private String content;
	private User user;
	private List<Comment> comments;
	
	public Article(int no, String title, String content, User user) {
		this.no = no;
		this.title = title;
		this.content = content;
		this.user = user;
		this.comments = new ArrayList<Comment>();
	}
	public int getNo() {
		return no;
	}
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public void addComment(Comment coment) {
		comments.add(coment);
	}
	@Override
	public List<Comment> getComments() {
		return comments;
	}
	
}
