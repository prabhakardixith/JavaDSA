package dsa.apnaCollege.recursion;

//printing till N
public class PrintTillN
{
    static void printNumber(int num)
    {
        if(num > 5)
        {
            return;
        }
        System.out.println(num);
        printNumber(num+1);

    }

    public static void main(String[] args) {
        printNumber(1);
    }
}
