import java.awt.*;
import javax.swing.*; // * �� �� ����Ѵٴ� �ǹ�.
public class framework extends JFrame{ //JFrame, �� �ֻ��� �����̳ʸ� ��������. JFrame �� ��ӹ޾ƾ� setTitle(), setSize(), setVisible()���� ����� �� �ִ�.
	
	JButton btn1 = new JButton("North");
	JButton btn2 = new JButton("East");
	JButton btn3 = new JButton("West");
	JButton btn4 = new JButton("South");
	JButton btn5 = new JButton("Center");
	
	public framework() {
		//Ÿ��Ʋ �ޱ�.
		this.setTitle("BorderLayout Practice");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x ��ư�� ������ �����.
		
		//���� �����̳ʿ� ������Ʈ ���̱�.
		Container cp =getContentPane(); 
		cp.setLayout(new BorderLayout(50,5)); // ����, ���� ���� ����.
		
		cp.add(btn1, BorderLayout.NORTH);
		cp.add(btn2, BorderLayout.EAST);
		cp.add(btn3, BorderLayout.WEST);
		cp.add(btn4, BorderLayout.SOUTH);
		cp.add(btn5, BorderLayout.CENTER);
		
		
		this.setSize(500,300); //Layout ������ ����.
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new framework();
	}

}
