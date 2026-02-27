import java.util.*;
class program802
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the n umber of elements on series");
        int Size = sobj.nextInt();

        int i = 0;
        int First = 0;
        int Second = 0;
        int Next = 0;

        for( i = 1 , First = 0 , Second = 1; i <= Size; i++ )
        {
            System.out.print(First+" ");
            Next = First + Second;
            First = Second;
            Second = Next;

        }

        System.out.println();

        
    }
}