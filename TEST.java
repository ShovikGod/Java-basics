import java.util.*;
class Test
{
    int n;
    public Test(int num)
    {
        n=num;
    }
    public boolean isArmstrong()
    {
        int d=0, sum=0, copy=n;
        while(copy>0)
        {
            d=copy%10;
            copy/=10;
            sum+=d*d*d;
        }
        if(sum==n)
            return true;
        return false;
    }
    public boolean isPerfect()
    {
        int i, sum=0;
        for(i=1; i<=n/2; i++)
        {
            if(n%i==0)
                sum+=i;
        }
        if(sum==n)
            return true;
        return false;
    }
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        boolean b;
        int num=0;
        System.out.println("Enter your choice '1' for Perfect Number and '2' for Armstrong Number test");
        int ch=sc.nextInt();
        System.out.println("Enter number:");
        num=sc.nextInt();
        Test t=new Test(num);
        switch(ch)
        {
            case 1:b=t.isPerfect();
                     if(b==true)
                        System.out.println("Perfect Number");
                     else
                        System.out.println("not a Perfect Number");
                     break;
            case 2:b=t.isArmstrong();
                     if(b==true)
                        System.out.println("Armstrong Number");
                     else
                        System.out.println("not a Armstrong Number");   
                     break;
            default:System.out.println("Invalid Choice");
        }
    }
}
