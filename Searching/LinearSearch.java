import java.util.Scanner;
class LinearSearch 
{ 
public static int search(int arr[], int x) 
{ 
	int n = arr.length; 
	for(int i = 0; i < n; i++) 
	{ 
		if(arr[i] == x) 
			return i; 
	} 
	return -1; 
} 

public static void main(String args[]) 
{ 
	int n; 
	Scanner s = new Scanner(System.in);
	System.out.print("Enter no. of elements you want in array:");
        	n = s.nextInt();
       	int arr[] = new int[n];
        	System.out.println("Enter all the elements:");
        	for(int i = 0; i < n; i++)
        	{
            	arr[i] = s.nextInt();
        	}
	System.out.print("Enter no. of elements you want to search:");
        	int x = s.nextInt();
	int result = search(arr, x); 
	if(result == -1) 
		System.out.println("Element is not present in array"); 
	else
		System.out.println("Element is present at index " + result); 
} 
} 

