import java.util.*;
public class automorphic
{
    int num,temp;
    void getdata()
	{
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter the number: ");
	    num= sc.nextInt();
	    temp=num;
	   }
      boolean checkAutomorphic() 
	{ 
		// Store the square 
		int sq = temp * temp; 

		
		while (temp > 0) { 
			// Return false, if any digit of N doesn't 
			// match with its square's digits from last 
			if (temp % 10 != sq % 10) 
			{
				return false; 
                      }

			// Reduce N and square 
			temp /= 10; 
			sq /= 10; 
		} 

		return true; 
	} 

	// Driver method 
	public static void main(String[] args) 
	{ 
	    automorphic obj = new automorphic();
	    obj.getdata();
	    obj.checkAutomorphic();

		System.out.println(obj.checkAutomorphic() ? "Automorphic" : "Not Automorphic"); 
	} 
} 
