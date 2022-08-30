package ashu;

public class stringadv {
public static void main(String[] args) {
	String a="hello java ";
	String b="Hello Java";
	char c= a.charAt(4);
	System.out.print(c);
	System.out.println();
	int d=a.length();
	System.out.println(d);
   String e= a.substring(0, 4);
   System.out.print(e);
   System.out.println();
    boolean f= a.contains("java");
    System.out.println(f);
   boolean g= a.equalsIgnoreCase(b);
   System.out.print(g);
String h=a.toUpperCase();
System.out.println();
System.out.print(h);
 String i= b.toLowerCase();
		 System.out.println();
 System.out.println(i);
 String j=a.concat (b);
 System.out.println();
 System.out.println(j);
   String k=   a.substring(0,4);
   System.out.print(k);
  // System.out.print();
   System.out.println();
 
 
}
}

