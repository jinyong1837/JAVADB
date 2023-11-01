import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class guihw2 extends JFrame {
	
	private JLabel la = new JLabel("Love Java");
	private Font f;
	private int size;
	
	public guihw2() {
		
		
		this.setTitle("+,- 키로 폰트 키우고 줄이기 실습");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		
		cp.addKeyListener(new MyKeyListener()); //키리스너 달기.
		
		la.setLocation(120,0); //초기 라벨 위치설정.
		la.setFont(new Font("Arial", Font.PLAIN, 15)); // 라벨 크기
		
		cp.add(la);
		
		this.setSize(500,400); //Layout 사이즈 설정.
		this.setVisible(true);
		
		cp.setFocusable(true); // setVisible()가 실행된 다음에 실행되어야한다. 컨탠트팬이 포거스를 받을 수 있도록 설정.
		cp.requestFocus(); // 컨탠트팬에 포커스 설정 -> 키 입력 가능해짐.   위 두개 코드가 있어야 컨탠트팬이 키를 입력 받을 수 있다.
	}
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			
			f = la.getFont();
			size = f.getSize();
			
			if(e.getKeyChar() == '+') {
				la.setFont(new Font("Arial", Font.PLAIN, size + 5));
			}
			else if(e.getKeyChar() == '-' && size > 10) {
				la.setFont(new Font("Arial", Font.PLAIN, size - 5));       // 스위치로 구현하면 +,- 상관없이 라벨 크기가 줄어듦
			}
		}
	}
	

	public static void main(String[] args) {
		new guihw2();
	}

}
