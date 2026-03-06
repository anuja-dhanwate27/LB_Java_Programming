import java.util.*;
class program855
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter String : ");
        // step 0
        String str = sobj.nextLine();
        
        // step 1 
        str = str.trim();
        // step 2
        str = str.replace("\\s+", " ");
        // step 3
        String Arr[] = str.split(" ");
        
      

         for(int i = 0 ; i < Arr.length ; i++)
         {
            System.out.println(Arr[i]);
         }


        sobj.close();

    }
}