import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class guihw2 extends JFrame {
	
	private JLabel la = new JLabel("Love Java");
	private Font f;
	private int size;
	
	public guihw2() {
		
		
		this.setTitle("+,- Ű�� ��Ʈ Ű��� ���̱� �ǽ�");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		
		cp.addKeyListener(new MyKeyListener()); //Ű������ �ޱ�.
		
		la.setLocation(120,0); //�ʱ� �� ��ġ����.
		la.setFont(new Font("Arial", Font.PLAIN, 15)); // �� ũ��
		
		cp.add(la);
		
		this.setSize(500,400); //Layout ������ ����.
		this.setVisible(true);
		
		cp.setFocusable(true); // setVisible()�� ����� ������ ����Ǿ���Ѵ�. ����Ʈ���� ���Ž��� ���� �� �ֵ��� ����.
		cp.requestFocus(); // ����Ʈ�ҿ� ��Ŀ�� ���� -> Ű �Է� ��������.   �� �ΰ� �ڵ尡 �־�� ����Ʈ���� Ű�� �Է� ���� �� �ִ�.
	}
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			
			f = la.getFont();
			size = f.getSize();
			
			if(e.getKeyChar() == '+') {
				la.setFont(new Font("Arial", Font.PLAIN, size + 5));
			}
			else if(e.getKeyChar() == '-' && size > 10) {
				la.setFont(new Font("Arial", Font.PLAIN, size - 5));       // ����ġ�� �����ϸ� +,- ������� �� ũ�Ⱑ �پ��
			}
		}
	}
	

	public static void main(String[] args) {
		new guihw2();
	}

}
