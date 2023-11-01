import java.util.Scanner;
public class thirdHomeWork {

	//메인메소드
	public static void main(String[] args) {
		Scanner sch=new Scanner(System.in);
		System.out.print("학점을 입력하시오>>");
		
		String score=sch.next();
		
		switch(score) {
		
		case "A":
			System.out.print("Excellent!"); break;
		case "B":
			System.out.print("Excellent!"); break;
		case "C":
			System.out.print("Good!"); break;
		case "D":
			System.out.print("Good!"); break;
		case "F":
			System.out.print("Bye!"); break;
		default:
			System.out.print("다시 입력하시오");
		}
		
		sch.close();
	}

}
