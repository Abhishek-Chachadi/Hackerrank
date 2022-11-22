import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        List<Integer> A = new ArrayList<Integer>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            A.add(sc.nextInt());
        }
        int count=0;
        int val1=0,val2=0;
        for(int i=0;i<n;i++)
        {
            val1 = A.get(i);
            for(int j=i;j<n;j++)
            {
                val2 = val2+A.get(j);
                if(val2<0)
                    count++;
            }
            val2=0;
            
        }
        System.out.println(count);
    }
    
}
