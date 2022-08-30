package ashu;

public class primenumber {
	public static void main(String[] args) {
		 
		   {		
		       int i =0;
		       int k =0;
		       //Empty String
		       String  primeNumbers = "";

		       for (i = 1; i <= 100; i++)         
		       { 		  	  
		          int b=0; 	  
		          for(k =i; k>=1; k--)
			  {
		             if(i%k==0)
			     {
		 		b = b + 1;
			     }
			  }
			  if (b ==2)
			  {
			     //Appended the Prime number to the String
			     primeNumbers = primeNumbers + i + " ";
			  }	
		       }	
		       System.out.println("Prime numbers from 1 to 100 are :");
		       System.out.println(primeNumbers);
		   }
	}


} 