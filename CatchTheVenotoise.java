import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution{

    static int whoGetsTheCatch(int n, int x, int[] X, int[] V){
        
     int min=99999,time,dist=0;
        Map<Integer,Integer> time_c= new HashMap<Integer,Integer>();
        
       

        for(int i=0;i<n;i++)
        {
            
                time=Math.abs(x-X[i])/V[i];
            
            if(time_c.get(time) != null)
                 time_c.put(time,time_c.get(time)+1);
         else 
             time_c.put(time,1);

            
                if(time<min)
                {
                    min=time;
                    dist=i;
                }
                
            
        }
        if(time_c.get(min)>1)
            return -1;
        else
        return dist ;
    }
    
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       
        int n = in.nextInt();
        int x = in.nextInt();
        int[] X = new int[n];
        for(int X_i=0; X_i < n; X_i++){
            X[X_i] = in.nextInt();
        }
        int[] V = new int[n];
        for(int V_i=0; V_i < n; V_i++){
            V[V_i] = in.nextInt();
        }
        int result = whoGetsTheCatch(n, x, X, V);
        System.out.println(result);
    }
}
