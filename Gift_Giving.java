import java.io.*;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
       
       Scanner sc= new Scanner (System.in);
       int t=sc.nextInt();
       for(int i=1;i<=t;i++)
       {
           HashMap<String,Integer> names=new HashMap();
           int n=sc.nextInt();
           for(int j=1;j<=n;j++)
           {
               names.put(sc.next(),0);
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
           Set keys = names.keySet();

   for (Iterator itr = keys.iterator(); itr.hasNext(); ) {
       String key = (String) itr.next();
       int value = names.get(key);
       System.out.println(key + " " + value);
   }
       }
    }
}
