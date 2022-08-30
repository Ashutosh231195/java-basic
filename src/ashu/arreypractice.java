package ashu;

public class arreypractice {
public static void main(String[] args) {
	 String a[]= {"hello","evryone","all" ,"the","best"};
	  int b= a.length;
	  for(int j=0;j<=b-1;j++){
	 	
  String c= a[j];
  int d= c.length();
  for (int i=d-1;i>=0;i--) {
	  System.out.print(c.charAt(i));
  }
  
 System.out.println();
}
}}
