package ardak;
// ppattern for T
public class patternT {
public static void main(String[] args) {
	 for (int i=1; i<=8;i++) {
		System.out.print("*");
			 
	 }
	 System.out.println();
	 for(int j=1;j<=4;j++) {
		 for(int k=1 ;k<=3;k++) {
			 System.out.print(" ");}
			 for(int l=j ;l>=j;l--) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
	 }
	 
}

