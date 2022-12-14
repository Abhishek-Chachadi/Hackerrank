import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        int small = k;
        int n =s.length();
        if(n<=3)
        return smallest + "\n" + largest;
        else
        {
       for(int i=0;i<n-k+1;i++)
       {
                 
          if(smallest.compareTo(s.substring(i,i+k))>0)
          {
              smallest = s.substring(i, i+k);
          }
          if(largest.compareTo(s.substring(i,i+k))<0)
          {
              largest = s.substring(i, i+k);
          }
          
        }  
      
    
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
