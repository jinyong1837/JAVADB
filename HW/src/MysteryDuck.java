public class MysteryDuck extends Duck{
	public MysteryDuck() {
		quackBehavior = new MuteQuack();

	    flyBehavior = new FlyNoWay();
	}
	public void display() {
		System.out.println("저는 미스테리 오리입니다");
	}
}
