package dsa.apnaCollege.recursion;

//printing 5 - 1
public class PrintTillOne
{
    static void printNumber(int num)
    {
        if(num == 0)  // base condition stop  recursion
        {
            return;
        }
        System.out.println(num);
        printNumber(num-1);
    }

    public static void main(String[] args) {
        printNumber(5);
    }

}
