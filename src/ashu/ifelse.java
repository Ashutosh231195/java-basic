package ashu;

public class ifelse {
	public static void main(String[] args) {
		int price=100;
		int discount=30;
		 boolean emi= true;
		 int variety=10;
		 
		   if ( price <=100 && discount>=30 ) {
			  if (emi== true || variety>=20) {
				  System.out.println("i will buy");
			  }
		   }
		   else 
		   {
			   System.out.println("i willnt buy");
		   }
	}

}
