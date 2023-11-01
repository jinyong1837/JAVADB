public class ModelDuck extends Duck{
	public ModelDuck() {
		quackBehavior = new Quack();

	    flyBehavior = new FlyNoWay();
	}
	public void display() {
		System.out.println("저는 모델 오리입니다.");
	}
}
