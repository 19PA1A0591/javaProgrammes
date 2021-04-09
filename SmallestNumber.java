import java.lang.*;
import java.util.*;

class SmallestNumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int A[] = new int[n];
		System.out.println("Enter the array elements: ");
		for(int i=0; i<n; i++)
			A[i]=sc.nextInt();
		int min=A[0];
		for(int i=1; i<A.length; i++)
			if(A[i]<min)
				min=A[i];
		System.out.println("Smallest Number is: "+min);  
	}
}
