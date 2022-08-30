package ashu;

public class TryCatch {
	public static void main (String[] args) {
	
	    int a = 0;
	    int  b= 1;
 System.out.print(b*a);
    
 try {
	 System.out.print(b%a);
 }
 catch(Exception c) {
	
	 System.out.println("invallid input");
	
	System.out.println(c.getMessage());
 }
finally {
 System.out.println("thanks");
	}
 System.out.println("over");
}

}

