import java.util.Scanner;
class SelectionSort 
{ 
	void sort(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i = 0; i < n-1; i++) 
		{ 
			int min_idx = i; 
			for (int j = i+1; j < n; j++) 
				if (arr[j] < arr[min_idx]) 
					min_idx = j; 

			int temp = arr[min_idx]; 
			arr[min_idx] = arr[i]; 
			arr[i] = temp; 
		} 
	} 
	void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i]+" "); 
		System.out.println(); 
	} 
	public static void main(String args[]) 
	{
		int n; 
		SelectionSort ob = new SelectionSort();
 		Scanner s = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:");
        		n = s.nextInt();
       		int arr[] = new int[n];
        		System.out.println("Enter all the elements:");
        		for(int i = 0; i < n; i++)
        		{
            		arr[i] = s.nextInt();
        		}
		ob.sort(arr); 
		System.out.println("Sorted array"); 
		ob.printArray(arr); 
	} 
} 


