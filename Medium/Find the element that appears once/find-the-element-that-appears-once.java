//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; ++i)
                arr[i] = sc.nextInt ();

    		System.out.println (new Sol().search (arr, n));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Sol
{
    public static int search(int A[], int N)
    {
        int ans = A[0];
        for(int i=1;i<N;i++){
            ans=ans^A[i];
        }
        return ans;
        
        
        // for(int i=0;i<N-1;i++){
        //     if(A[i]==A[i+1]) i++;
        //     else return A[i];
        // }
        // return A[N-1];
        
        
    }
}