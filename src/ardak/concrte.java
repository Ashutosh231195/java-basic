package ardak;

import ashu.intrfaceC;

public class concrte extends Abstract implements intrfA,intrfaceC {

public void F() {
	System.out.println("its concrate mathod ");
}
	public void C(int a) {
		System.out.println("its abstract method");
		System.out.println(a);
	}


	public int E() {
		System.out.println("its abstract method");
		int a= 10;
		return a;
	}
	public void Z() {
		System.out.println("its concrete meti");
	}
public static void main(String[] args) {
	concrte obj= new concrte();
	obj.C(0);
	obj.A();
	obj.demo();
	Abstract D= new concrte() ;

}

public void demo() {
	System.out.println("its intrfc method");
	
}
@Override
public void A() {
	System.out.println("its ashu package intrface");
}
@Override
public void B() {
	
}
}
