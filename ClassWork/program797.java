import java.util.*;
class program797
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please E nter your current balance : ");
        int current_Balance = sobj.nextInt();

        System.out.println("Please Enter the amount that you want to withdraw : ");
        int Withdraw_Amount = sobj.nextInt();

        if(current_Balance < 0 || Withdraw_Amount <=0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(Withdraw_Amount % 100 != 0)
        {
            System.out.println("Transaction Failed : Withdrawal amount must be multiple of 100rs ");
        }
        else if(Withdraw_Amount > 25000)
        {
            System.out.println("Transaction Failed : Maximum Withdrwal per transaction is 25,000rs");
        }
        else if(current_Balance - Withdraw_Amount < 1000)
        {
            System.out.println("Transaction Failed : After withdrawal balance must remain at least 1,000rs");
        }
        else
        {
            System.out.println("Transaction Successful.");
            System.out.println("Reamining Balnce : "+(current_Balance - Withdraw_Amount)+"rs");
        }

    }
}