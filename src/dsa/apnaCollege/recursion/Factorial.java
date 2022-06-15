package dsa.apnaCollege.recursion;

public class Factorial
{
    static void factorial(int num,int fact)
    {
        if(num == 1)
        {
            fact*=num;
            System.out.println(fact);
            return;
        }
        fact*=num;
        factorial(num-1,fact);
    }
    public static void main(String[] args) {
        factorial(4,1);
    }
}
