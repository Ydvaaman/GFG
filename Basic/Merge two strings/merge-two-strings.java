//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while(t-- > 0){
            String input_line[] = read.readLine().trim().split("\\s+");
            String S1 = input_line[0];
            String S2 = input_line[1];
            Solution ob = new Solution();
            System.out.println(ob.merge(S1,S2));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String merge(String S1, String S2)
    { 
     int i=0;
        int j=0;
        String s="";
        while(i<S1.length() || j<S2.length()){
            if(i!=S1.length()){
                s+=S1.charAt(i);
                i++;
            }
            if(j!=S2.length()){
                s+=S2.charAt(j);
                j++;
            }
        }
        return s;
    }
}