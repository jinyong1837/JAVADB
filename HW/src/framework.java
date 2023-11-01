import java.awt.*;
import javax.swing.*; // * 는 다 사용한다는 의미.
public class framework extends JFrame{ //JFrame, 즉 최상위 컨테이너를 만들어야함. JFrame 을 상속받아야 setTitle(), setSize(), setVisible()들을 사용할 수 있다.
	
	JButton btn1 = new JButton("North");
	JButton btn2 = new JButton("East");
	JButton btn3 = new JButton("West");
	JButton btn4 = new JButton("South");
	JButton btn5 = new JButton("Center");
	
	public framework() {
		//타이틀 달기.
		this.setTitle("BorderLayout Practice");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x 버튼을 누르면 사라짐.
		
		//이제 컨테이너에 컴포넌트 붙이기.
		Container cp =getContentPane(); 
		cp.setLayout(new BorderLayout(50,5)); // 수평, 수직 간격 설정.
		
		cp.add(btn1, BorderLayout.NORTH);
		cp.add(btn2, BorderLayout.EAST);
		cp.add(btn3, BorderLayout.WEST);
		cp.add(btn4, BorderLayout.SOUTH);
		cp.add(btn5, BorderLayout.CENTER);
		
		
		this.setSize(500,300); //Layout 사이즈 설정.
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new framework();
	}

}
