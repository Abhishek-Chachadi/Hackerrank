import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            list.add(scan.nextInt());
        }
        int t = scan.nextInt();
        String Query;
        while(t!=0)
        {
            Query = scan.next();
            List<Integer> q = new ArrayList<Integer>();
            
            if(Query.charAt(0) == 'I')
            {
                q.add(scan.nextInt());
                q.add(scan.nextInt());
               list.add(q.get(0), q.get(1));
               
               //System.out.println(q.get(0));
            }
            else if(Query.charAt(0) == 'D'){
                q.add(scan.nextInt());
                int x = q.get(0);
                list.remove(x);
               // System.out.println(q.get(0));
                
            }
            q.clear();
            
            t--;
        }
       // Iterator<Integer> it = list.iterator();
        list.stream().forEach(elem -> System.out.printf("%d ",elem));
    }
}
