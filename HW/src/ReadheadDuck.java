public class ReadheadDuck extends Duck {
	public ReadheadDuck() {
		quackBehavior = new Quack();

	    flyBehavior = new FlyNoWay();
	}
	public void display() {
		System.out.println("저는 빨간 머리 오리입니다.");
	}
}
