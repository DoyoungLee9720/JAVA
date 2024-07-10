package sub5;

public class Truck extends Car{
	private int capacity;
	public Truck(String name, String color, int speed, int capaccity) {
		super(name,color,speed);
		this.capacity = capaccity;
	}
	@Override
	public void speedUp(int speed) {
		//Truck에 맞게 SpeedUp 메서드 재정의
		this.speed += speed /capacity;
	}
	public void show() {
		System.out.println("차량명 : " + name);
		System.out.println("차량색 : " + color);
		System.out.println("차량속도 : " + speed);
		System.out.println("차량용량 : " + capacity);
	}
}
