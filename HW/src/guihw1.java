import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class guihw1 extends JFrame{
	
	public guihw1() {
		this.setTitle("키 누르면 배경색이 바뀌는 이벤트 실습");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		Container cp = getContentPane(); //컨텐트팬 알아내기.
		cp.setLayout(new FlowLayout()); // FlowLayout 디폴트값 사용하기.
		
		cp.setBackground(Color.CYAN);
		
		cp.addKeyListener(new MyKeyListener()); // 키리스너 달기
		
		this.setSize(500,400); //Layout 사이즈 설정.
		this.setVisible(true);
		
		cp.setFocusable(true); // setVisible()가 실행된 다음에 실행되어야한다. 컨탠트팬이 포거스를 받을 수 있도록 설정.
		cp.requestFocus(); // 컨탠트팬에 포커스 설정 -> 키 입력 가능해짐.   위 두개 코드가 있어야 컨탠트팬이 키를 입력 받을 수 있다.
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
