import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        
        //java.util.List<Character> lista = new java.util.ArrayList<Character>();
/*
        java.util.Iterator<Character> it = new a.Iterator();
        while(it.hasNext())
        {
            lista.add(it.next());
        }

        java.util.ArrayList<Character> listb = new java.util.ArrayList<Character>();
        Iterator<Character> it2 = new a.Iterator();
        while(it2.hasNext())
        {
            listb.add(it2.next());
        }
        java.util.List.sort(lista);
        java.util.Collection.sort(listb);
        if(lista.equals(listb))
        return true;
        else
   /     return false;
   
   
   */
   a = a.toLowerCase();
   b = b.toLowerCase();
    char c[] = a.toCharArray();
    char d[] = b.toCharArray();
    
        java.util.Arrays.sort(c);
        java.util.Arrays.sort(d);
//System.out.println(c);
//System.out.println(d);
       
    if(java.util.Arrays.equals(c,d))
    return true;
    else
    return false;
   
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
