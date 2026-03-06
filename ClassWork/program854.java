import java.util.*;
class program854
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
        
      

         for(String s : Arr)
         {
            System.out.println(s);
         }


        sobj.close();

    }
}