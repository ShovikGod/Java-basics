import java.util.*;
class ArrStack
{
    int st[], capacity, topofstack;
    public ArrStack(int cap)   //Constructor
    {
        capacity=cap;
        st=new int[capacity];
        topofstack=-1;
    }   
    private boolean isEmpty()   //Checking for Empty Stack
    {
        return topofstack==-1;
    }
    private boolean isFull()    //Checking for Stack to be full
    {
        return topofstack==capacity-1;
    }
    private void push(int n)
    {
        if(!isFull()) 
            st[++topofstack]=n;  //Pushing Data
        else    //Checking for Overflow
            System.out.println("Array is full. Stack Overflow");
    }
    private int popNtop()
    {
        int data=-99999;
        if(!isEmpty())  //Poping Data
            data=st[topofstack--];
        return data;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);      
        System.out.print("Enter maximum capacity  ");
        int cap=sc.nextInt(), ch, n;
        ArrStack obj=new ArrStack(cap);  //Creating object
        do{
            System.out.println("STACK MENU:-\n1.Push\n2.Pop\n3.Exit");
            System.out.print("Enter choice  ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:System.out.print("Enter a number:");
                       n=sc.nextInt();
                       obj.push(n);
                       break;
                case 2:int flag=obj.popNtop();
                       if(flag==-99999)
                           System.out.println("Stack UNDERFLOW");
                       else
                           System.out.println("DATA POPPED = "+flag);
                       break;
                case 3:System.out.println("Thank You For Using The Program");
                       break;
                default:System.out.println("Wrong choice");
            }
        }
        while(ch!=3);
    }
}
