package ashu;

public class specifire {
	private int a=10;
	int b=20;
	protected int c=30;
     void test() {  
        System.out.print(a);
	}
	void A() {
		System.out.print(b);
			
	}
		protected void max() {
			System.out.print(c);
		}
public static void main (String[] args) {
specifire obj1=new specifire();
obj1.test();
obj1.max();
}
} 