//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s;
            s = sc.next();
            
            Solution ob = new Solution();
            
            System.out.println(ob.gameResult(s));    
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String gameResult(String s)
    {
         if(s.charAt(0)==s.charAt(1))
        {
            return "DRAW";
        }
        else if(s.charAt(0)=='R' && s.charAt(1)=='S')
        {
            return "A";
        }
        else if(s.charAt(0)=='S' && s.charAt(1)=='P')
        {
            return "A";
        }
        else if(s.charAt(0)=='P' && s.charAt(1)=='R')
        {
            return "A";
        }
        else
        {
            return "B";
        }
        
    }

}