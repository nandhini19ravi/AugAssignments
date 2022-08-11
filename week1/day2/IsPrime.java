package week1.day2;

public class IsPrime {
	public static void main(String[] args) {
		int P=4;
		int r =0;
				
		for (int a=2; a<=P;a++) {
			r= P%a;	
			if (r==0) {
					System.out.println(P +"is Prime");
					r=1;
					break;			
			}
			}
			if(r==0) {
				System.out.println(P +"is not Prime");
			
			}
		}
		
}


