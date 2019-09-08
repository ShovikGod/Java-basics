import java.util.*;
class ArrQue
{
    int q[], capacity, front, rear;
    public ArrQue(int cap)   //Constructor
    {
        capacity=cap;
        q=new int[capacity];
        front=rear=-1;
    }   
    private boolean isEmpty()   
    {
        return front==-1;
    }
    private boolean isFull()  
    {
        return rear==capacity-1;
    }
    private void insert(int n)
    {
        if(isFull()) 
            System.out.println("Cannot insert---Overflow");
        else if(isEmpty())
        {
            front=rear=0;
            q[rear]=n;  
        }
        else   
            q[++rear]=n;
    }
    private int delete()
    {
        int data=-9999;
        if(!isEmpty())  
        {
            data=q[front];
            if(rear==front)
                rear=front=-1;
            else if(front==capacity-1)
                rear=front=-1;
            else
                front++;
        }
        return data;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);      
        System.out.print("Enter size of QUEUE  ");
        int cap=sc.nextInt(), ch, n;
        ArrQue aq=new ArrQue(cap);  //Creating object
        do{
            System.out.println("Menu:-\n1.Insert number\n2.Delete number\n3.exit");
            System.out.print("Enter choice  ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:System.out.print("Enter a number  ");
                       n=sc.nextInt();
                       aq.insert(n);
                       break;
                case 2:int flag=aq.delete();
                       if(flag==-9999)
                           System.out.println("Cannot delete---Underflow");
                       else
                           System.out.println("DELETED DATA ="+flag);
                       break;
                case 3:System.out.println("Thank You For Using The Program");
                       break;
                default:System.out.println("Wrong choice");
            }
        }
        while(ch!=3);
    }
}
