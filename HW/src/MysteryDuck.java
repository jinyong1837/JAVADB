public class MysteryDuck extends Duck{
	public MysteryDuck() {
		quackBehavior = new MuteQuack();

	    flyBehavior = new FlyNoWay();
	}
	public void display() {
		System.out.println("���� �̽��׸� �����Դϴ�");
	}
}
