import java.util.*;
class program802
{

     public static long Fibonacci(int N)
        {
            if(N <= 1)
            {
                return N;
            }
                   // second          // first
            return Fibonacci(N-1) + Fibonacci(N-2);   // = Next
        }
    public static void main(String A[])
    {
       
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the n umber of elements on series");
        int Size = sobj.nextInt();

        int i =0;
        for(i =0; i <= Size ; i++)
        {
            System.out.print(Fibonacci(i)+" ");
        }
        System.out.println();

        sobj.close();

       

        
    }
}