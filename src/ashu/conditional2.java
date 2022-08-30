package ashu;
public class conditional2 {
public static void main(String[] args) {
double a=90;
double b=80;
double c=90;
{
if (a==b && b==c) { 
 System.out.println("equal");
}
if(a==b && b>c)
	{
	System.out.println("A & B are equal an gretter");}	
if(b==c && c>a){
	System.out.println(" B & c are equal and gretter");
}
 if (a>b && b>c) 
 {
	 System.out.println(" A is gretter");
 }
  if (b>c && c>a)
 { 
	 System.out.println(" B is gretter");
 } 
  if (c>b && b>a) {
	 System.out.println(" C is gretter ");
}
}
}}