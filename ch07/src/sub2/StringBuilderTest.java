package sub2;
/*
	날짜 : 2024/07/16
	이름 : 이도영
	내용 : 자바 StringBuilderTest 클래스 실습하기
*/
public class StringBuilderTest {
	public static void main(String[] args) {
		//String 불변(immutable) 특성
		String str = "java";
		System.out.println("str 주소 : " + System.identityHashCode(str));
		
		str += "Programming";
		System.out.println("str 주소 : " + System.identityHashCode(str));
		
		System.out.println("str : " + str);
		
		//String의 불면 특성을 개선한 StringBuilder
		StringBuilder sb = new StringBuilder("java");
		System.out.println("sb 주소 : " + System.identityHashCode(sb));
		sb.append("Programming");
		System.out.println("sb 주소 : " + System.identityHashCode(sb));
		System.out.println("sb : " + sb);
	}
}
