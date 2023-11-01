public class random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rn1;
		int rn2;
		int rn3;
		
		while(true) {
			rn1=(int)(Math.random()*3+1); //1~3까지 나옴.
			rn2=(int)(Math.random()*3+1);
			rn3=(int)(Math.random()*3+1);
			
			System.out.print(rn1+" "+rn2+" "+rn3+"\n");
			
			if(rn1==rn2&&rn2==rn3) break;
			
		}
		System.out.print("성공");
	}

}
