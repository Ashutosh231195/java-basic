package ardak;



public class ashutosh extends concrte  {

 public void A () {
	 
	 System.out.println('h');
 }
 public  void B() {
	 System.out.println(8);
super.A();
 }
 public static void main (String[] args) {

	 ashutosh Z= new ashutosh();
	 concrte A= ((concrte)Z);
	 double a= 10.29;
	 int b=  ((int)a);
	 System.out.println(b);
	Z.B();
}
}