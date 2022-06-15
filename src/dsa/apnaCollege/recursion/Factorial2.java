package dsa.apnaCollege.recursion;

public class Factorial2
{
    static int factorial(int num)
    {
       if(num == 1)
       {
           return 1;
       }
       int v =  factorial(num-1);
       int fact = num * v;
       return fact;

    }
    public static void main(String[] args) {
        int factorial = factorial(4);
        System.out.println(factorial);
    }
}
