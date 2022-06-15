package dsa.apnaCollege.recursion;

public class Fibonacci
{
    static void fibo(int a,int b,int n)
    {
        if(n == 0)
        {
            return;
        }
        int c = a+b;
        System.out.print(" "+c);
        fibo(b,c,n-1);
    }

    public static void main(String[] args)
    {
        System.out.print(0+" "+1);
        fibo(0,1,7-2);

    }
}
