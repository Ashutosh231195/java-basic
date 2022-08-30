package ashu;

public class classmaking1 {
		 public void revrstraingle(int k) {
			 for (int j=5;j>=1;j--) {    //     ---- 4th qudrent traingle
					for (int i=1;i<=j;i++) {
				System.out.print("*");}
				System.out.println();
				}
		 }
		 public void traingle(int k) {
				for (int j=1;j<=k;j++) {
					for (int i=1;i<=j;i++) {//    1st qudrent traingle       *
				System.out.print("*");}
					System.out.println();}
		 }
	public static void main(String[] args) {
		classmaking1 obj=new classmaking1();{
			obj.revrstraingle(5);
			obj.traingle(5);
			obj.traingle(5);
			obj.revrstraingle(5);
			obj.traingle(5);
			obj.revrstraingle(5);
			
		}
	}
}

				
			
		