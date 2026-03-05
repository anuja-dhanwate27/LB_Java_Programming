import java.util.*;

class program847
{
    public static void main(String A[])
    {
     
        String str ="  india   is   my  country  ";

       

        System.out.println(str);
        str =str.trim();
        str =str.replaceAll("\\s+", " ");   // \\s+1 one or more white space replace with one white space
        String Arr[] = str.split(" ");

        System.out.println(Arr.length);

       
    }
}