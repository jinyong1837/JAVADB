public class MallardDuck extends Duck {
	public MallardDuck() {

		   quackBehavior = new Quack();

	       flyBehavior = new injuredWings();
				// And it uses flyWithWings as its flyBehavior type
	       }

		public void display() {
			System.out.println("���� �������Դϴ�");
		}
	

}