import java.util.*;
class Solution{
	
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.nextLine();
            //Complete the code
            
            System.out.println(checkBracket(input));
		}
		
	}
    
    public static boolean checkBracket(String input )
    {
        Stack<Character> de = new Stack<Character>();
        for(int i=0;i<input.length();i++)
            {
                if(input.charAt(i) == '{' | input.charAt(i) == '[' | input.charAt(i) == '(')
                {
                //System.out.println(de);
                de.push(input.charAt(i));
                }
                else{
                if(input.charAt(i) == '}')
                {
                    //System.out.println(de.lastElement());
                    if(!de.isEmpty())
                    if(de.lastElement() == '{')
                        de.pop();
                    else{
                        de.clear();
                        return false;
                         }
                         else{
                        return false;
                    }
                    
                        
                }
                else if(input.charAt(i) == ']' )
                {
                    //System.out.println(de.lastElement());
                    if(!de.isEmpty())
                    if(de.lastElement() == '[')
                        de.pop();
                    else{
                        de.clear();
                        return false;
                         }
                    else{
                        return false;
                    }
                }
                else if(input.charAt(i) == ')')
                {
                    //System.out.println(de.lastElement());
                    if(!de.isEmpty())
                    {
                    if(de.lastElement() == '(')
                        de.pop();
                    else{
                        de.clear();
                        return false;
                         }
                    }
                    else
                        return false;
                    
                        
                }
                }
               
            }
            if(de.isEmpty())
            {
                de.clear();
                return true;
            }
            
            else
            {
                de.clear();
                return false;
            }
    }
}



