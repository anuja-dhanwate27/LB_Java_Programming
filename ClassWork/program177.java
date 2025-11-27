/*
   input : 8
   output : 1 A 3 B 5 C 7 D 
   index :  
   ASCII :  
*/
  
import java.util.Scanner;
class Pattern
{
    void Display(int iNo)
    {
        int iCnt = 0;
       
        char ch ='A';
        
        for(iCnt =1; iCnt<=iNo ; iCnt++)
        {
            if(iCnt%2==0)
            {
                System.out.printf("%c\t",ch);
                ch++;
              
            }
            else
            {
              System.out.printf("%c\t",ch);
              ch++;
               System.out.printf("%d\t",iCnt);
            }
         
        }
       
    }

}


class program177
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter the frequency : ");
        iValue = sobj.nextInt();

      
        Pattern pobj = new Pattern();
        pobj.Display(iValue);
    }
}