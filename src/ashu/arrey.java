package ashu;

public class arrey {
	public static void main(String[] args) {
		String a []= {"hello","baby","good","morning","have","nice","day"};
	int len= a.length;
	for (int j=0;j<len;j++) {
		String b= a[j];
		int c = b.length();
		for( int d=c-1;d>=0;d--) {
		System.out.print(b.charAt(d));
	}
	

		System.out.println();
	}

}
}