import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class guihw1 extends JFrame{
	
	public guihw1() {
		this.setTitle("Ű ������ ������ �ٲ�� �̺�Ʈ �ǽ�");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		Container cp = getContentPane(); //����Ʈ�� �˾Ƴ���.
		cp.setLayout(new FlowLayout()); // FlowLayout ����Ʈ�� ����ϱ�.
		
		cp.setBackground(Color.CYAN);
		
		cp.addKeyListener(new MyKeyListener()); // Ű������ �ޱ�
		
		this.setSize(500,400); //Layout ������ ����.
		this.setVisible(true);
		
		cp.setFocusable(true); // setVisible()�� ����� ������ ����Ǿ���Ѵ�. ����Ʈ���� ���Ž��� ���� �� �ֵ��� ����.
		cp.requestFocus(); // ����Ʈ�ҿ� ��Ŀ�� ���� -> Ű �Է� ��������.   �� �ΰ� �ڵ尡 �־�� ����Ʈ���� Ű�� �Է� ���� �� �ִ�.
	}
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent r) {
			getContentPane().setBackground(Color.RED);
		}
		public void keyReleased(KeyEvent r) {
			getContentPane().setBackground(Color.CYAN);
		}
	}
	
	public static void main(String[] args) {
		new guihw1();
	}

}
