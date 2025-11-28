import java.util.*;

class StringX
{
   

    public String toUpperCaseX(String str)
    {
        int iCnt = 0;
       
        char Arr[] = str.toCharArray();

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            if(Arr[iCnt] >= 'a' && Arr[iCnt] <= 'z')
            {
                Arr[iCnt] =   (char)(Arr[iCnt] -32);
            }
        }
        

        return new String(Arr);   

         

    }

}

class program256
{ 
    public static void main(String A[])
    {
        String sRet = null;
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String : ");

        String sobj = scanobj.nextLine();

        

        StringX strobj = new StringX();
        sRet =strobj.toUpperCaseX(sobj);       
        System.out.println("Updeted string : "+sRet);
        
        
    }

    
}
