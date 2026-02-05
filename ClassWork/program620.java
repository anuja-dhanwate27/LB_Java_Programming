import java.util.*;
class program618
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int no = 0;
        
        System.out.println("Enter the number : ");
        no = sobj.nextInt();


        int  iDigit = 0;

        int iCount = 0;
        int iCount2 = 0;

        while(no != 0)
        {
            iDigit = no % 2;
            no = no/2;

            System.out.print(iDigit);

            if(iDigit==1)
            {
                iCount++;
            }
           

             
            



        }

         System.out.println("Count of 1 is :: "+iCount);
       


    }
}