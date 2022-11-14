
package lab10;
import java.util.*;

public class MainClass 
{

   
    public static void main(String[] args) 
    {
       String expression = "(2+4) * 8 + ((3-1) + 7)";
       boolean bal = isBalanced(expression);
       System.out.println(bal);
       
       
    }
    public static Boolean isBalanced(String expression)
    {
        
        char[] exp = expression.toCharArray();
        Stack<Character> stack = new Stack();
        for(int i = 0; i < exp.length; i++)
        {
            if(exp[i] == '(')
            {
                stack.push('(');
            }
            if(exp[i] == ')')
            {
                if(stack.isEmpty())
                {
                    return false;
                }
            stack.pop();
            }
        }
        
        if(stack.isEmpty())
        {
            return true;
        }
        
        return false;
        
    }
    
}
