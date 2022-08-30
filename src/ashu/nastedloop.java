package ashu;

public class nastedloop {
public static void main(String[] args) {

	for (int j=1;j<=4;j++) 
	{
	for(int i=4;i>=j;i--){
			
			System.out.print("*");}
			for (int k=2;k<=j;k++) 
				{System.out.print("  ");}
			for(int i=4;i>=j;i--){
				
				System.out.print("*");}
			System.out.println();
	}
			
		
	}
			}
				
					
				
		
	
	


