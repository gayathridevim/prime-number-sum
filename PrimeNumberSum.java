
public class PrimeNumberSum 
{
	public static void main(String[] args) 
	{
		    int sum = 0,primenumber=2,count=0;
		    while (count < 100) 
		    {
		    	int prime=0;
		    	  for (int i = 2; i < primenumber; i++) 
		    	  {
		    	        if (primenumber % i == 0) 
		    	        {
		    	         prime=1;
		    	         break;
		    	        }
		    	  }  
		    	  if(prime!=1)
		    	  {
		    		  sum = sum + primenumber; 
				      count++;                         
		    	  } 
		    	  primenumber++;  
		    }       
		    System.out.println("The sum of first 100 prime numbers is "+ sum);
	}
}
