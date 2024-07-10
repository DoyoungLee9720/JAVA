package sub6;
/*
 * 	날짜 : 2024/07/10
 * 	이름 : 이도영
 * 	내용 : 다혀엉 실습하기
 * 
 * */
public class PolyTest {
	public static void main(String[] args) {
		// 다형성 적용된 객체 생성(업캐스팅)
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
		
		a1.move();
		a2.move();
		a3.move();
		
		a1.hunt();
		a2.hunt();
		a3.hunt();
		
		Tiger tiger = (Tiger) a1;
		Eagle eagle = (Eagle) a2;
		Shark shark = (Shark) a3;
		
		tiger.move();
		eagle.move();
		shark.move();
		
		tiger.hunt();
		eagle.hunt();
		shark.hunt();
		
		if(a1 instanceof Tiger) {
			System.out.println("a1은 Tiger 입니다");
			
		}
		if(a2 instanceof Eagle) {
			System.out.println("a2은 Eagle 입니다");
			
		}
		if(a3 instanceof Shark) {
			System.out.println("a3은 Shark 입니다");
		}
		// 다형성을 활용한 객체배열
		Animal arr[] = {tiger,eagle,shark};
		
		for(Animal n : arr) {
			n.move();
			n.hunt();
			System.out.println();
		}
	}
}
