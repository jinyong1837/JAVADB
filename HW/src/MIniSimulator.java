import java.util.ArrayList;
import java.util.List;

public class MIniSimulator  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Duck mallard = new MallardDuck();
        Duck rubber = new RubberDuck();
        Duck red = new ReadheadDuck();
        Duck dec = new DecoyDuck();
        Duck mod = new ModelDuck();
        Duck mys = new MysteryDuck();
        
    /*    rubber.performFly();
        rubber.performQuack();
        rubber.display();
       
        mallard.display();
        mallard.performQuack(); 
        mallard.performFly(); 
        
        mallard.setFlyBehavior(new FlyNoWay());
        mallard.performFly();  */
        
        List<String> display = new ArrayList<String>();
        List<String> sound = new ArrayList<String>();
        List<String> howtofly = new ArrayList<String>();
        
        display.add("���� �������Դϴ�\n");display.add("���� ���� �Ӹ� �����Դϴ�\n");display.add("���� ���� �����Դϴ�\n");display.add("���� ���� �����Դϴ�\n");display.add("���� �� �����Դϴ�\n");display.add("���� �̽��׸� �����Դϴ�\n");display.add("\n");
        sound.add("��\n");sound.add("��\n");sound.add("��\n");sound.add("<< ����~ >>\n");sound.add("��\n");sound.add("<< ����~ >>\n");sound.add("\n");
        howtofly.add("���� �־��!\n");howtofly.add("���� �־��!!\n");howtofly.add("���� �� ���ƿ�\n");howtofly.add("���� �������� ���ư��ϴ�\n");howtofly.add("���� �� ���ƿ�\n ");howtofly.add("���� �� ���ƿ�\n ");howtofly.add("���� �� ���ƿ�\n ");
        
        

        for(int i =0; i<8; i++) {
        	System.out.println(display.get(i));
        	System.out.println(sound.get(i));
        	System.out.println(howtofly.get(i));
        }
    }


	}
