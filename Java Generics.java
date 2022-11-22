import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        List<String> list2 = new ArrayList<String>();
        list2.add("Hello");
        list2.add("World");
        printArray(list);
        printArray(list2);
                
    }
    
    public static void printArray(List<?> l)
    {
        l.stream().forEach(ele -> System.out.println(ele));
    }
    
}
