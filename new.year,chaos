import java.io.*;
import java.util.*;

public class Solution {
    private static String bribeCount( int a[], int n ) {
        int i = 0, bribes = 0;
        for( i = n-2; i >= 0; i-- ) {
            int j = i+1, t = a[i];
            int ct = 0;
            while( j < n && t > a[j] ) {
                a[j-1] = a[j]; j++; ct++;
                if( ct > 2 )
                    return "Too chaotic";
            }
            a[j-1] = t; bribes += ct;
        }
        return (Integer.toString(bribes));
    }

    public static void main(String[] args) {
       int t,i,n,j;
        
        Scanner sc= new Scanner(System.in);
        t=sc.nextInt();
        for(i=1;i<=t;i++)
            {
            int flag=0;
            int bribes=0;
            n=sc.nextInt();
            int []a= new int[200000];
            for(j=0;j<n;j++)
                a[j]=sc.nextInt();
            
            System.out.println( bribeCount(a, n) );
            
            
    }
}
}
