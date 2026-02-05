import java.util.*;
class program622
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int no = 0;
        
        System.out.println("Enter the number : ");
        no = sobj.nextInt();


        int  iDigit = 0;

        int iCount = 0;
     
        while(no != 0)
        {
            iDigit = no % 2;
            iCount = iCount + iDigit;

            no = no/2;
         }

         System.out.println("Count of 1 is : "+iCount);
       


    }
}


/*
    Decimal                      Hexadecimal                        Binary
      0                               0                              0000
      1                               1                              0001
      2                               2                              0010
      3                               3                              0011
      4                               4                              0100
      5                               5                              0101
      6                               6                              0110
      7                               7                              0111
      8                               8                              1000
      9                               9                              1001
      10                              a                              1010
      11                              b                              10
      12                              c                            
      13                              d
      14                              e
      15                              f


  Hexadecimal number formation
 1011     1111     1000      0101          0011      1011     1110      0001
 b         f        8         5             3          b       e         1



  No = 0xbf853be1




*/