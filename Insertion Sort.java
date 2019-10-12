package Practice;
import java.util.*;
class InsertSort
{
    static Scanner sc=new Scanner(System.in);
    int a[], n;
    public InsertSort(int num)
    {
        n=num;
        a=new int[n];
    }
    void accept()
    {
        System.out.println("Enter"+n+" numbers:");
        for(int i=0; i<n; i++)
            a[i]=sc.nextInt();
    }
    void insertSort()
    {
        for (int j=1; j<n; j++)
        {
            int key=a[j], i=j-1;
            while((i>-1) && (a[i]>key))
            {
                a[i+1]=a[i];
                i--;
            }
            a[i+1]=key;
        }
    }
    void display()
    {
        for(int i=0; i<n; i++)
            System.out.print(a[i]+" ");
    }
    public static void main()
    {
        System.out.print("Enter length of array:");
        int l=sc.nextInt();
        InsertSort ob=new InsertSort(l);
        ob.accept();
        ob.insertSort();
        ob.display();
    }
}
