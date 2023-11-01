//class Circle{
//		private int radius; // private 으로 설정했을까?
//		public Circle() {this.radius=3;} // 반지름 디폴트값으로 3으로 설정함.
//		public Circle(int radius) {this.radius=radius;}
//		public int getRadius() {return radius;}
//	}	
//class NamedCircle extends Circle{
//		String name;
//		public NamedCircle(int radius,String name) {super(radius); this.name=name;} // NamedCircle(int radius, String name 으로 받아들인 값을 초기화 하는 작업 초기화 = 받은 값으로 설정한다는 의미.
//		public void show() {System.out.print(name+"\t"+"반지름 ="+getRadius());} // 슈퍼클래스에 radius 값을 저장하고 getRadius()으로 불러들인다.
//	}
//	public class exam2 {
//	public static void main(String[] args) {
//		NamedCircle w = new NamedCircle(5,"Waffle");
//		w.show();
//
//	}
//
//}
