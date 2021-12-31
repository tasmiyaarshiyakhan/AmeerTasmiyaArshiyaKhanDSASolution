package module;


import java.util.Arrays;
import java.util.Scanner;

public class main{
	// method to calculate stock span values
	static void calculateSpan(int price[], int n, int S[])
	{
		// Span value of first day is always 1
		S[0] = 1;

		int i;
		S[i] = 1; // Initialize span value

		// Traverse left while the next element on left is smaller
		// than price[i]
		for (int j = i - 1; (j >= 0) && (price[i] >= price[j]); j--)
			S[i]++;
	}

	// A utility function to print elements of array
	static void printArray(int arr[])
	{
		System.out.print(Arrays.toString(arr));
	}

	// Driver program to test above functions
	public static void main(String[] args)
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no of Companies N");	
    int noOfCompanies =sc.nextInt();
	int arr[]=new int[noOfCompanies];
		
		System.out.println("Enter current stock price values of the companies N");
		for(int i=0;i<arr.length;i++) 
			arr[i]=(int) sc.nextDouble();
	
			int sharePriceOfTheCompany= sc.nextInt();
			
			while((int) sharePriceOfTheCompany--!=0) {
				
				
			int sharePriceOfTheCompanyToday = 0;
			int sharePriceOfTheCompanyYesterday = 0;
			if(sharePriceOfTheCompanyToday>=sharePriceOfTheCompanyYesterday) {
				 System.out.println("True");

			 }
			else {
				System.out.println("False");
				}
				
				
			
		}
}

{
		int price[] = { 10, 4, 5, 90, 120, 80 };
		int n = price.length;
		int S[] = new int[n];
		

		// Fill the span values in array S[]
		calculateSpan(price, n, S);

		// print the calculated span values
		printArray(S);
	}
}

