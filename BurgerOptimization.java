import java.util.*;


class BurgerOptimization {
    public static void main(String args[] ) throws Exception {
       
      Scanner sc= new Scanner(System.in);
    	
       int t=sc.nextInt();
       int i=1;
       while(i<=t)
       {
           int k=sc.nextInt();
           
           int arr1[]= new int[k];
           int arr2[]=new int[k];
           int answer=0;
           
           for(int j=0;j<k;j++)
              arr2[j]=sc.nextInt();  
           
           Arrays.sort(arr2);
           int index=0;
           
           for(int l=0;l<k/2;l++)
           {
               arr1[index]=arr1[index+1]=l;
               index=index+2;
           }
           if(k%2 !=0)
           { 
               arr1[index]=k/2;
           }
           for(int l=0;l<k;l++)
           {
               answer+=Math.pow((arr1[l]-arr2[l]),2);
           }
           
           System.out.println("Case #"+i+": "+answer);
           i++;
       }
    }
}
