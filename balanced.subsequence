import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      int t,i,j,count;
        String s;
        
        Scanner sc= new Scanner(System.in);
        t=sc.nextInt();
        
        for(i=1;i<=t;i++)
            {
            count=0;
            s=sc.next();
            j=0;
           Stack<Character> stack= new Stack<Character>();
                
            while(j<s.length())
                {
                    if(s.charAt(j)=='(')
                    {
                        stack.push(s.charAt(j));
                    }
                else if(s.charAt(j)==')' && !stack.empty())
                {   
                    stack.pop();
                    count=count+2;
                       
                    }
                   j++;
                        
            }
            System.out.println(count);
        }
    }
}
