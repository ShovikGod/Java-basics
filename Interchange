import java.util.*;
class Interchange
{
    int n;
    int M[][];
    public Interchange(int n1)
    {
        n=n1;
        M=new int[n1][n1];
    }
    boolean isPrime(int a)
    {
        for(int i=2; i<=a/2; i++)
            if(a%i==0)
                return false;
        return true;
    }
    void fill()
    {
        int i, j, k=11;
        for(i=0; i<n; i++)
            for(j=0; j<n; j++)
                while(true)
                {
                    if(isPrime(k)==true)
                    {
                        M[i][j]=k;
                        k++;
                        break;
                    }
                    else 
                        k++;
                }
    }
    void swap()
    {
        int k=n-1, i, temp=0;
        for(i=0; i<n; i++)
        {
            temp=M[i][i];
            M[i][i]=M[i][k];
            M[i][k--]=temp;
        }
    }
    void print()
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
                System.out.print(M[i][j]+"\t");
            System.out.println();
        }
    }
    public static void main()
    {
        int n1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size: ");
        n1=sc.nextInt();
        if(n1<3 || n1>8)
            System.out.println("INVALID INPUT");
        else
        {
            Interchange ob=new Interchange(n1);
            ob.fill();
            ob.print();
            ob.swap();
            System.out.println("CHANGED MATRIX:");
            ob.print();
        }
    }
}
