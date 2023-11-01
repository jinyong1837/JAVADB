public abstract class Duck {
	FlyBehavior flyBehavior; // 인터페이스를 활용하여 선언했다.
    QuackBehavior quackBehavior; 
    
    public Duck() {}
    
    abstract void display(); // 각각 오리마다 생김새가 다르기 때문에 오버라이딩이 필요하다.
    
    public void performFly(){
        flyBehavior.fly();      // Delegate to the behavior class
    }
 
    public void performQuack(){
        quackBehavior.quack();  // Delegate to the behavior class
    }
    
    public void setFlyBehavior (FlyBehavior fb) { // 중간에 오리가 날 수 있는지 없는지 바꿔주기위함
        this.flyBehavior = fb;
    }
    
    public void setQuackBehavior(QuackBehavior qb) { // 중간에 오리가 내는 소리를 바꿔주기위함
        this.quackBehavior = qb;
    }

    
   /* public void swim() {
        System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠!");
    }
	*/
    public interface QuackBehavior {
    	public void quack(); // 인터페이스를 생성함으로써 Duck 추상클래스에서 QuackBehavior quackBehavior; 을 선언할 수 있다.
    }
	public class Quack implements QuackBehavior {
		public void quack() {
			System.out.println("꽥");
		}
	}
	public class MuteQuack implements QuackBehavior {
		public void quack() {
			System.out.println("<< 조용>>");
		}
	}
	public class Squeak implements QuackBehavior {
		public void quack() {
			System.out.println("삑");
		}
	}
    
    public interface FlyBehavior{
    	public void fly();
    }
	public class FlyWithWings implements FlyBehavior {
		public void fly() {
			System.out.println("날고 있어요!!");
		}
	}
	
	public class FlyNoWay implements FlyBehavior {
		public void fly() {
			System.out.println("저는 못 날아요");
		}
	}
	
	public class injuredWings implements FlyBehavior {
		public void fly() {
				System.out.println("저는 날개를 다쳤습니다.");
		}
	}
	public class FlyRocketPowered implements FlyBehavior {

		public void fly() {
			System.out.println("로켓 추진으로 날아갑니다.");
		}
	}

}

