package ashu;

public class mix {
	public void s() {
		for (int j=5;j>=1;j--) {
			for(int i=1;i<=j;i++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		System.out.println();
	}
	public void b() {
		for (int j=1;j<=5;j++ ) { 
			for(int i=1 ;i<=j;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		this.s();
	}
 static int	x=10;static int y=15; static int z=10;
public int add (int x ,int y) {
     this . x=15;
	this. y=50;
	int c=x+y;
	System.out.println(c);
	return c;
}

public static void main(String[] args) {
	mix a=new mix();
	a.s();
	a.b();
	a.add( 30,30);
	System.out.println(a.y);
}
}
