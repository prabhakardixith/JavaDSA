package dsa.apnaCollege.recursion;

public class SumOfNaturalNumber
{

    static void sum(int i,int num,int sum)
    {
        if(i == num)
        {
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        sum(i+1,num,sum);
    }
    public static void main(String[] args) {
        sum(1,5,0);
    }
}
