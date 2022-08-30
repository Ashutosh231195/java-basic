package ardak;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class collection {
 public static void main(String[] args) {
	 
	 
	 
	 ArrayList<String> li= new ArrayList();
	 li.add("ashutosh");
	li.add("22");
	li.add("12.34");
	li.add("a");
	li.remove(2);
	System.out.println(li.get(1));
	System.out.println(li.get(2));
	   
LinkedList<Comparable> ll= new LinkedList<Comparable>();	
	ll.add(null);
	ll.add(null);
	ll.add(22);
	ll.add("ashu");
	ll.add(12.34);
	System.out.println(ll.get(1));
	System.out.println(ll.get(2));
	System.out.println(ll.get(4));
	System.out.println(ll.get(3));
	System.out.println(ll.get(0));
	System.out.println(li.get(2));
	
	HashSet <String>S= new HashSet();
	S.add(null);
	S.add(null);
	S.add(null);
	S.add("hi");
	S.add("ardak");
	
	System.out.println(S .get(1));
	System.out.println(ll.get(2));
	System.out.println(ll.get(4));
	System.out.println(ll.get(3));
	System.out.println(ll.get(0));
	System.out.println(li.get(2));
	
	   
 }
}
