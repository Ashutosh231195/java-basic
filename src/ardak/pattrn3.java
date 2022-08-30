package ardak;

public class pattrn3 {
	
	// pattern for 3rd qaudrent
  public  void demo  (){
	  for (int i=6;i>=1;i--){
		  for(int k=5;k>=i;k--) {
			  System.out.print(" ");
		  }
		  
		 for (int j=1;j<=i;j++) {
			 System.out.print("*");
		 }
		 System.out.println();
}
  }
  public static void main(String[] args) {
	  pattrn3 obj=new pattrn3();
	  obj.demo();
}
}
