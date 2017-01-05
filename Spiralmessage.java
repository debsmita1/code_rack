import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       char [][]arr= new char[40][40];
        Scanner sc= new Scanner(System.in);
        
        int l=0,k=0,i,j,count;
        String s="";
        int n=sc.nextInt();
        int m=sc.nextInt();
        
        for(i=0;i<n;i++)
            {
            String s1=sc.next();
            for(j=0;j<m;j++)
                {
                    arr[i][j]=s1.charAt(j);
            }
        }
       
        while(k<n && l<m)
            {
            if(l<m)
            {
            for(i=n-1;i>=k;i--)
            s+=arr[i][l];
            
            l++;
            }
            //System.out.print(s+"   ");
            for(i=l;i<m;i++)
            s+=arr[k][i];
             
            //System.out.print(s+"   ");
            k++;
            if(l<m)
            {
                for(i=k;i<n;i++)
                s+=arr[i][m-1];
            }
             
          // System.out.print(s+"   ");
            
            m=m-1;
            if(k<n)
            {
                for(i=m-1;i>=l;i--)
            s+=arr[n-1][i];
           n=n-1;
            }
            //System.out.print(s+"   ");
                
        }
        
        s=s.replace('#',' ');
       
        s=s.trim();
       
        
        count=1;
       for(i=0;i<s.length()-1;i++)
            {
           if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
           {
               count++;
           }
        }
        if(s.length()!=0)
        System.out.print(count);
        else
            System.out.print("0");
    }
}
