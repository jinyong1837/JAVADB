//class Number{
//		int n;
//		public Number(int n) {this.n=n;}
//	}	
//
//public class exam1 {
//	
//	static void plusTen(Number x) {x.n+=10;}
//	
//public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Number ob = new Number(5);
//		plusTen(ob);
//		System.out.println(ob.n);
//	}
//
//	}
//class Song{
//	
//	String title; // title �ʵ� 
//	
//	public Song(String title) {
//		this.title=title; // getTitle()�� ���� this ��� �������� getTitle()�̶�� �����
//	} 
//	
//	public String getTitle() {
//		return title;
//	} // �޼ҵ�ϱ� ��ȯ���� ����, �Ǽ� , ���� ��� �����ؾ���
//	
//}
//public class exam1 {
//	
//		public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Song mySong= new Song("Nessun Dorma");
//		Song yourSong = new Song("���ִ� �� �� �̷��");
//		System.out.println("�� �뷡�� "+ mySong.getTitle());
//		System.out.println("�� �뷡�� "+ yourSong.getTitle());
//	}
//
//
//import java.util.Scanner;
//
//class Rect{
//	private int width,height;
//	
//	public Rect(int width,int height) {
//		this.width=width;
//		this.height=height;
//	}
//	
//public int getArea() {
//		return width*height;
//	}
//	
//}
//public class exam1 {
//	
//public static void main(String[] args) {
//	
//	Rect[] rect = new Rect[4]; // �迭����      
//	Scanner scan = new Scanner(System.in);
//	
//	int j=1;
//	
//	int sum=0;; //�� �簢�� ���̵��� ������ ���ؾ���
//	
//	for(int i=0; i<rect.length;i++) {
//		System.out.println(j+"�� �ʺ�� ���� >> ");
//		int width = scan.nextInt();
//		int height = scan.nextInt();
//		j++;
//		
//		rect[i]=new Rect(width,height); // ���� ���� ��ü ���� ---> ������ �迭�� ���� ����
//		
//		sum += rect[i].getArea(); //sum �ʱ�ȭ �� ���ְ� �ʱ׷��� ������
//		}
//	
//	
//	System.out.print("�����Ͽ����ϴ�...");
//	System.out.println("�簢���� ��ü ���� " + sum);
//	scan.close();
//	}
//}
//
//
//
//class Circle {
//	private int radius;
//	
//public Circle(int radius) {
//		this.radius = radius;
//	}
//	
//	public int getRadius() {
//		return this.radius;
//	}
//	
//	public void setRadius(int radius) {
//		this.radius = radius;
//	}
//}
//
//class CircleManager {
//	static void copy(Circle src, Circle dest) {
//		dest.setRadius(src.getRadius());
//	}
//	
//	static boolean equals(Circle a, Circle b) {
//		if(a.getRadius() == b.getRadius()) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
//}
//
//public class exam1 {
//	public static void main(String[] args) {
//		Circle pizza = new Circle(5);
//		Circle waffle = new Circle(1);
//		
//		boolean res = CircleManager.equals(pizza, waffle);
//		if(res == true) {
//			System.out.println("pizze�� waffle ũ�� ����");
//		}
//		else {
//		System.out.println("pizza�� waffle ũ�� �ٸ�");
//		}
//		
//		CircleManager.copy(pizza, waffle);
//		res = CircleManager.equals(pizza, waffle);
//		
//		if(res == true) {
//			System.out.println("pizze�� waffle ũ�� ����");
//		}
//		else {
//			System.out.println("pizza�� waffle ũ�� �ٸ�");
//		}
//	}
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
