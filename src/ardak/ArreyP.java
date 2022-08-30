package ardak;

public class ArreyP {
	public static void main(String[] args) {
	String [] A= {"i"," ashutosh ","good"," mornig"};
	int ind=A.length-1;
	System.out.println(ind);
	for (int i=ind; i>=0;i-- ) {
String B=A[i];
for (int j=B.length()-1;j>=0;j--) {
char C= B.charAt(j);
System.out.print(C);
}
}
		
	
	
	}

}
