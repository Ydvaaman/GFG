//{ Driver Code Starts
import java.util.*;
class Sorting
{
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    
    // Driver program
    public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

			
			new Solution().quickSort(arr,0,n-1);
			printArray(arr);
		    T--;
		}
} }
// } Driver Code Ends


class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int a[], int si, int ei)
    {
        if(si>=ei){
            return;
        }
        int pivotIndex = partition(a,si,ei);
        quickSort(a,si,pivotIndex-1);
        quickSort(a,pivotIndex+1,ei);
    }
    static int partition(int a[], int si, int ei)
    {
        int pivotElement = a[si];
        int smallnumcount = 0;
        for(int i=si+1;i<=ei;i++){
           if(a[i]<pivotElement){
               smallnumcount++;
           }    
        }
        int temp = a[si + smallnumcount];
        a[si + smallnumcount] = pivotElement;
        a[si] = temp;
        int i = si;
        int j = ei;
        while(i<j){
            if(a[i]<pivotElement){
                i++;
            }
            else if(a[j]>=pivotElement){
                j--;
            }
            else{
                temp= a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j--;
            }
        }
        return si+smallnumcount;
     
    } 
}
