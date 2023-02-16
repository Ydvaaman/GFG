//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    String s = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.isReversible(s, n));
                }
                
        }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int isReversible(String str, int n) 
    { 
     //complete the function here
         StringBuilder sb = (new StringBuilder(str)).reverse();
    if(str.equals(sb.toString()))
    return 1;
    return 0;
   } 
    } 
