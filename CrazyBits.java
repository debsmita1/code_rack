
import java.util.*;

class CrazyBits {
    public static int countBits(long n)
    {
        return (int)(Math.log(n)/Math.log(2))+1;
    }
    
    public static int countSetBits(long n)
    {
        int count=0;
        while(n>0)
        {
            n=n&(n-1);
            count++;
        }
        return count;
    }
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
       int t=s.nextInt();
       
       for(int i=0;i<t;i++)
       {
           long n=s.nextLong();
           int nbits=countBits(n);
           long temp=n+1;
           
           while(countBits(temp)==nbits)
           {
               if(countSetBits(n^temp)==1)
                break;
                
                else
                temp++;
           }
           
           System.out.println(temp);
       }

    }
}
