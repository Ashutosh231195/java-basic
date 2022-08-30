package ashu;
import java.util.Scanner;
public class palindromNo {
	public static void main(String[] args) {
		int actualNo=78577587;
		
		int a= actualNo;
		int rev=0;
		

	while(a>0) {
		int c= a%10;
		a= a/10;

	 rev= rev*10+c;
		System.out.print(c);}
	System.out.println();
	if(rev==actualNo) {
		System.out.println("number is palidrome ");}
		else {
			System.out.println("its not polidrome");
		}
		}
	
		
}

	
	