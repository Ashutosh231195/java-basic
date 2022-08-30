package ashu;

public class classloader {
	public static void main(String[] args) {
	Class c= classloader.class;
		System.out.print(c.getClass());
		System.out.println(String.class.getClassLoader());
		
	}

}
