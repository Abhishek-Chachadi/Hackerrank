import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println((isPalindrome(A))?"Yes":"No");
    }
    
    public static boolean isPalindrome(String s)
    {
        int n = s.length();
        for(int i=0;i<n/2;i++)
        {
            if(s.charAt(i) == s.charAt(n-i-1))
                continue;
            else
            {
                return false;
              //  break;
            }    
                
            
        }
        return true;
       
    }
}
