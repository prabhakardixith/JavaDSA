package dsa.apnaCollege.recursion;

public class Factorial3
{
    static int fact(int n)
    {
        if(n == 1 || n == 0)
        {
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        int fact = fact(4);
        System.out.println(fact);
    }
}
