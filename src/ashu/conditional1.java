package ashu;

public class conditional1{
	
	public static void main(String[] args)
	{
	  
		double mark =99.9999999;
		if (mark<=0 || mark>100) {
			System.out.println("invalid imput");
		}
		else if(mark<50)
		{ 
			System.out.println("Fail");
		}
else if(mark >=90) 
	{
		System.out.println("grade a+");}
	
	 else if (mark>=80 && mark <90) 
	
	 { System.out.println("grade A");
		 
	}

	else if (mark>=70 && mark<80)
	{
		System.out.println("garde B");
	}
	else if (mark>=60 && mark<70)
	{
		System.out.println("grade C");
	
		
}
	}}
	