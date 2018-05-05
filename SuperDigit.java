import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SuperDigit {
    
    public static int findSuperDigit(String s)
    {
        if(s.length()==1)
            return Integer.parseInt(s);
        String temp=s.substring(0,s.length()-1);
        return Integer.parseInt(""+s.charAt(s.length()-1)) + findSuperDigit(temp);
    }

    static int digitSum(String n, int k) {
         String str=n;
    
        while(str.length()!=1)
              str=Integer.toString(findSuperDigit(str));
        
         str=Integer.toString(Integer.parseInt(str) * k);
         while(str.length()!=1)
            str=Integer.toString(findSuperDigit(str));
        
        return (Integer.parseInt(str));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.next();
        int k = in.nextInt();
        int result = digitSum(n, k);
        System.out.println(result);
        in.close();
    }
}
