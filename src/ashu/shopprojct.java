package ashu;
import java.util.Scanner;
public class shopprojct {
	public void M() {
	int quntity=100;
	Scanner s= new Scanner(System.in);
int a= s.nextInt();

	int stock=quntity-a;
	System.out.println(stock);
	if (stock >=quntity+5) {
		System.out.println("low stock");
		
	}
	
	}
	
	public void mens() {
		String shop[]= {"mens","womens","kids"};
	//	Scanner f=new Scanner(System.in);
	//int x= f.nextInt();
	//System.out.println(x);

	for(int k=0;k<=shop.length-1;k++) {
		
		String Shirts[]= {"casual","formal","t shirts"};
		for(int j=0;j<Shirts.length-1;j++) {
			int Sprice[]= {1000,1500,500};
			int price=Sprice[j];
		
		String C =Shirts[j];
		System.out.println(C);
		System.out.println(price);
	}

}
	}
    public static void main(String[] args) {
    	shopprojct obj= new shopprojct();
    	//obj.mens();
    	obj.M();
    	
    }
	}