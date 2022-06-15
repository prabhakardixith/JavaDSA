package dsa.apnaCollege.recursion;

public class XPowerOfN
{

    static int power(int a,int b)
    {

        if(b==0)
        {
            return 1;
        }
        int power = power(a, b - 1);
        int powerCount = a*power;
        return powerCount;
    }

    public static void main(String[] args) {
        int power = power(2, 5);
        System.out.println(power);
    }
}
