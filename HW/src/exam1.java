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
//	String title; // title 필드 
//	
//	public Song(String title) {
//		this.title=title; // getTitle()을 위한 this 사용 문제에서 getTitle()이라고 명시함
//	} 
//	
//	public String getTitle() {
//		return title;
//	} // 메소드니까 반환형식 정수, 실수 , 문자 등등 정의해야함
//	
//}
//public class exam1 {
//	
//		public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Song mySong= new Song("Nessun Dorma");
//		Song yourSong = new Song("공주는 잠 못 이루고");
//		System.out.println("내 노래는 "+ mySong.getTitle());
//		System.out.println("네 노래는 "+ yourSong.getTitle());
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
//	Rect[] rect = new Rect[4]; // 배열생성      
//	Scanner scan = new Scanner(System.in);
//	
//	int j=1;
//	
//	int sum=0;; //각 사각형 넓이들의 총합을 구해야함
//	
//	for(int i=0; i<rect.length;i++) {
//		System.out.println(j+"의 너비와 높이 >> ");
//		int width = scan.nextInt();
//		int height = scan.nextInt();
//		j++;
//		
//		rect[i]=new Rect(width,height); // 베열 원소 객체 생성 ---> 생성한 배열에 값을 저장
//		
//		sum += rect[i].getArea(); //sum 초기화 꼭 해주고 않그러면 오류뜸
//		}
//	
//	
//	System.out.print("저장하였습니다...");
//	System.out.println("사각형의 전체 합은 " + sum);
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
//			System.out.println("pizze와 waffle 크기 같음");
//		}
//		else {
//		System.out.println("pizza와 waffle 크기 다름");
//		}
//		
//		CircleManager.copy(pizza, waffle);
//		res = CircleManager.equals(pizza, waffle);
//		
//		if(res == true) {
//			System.out.println("pizze와 waffle 크기 같음");
//		}
//		else {
//			System.out.println("pizza와 waffle 크기 다름");
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
