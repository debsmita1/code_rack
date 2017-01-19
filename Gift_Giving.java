      import java.io.*;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
       
       Scanner sc= new Scanner (System.in);
       int t=sc.nextInt();
       for(int i=1;i<=t;i++)
       {
           HashMap<String,Integer> names=new HashMap();
           String names1[]=new String[100];
           int n=sc.nextInt();
           for(int j=1;j<=n;j++)
           {
               String nm=sc.next();
               names.put(nm,0);
               names1[j]=nm;
           }
           for(int m=1;m<=n;m++)
           {
               String giver=sc.next();
               int money=sc.nextInt();
               int people=sc.nextInt();
               if(people!=0)
               {
                   int distribute=money/people;
                   for(int j=1;j<=people;j++)
                   {
                      String receiver=sc.next();
                      names.put(receiver,names.get(receiver)+distribute);
                   }
                   names.put(giver,names.get(giver)-money);
               }
               
           }
           
   for(int j=1;j<=n;j++)
   {
       int value=names.get(names1[j]);
       System.out.println(names1[j] + " " + value);
   }
   
       }
    }
}
