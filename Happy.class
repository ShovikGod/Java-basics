import java.util.*;
class Happy
{
    int n;
    public Happy()
    {
        n=0;
    }
    void getnum(int nn)
    {
        n=nn;
    }
    int sumSqDdigits(int x)
    {
        if(x==0)
            return 0;
       else
       {
           int d=x%10;
           return d*d+sumSqDdigits(x/10);
        }
    }
    void isHappy()
    {
        int a=sumSqDdigits(n);
        while(a>9)
        {
            a=sumSqDdigits(a);
        }
        if(a==1)
            System.out.print(n+" is a Happy Number");
        else
            System.out.print(n+" is Not a Happy Number");
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        Happy ob=new Happy();
        System.out.print("Enter any number: ");
        int b=sc.nextInt();
        ob.getnum(b);  
        ob.isHappy();
    }
}
