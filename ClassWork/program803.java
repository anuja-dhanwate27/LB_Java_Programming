import java.util.*;
class program802
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the n umber of elements on series");
        int Size = sobj.nextInt();

        int i = 0;
        long First = 0;
        long Second = 0;
        long Next = 0;

        for( i = 1 , First = 0 , Second = 1; i <= Size; i++ )
        {
            System.out.print(First+" ");
            Next = First + Second;
            First = Second;
            Second = Next;

        }

        System.out.println();
        sobj.close();

        
    }
}