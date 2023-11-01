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
//		super(x,y); this.color=color; //슈퍼클래스의 기능 사용함.                
//	}
//	void show() {
//		System.out.println(color+"색으로"+"("+getX()+","+getY()+")"); //"("+x+","+y+")" 형식은 불가능 하다. <-참고 
//	}
//	public void setPoint(int x,int y) {
//		super.move(x, y); // 다시 x,y 값을 설정하니까
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
