public class ReadheadDuck extends Duck {
	public ReadheadDuck() {
		quackBehavior = new Quack();

	    flyBehavior = new FlyNoWay();
	}
	public void display() {
		System.out.println("���� ���� �Ӹ� �����Դϴ�.");
	}
}
