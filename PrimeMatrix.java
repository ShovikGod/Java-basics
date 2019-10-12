import java.util.*;
class PrimeMatrix
{
    static Scanner sc=new Scanner(System.in);
    int a[][], r, c;
    public PrimeMatrix(int r, int c)
    {
        this.r=r;
        this.c=c;
        this.a=new int[r][c];
    }
    boolean isPrime(int y, int i)
    {
        if(i<=(int)Math.sqrt(y))
        {
            if(y%i==0) 
                return false;    
            return isPrime(y, ++i);
        }
        return true;
    }
    void primeFill(int n)
    {
        int b=0;
        if(isPrime(n, 2))
                b=n;
        else
            while(b==0)
                if(isPrime(++n, 2))
                    b=n;
        for(int i=0; i<r; i++)
            for(int j=0; j<c; j++)
                while(a[i][j]==0)
                {
                    if(isPrime(b, 2))
                        a[i][j]=b++;
                    else 
                        b++;
                }
     }
     void print()
     {
         for(int i=0; i<r; i++)
         {
            for(int j=0; j<c; j++)
                System.out.print(a[i][j]+"\t");
            System.out.println();
        }
     }
     public static void main()
     {
         System.out.println("Enter number of rows and columns:");
         int r1=sc.nextInt();
         int c1=sc.nextInt();
         System.out.print("Enter the initial value: ");
         int b=sc.nextInt();
         if(b<=9 || b>=100)
            System.out.println("INVALID INITIAL VALUE!");
         else
         {
             if((r1>=3 && r1<=10) && (c1>=3 && c1<=11))
             {
                PrimeMatrix p=new PrimeMatrix(r1, c1);
                p.primeFill(b);
                p.print();
             }
             else 
                System.out.println("INVALID RANGE!");
         }
     }
}
