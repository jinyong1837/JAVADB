//class Point{
//	private int x,y;
//	public Point (int x, int y) {this.x=x; this.y=y;}
//	public int getX() {return x;} // 
//	public int getY() {return y;}
//	protected void move(int x, int y) {this.x=x; this.y=y;	}
//}
//class ColorPoint extends Point{
//	String color;
//	public ColorPoint(int x,int y,String name) {
//		super(x,y); this.color=color; //����Ŭ������ ��� �����.                
//	}
//	void show() {
//		System.out.println(color+"������"+"("+getX()+","+getY()+")"); //"("+x+","+y+")" ������ �Ұ��� �ϴ�. <-���� 
//	}
//	public void setPoint(int x,int y) {
//		super.move(x, y); // �ٽ� x,y ���� �����ϴϱ�
//	}
//	public void setColor(String color) {
//		 this.color=color;
//	}
//	
//	}
//
//
//public class ex4 {
//	public static void main(String[] args) {
//		ColorPoint cp = new ColorPoint(5,5,"Yellow");
//		cp.setPoint(10,20);
//		cp.setColor("GREEN");
//		cp.show();
//	}
//
//}
