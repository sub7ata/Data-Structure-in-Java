/*Recursive implementation of Binary Search*/
/*import java.util.Scanner;
class BinarySearch { 
	int binarySearch(int arr[], int l, int r, int x) 
	{ 
		if (r >= l) { 
			int mid = l + (r - l) / 2;  
			if (arr[mid] == x) 
				return mid; 

			if (arr[mid] > x) 
				return binarySearch(arr, l, mid - 1, x); 

	
			return binarySearch(arr, mid + 1, r, x); 
		} 

		return -1; 
	} 

	public static void main(String args[]) 
	{ 
		BinarySearch ob = new BinarySearch(); 
 		Scanner s = new Scanner(System.in);
		System.out.println("Enter no. of elements you want in array:");
        		int n = s.nextInt();
       		int arr[] = new int[n];
        		System.out.println("Enter all the elements:");
        		for(int i = 0; i < n; i++)
        		{
            		arr[i] = s.nextInt();
        		}
		int num = arr.length; 
		System.out.println("Enter no. of elements you want to search:");
        		int x = s.nextInt();
		int result = ob.binarySearch(arr, 0, num - 1, x); 
		if (result == -1) 
			System.out.println("Element not present"); 
		else
			System.out.println("Element found at index " + result); 
	} 
} 

*/

/*Iterative implementation of Binary Search*/

import java.util.Scanner;
class BinarySearch { 
	int binarySearch(int arr[], int x) 
	{ 
		int l = 0, r = arr.length - 1; 
		while (l <= r) { 
			int m = l + (r - l) / 2; 

			if (arr[m] == x) 
				return m; 

			if (arr[m] < x) 
				l = m + 1; 

			else
				r = m - 1; 
		} 

		return -1; 
	} 

	public static void main(String args[]) 
	{ 
		BinarySearch ob = new BinarySearch(); 
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no. of elements you want in array:");
        		int n = s.nextInt();
       		int arr[] = new int[n];
        		System.out.println("Enter all the elements:");
        		for(int i = 0; i < n; i++)
        		{
            		arr[i] = s.nextInt();
        		}
		int num = arr.length; 
		System.out.println("Enter no. of elements you want to search:");
        		int x = s.nextInt();
		int result = ob.binarySearch(arr, x); 
		if (result == -1) 
			System.out.println("Element not present"); 
		else
			System.out.println("Element found at " + "index " + result); 
	} 
} 

