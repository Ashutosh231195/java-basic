package ashu;

public class constructor {
private	int b=20;
	constructor (int a) {
		 System.out.println(a);}
	 
    constructor (String f,double d,int k) {
		 System.out.print(""+f+" "+d +" " + k);
    System.out.println();}
   constructor (double z) {
		 System.out.print(z);
	
	 System.out.println();}
	 constructor(int t,int p) {
		 System.out.print(""+t+" " + p);
		}

	
	
public void test (){
	System.out.print("its public method");}

  public static void main(String[] args) {
	  constructor obj=new constructor(30);
	  
	  constructor obj1 =new constructor("nikita",3.09,10);
	  constructor obj2=new constructor(3.00);
	  constructor obj3 =new constructor(8,2);
	 
  }
}