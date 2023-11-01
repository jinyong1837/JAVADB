import java.awt.*;
import javax.swing.*;
public class framework2 extends JFrame{
	
	/*JButton btn0 = new JButton("0");
	JButton btn1 = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	JButton btn4 = new JButton("4");
	JButton btn5 = new JButton("5");
	JButton btn6 = new JButton("6");
	JButton btn7 = new JButton("7");
	JButton btn8 = new JButton("8");
	JButton btn9 = new JButton("9");*/
	
	public framework2() {
		
	this.setTitle("Ten Color Buttons Frame");
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	Container cp = getContentPane();
	cp.setLayout(new GridLayout(1,10)); // 1행 10열.
	
	JButton [] btn= new JButton[10];
	Color color[]= {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY, Color.PINK, Color.LIGHT_GRAY};
	
/*	cp.add(btn0);cp.add(btn1);cp.add(btn2);
	cp.add(btn3);cp.add(btn4);cp.add(btn5);
	cp.add(btn6);cp.add(btn7);cp.add(btn8);
	cp.add(btn9);
	
	btn0.setBackground(Color.RED);btn1.setBackground(Color.ORANGE);
	btn2.setBackground(Color.YELLOW);btn3.setBackground(Color.GREEN);
	btn4.setBackground(Color.CYAN);btn5.setBackground(Color.BLUE);
	btn6.setBackground(Color.MAGENTA);btn7.setBackground(Color.GRAY);
	btn8.setBackground(Color.PINK);btn9.setBackground(Color.LIGHT_GRAY);*/
	
	for(int i=0;i<10;i++) {
		btn[i] = new JButton(Integer.toString(i)); // 숫자 입력.
		btn[i].setBackground(color[i]);
		cp.add(btn[i]);
	}
	
	this.setSize(500,300); //Layout 사이즈 설정.
	this.setVisible(true);
	
	}
	public static void main(String[] args) {
		new framework2();
	}

}
