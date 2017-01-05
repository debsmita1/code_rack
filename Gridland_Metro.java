import java.io.*;
import java.util.*;
import java.math.*;
public class Solution {

    public static void main(String[] args) {
        BigInteger m,n,c1,c2,r;
        int k;
        int i;
        Scanner sc= new Scanner(System.in);
        n=sc.nextBigInteger();
        m=sc.nextBigInteger();
        k=sc.nextInt();
        BigInteger grids=n.multiply(m);
        BigInteger[] arr=new BigInteger[3000];
        BigInteger occupy=BigInteger.valueOf(0);
        int j=0;
        for(i=0;i<k;i++)
            {
             r=sc.nextBigInteger();
            c1=sc.nextBigInteger();
            c2=sc.nextBigInteger();
            arr[j]=r;
            arr[j+1]=c1;
            arr[j+2]=c2;
            j=j+3;
        }
        
        for(i=0;i<=(3*k)-6;i=i+3)
            {
            if(arr[i].compareTo(BigInteger.valueOf(-1))==0)
                    continue;
            
                for(j=i+3;j<=(3*k)-3;j=j+3)
                    {
                if(arr[j].compareTo(BigInteger.valueOf(-1))==0)
                    continue;
            
            
                if(arr[i].compareTo(arr[j]) == 0)
                    {
                        if(arr[i+1].compareTo(arr[j+1])==1)
                            arr[i+1]=arr[j+1];
                    
                        if(arr[i+2].compareTo(arr[j+2])==-1)
                            arr[i+2]=arr[j+2];
                    
                    arr[j]=BigInteger.valueOf(-1);
                }
        }
        }
        for(i=0;i<3*k;i=i+3)
            {
            if(arr[i].compareTo(BigInteger.valueOf(-1))==0)
                continue;
            
           BigInteger val= (arr[i+2].subtract(arr[i+1])).add(BigInteger.valueOf(1));
            occupy=occupy.add(val);
        }
       
            
        System.out.print(grids.subtract(occupy));
        
    }
}
