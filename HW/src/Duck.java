public abstract class Duck {
	FlyBehavior flyBehavior; // �������̽��� Ȱ���Ͽ� �����ߴ�.
    QuackBehavior quackBehavior; 
    
    public Duck() {}
    
    abstract void display(); // ���� �������� ������� �ٸ��� ������ �������̵��� �ʿ��ϴ�.
    
    public void performFly(){
        flyBehavior.fly();      // Delegate to the behavior class
    }
 
    public void performQuack(){
        quackBehavior.quack();  // Delegate to the behavior class
    }
    
    public void setFlyBehavior (FlyBehavior fb) { // �߰��� ������ �� �� �ִ��� ������ �ٲ��ֱ�����
        this.flyBehavior = fb;
    }
    
    public void setQuackBehavior(QuackBehavior qb) { // �߰��� ������ ���� �Ҹ��� �ٲ��ֱ�����
        this.quackBehavior = qb;
    }

    
   /* public void swim() {
        System.out.println("��� ������ ���� ��ϴ�. ��¥ ������ ����!");
    }
	*/
    public interface QuackBehavior {
    	public void quack(); // �������̽��� ���������ν� Duck �߻�Ŭ�������� QuackBehavior quackBehavior; �� ������ �� �ִ�.
    }
	public class Quack implements QuackBehavior {
		public void quack() {
			System.out.println("��");
		}
	}
	public class MuteQuack implements QuackBehavior {
		public void quack() {
			System.out.println("<< ����>>");
		}
	}
	public class Squeak implements QuackBehavior {
		public void quack() {
			System.out.println("��");
		}
	}
    
    public interface FlyBehavior{
    	public void fly();
    }
	public class FlyWithWings implements FlyBehavior {
		public void fly() {
			System.out.println("���� �־��!!");
		}
	}
	
	public class FlyNoWay implements FlyBehavior {
		public void fly() {
			System.out.println("���� �� ���ƿ�");
		}
	}
	
	public class injuredWings implements FlyBehavior {
		public void fly() {
				System.out.println("���� ������ ���ƽ��ϴ�.");
		}
	}
	public class FlyRocketPowered implements FlyBehavior {

		public void fly() {
			System.out.println("���� �������� ���ư��ϴ�.");
		}
	}

}
