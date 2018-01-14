package com;

import java.io.*;
import java.util.*;

public class Balanced_Subsequence {

    public static void main(String[] args) {
      
            	 int j,flag;
        String s;
        
        Scanner sc= new Scanner(System.in);
       
        
       
            flag=0;
            s=sc.next();
            j=0;
           Stack<Character> stack= new Stack<Character>();
                
            while(j<s.length())
                {
                    if(s.charAt(j)=='(' || s.charAt(j)=='{' || s.charAt(j)=='[')
                    {
                        stack.push(s.charAt(j));
                    }
                else if((s.charAt(j)==')' || s.charAt(j)=='}' || s.charAt(j)==']')&& !stack.empty())
                {   
                	if(s.charAt(j)==')' && stack.peek()=='(')
                	{
                		stack.pop();
                	}
                	else if(s.charAt(j)=='}' && stack.peek()=='{')
                	{
                		stack.pop();
                	}
                	else if(s.charAt(j)==']' && stack.peek()=='[')
                	{
                		stack.pop();
                	}
                	else
                	{
                		flag=1;
                		break;
                	}
                       
                    }
                    
                else if((s.charAt(j)==')' || s.charAt(j)=='}' || s.charAt(j)==']')&& stack.empty())
                {
                	flag=1;
                	break;
                }
                
                   j++;
                        
            }
            if(!stack.empty())
            {
            	flag=1;
            }
            if(flag==1)
            	System.out.println("Unbalanced Sequence");
            else
            	System.out.println("Balanced Sequence");
            
        }
    }

