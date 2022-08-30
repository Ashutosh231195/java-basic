package ashu;

public class globalvariable {
	int a=30;
	static int b=20;
	public void java() {
		System.out.print(a);}
	public static void D () 
	{
	int c=10;
		System .out.print(b);}
	public static void main (String[] args) {
		System.out.print(b);
		globalvariable obj= new globalvariable();
		obj.java();
System.out.print(obj.a+ obj.b);

	System.out.print(obj.a);	
	}
}
