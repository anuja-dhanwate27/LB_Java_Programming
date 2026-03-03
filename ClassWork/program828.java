import java.util.*;

class program827
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0 , iDigit = 0 , iSum = 0 , iTemp = 0;
        System.out.println("Enter Number");
        iNo = sobj.nextInt();

       iTemp =  iNo;
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;

            iNo = iNo / 10;
            
        }

        iNo = iTemp;

         if(iNo % iSum ==0)
          {
             System.out.println(iNo+" is Niven Number");
          }
          else
          {
            System.out.println(iNo+" is niven not  Number");

          }


        sobj.close();
    }
}