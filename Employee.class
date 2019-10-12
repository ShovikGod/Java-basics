import java.util.*;
class Employee
{
    String name;
    double b;
    public Employee()    {
        name="";
        b=0.0;
    }
    public Employee(String n, double basic)
    {
        name=n;
        b=basic;
    }
    double da()
    {
        double d;
        d=(b<12000)?0.45:(b<25000)?0.755:0.93;
        return b*d;
    }
    double hra()
    {
        double h;
        h=(b<12000)?0.12:(b<25000)?0.152:0.2;
        return b*h;
    }
    double net()
    {
        double net=b+da()+hra();
        return net;
    }
    double annual()
    {
        double ap=net()*12;
        return ap;
    }
    double tax()
    {
        double ap=annual(), it;
        it=(ap>=150000 && ap<=300000)?0.2*(ap-150000):30000+0.1*(ap-300000);
        it=Math.round(it/10)*10;
        return it;
    }
    double salary()
    {
        double asal=annual()-tax();
        return asal;
    }
    double take_home()
    {
        double tkhome=Math.round(salary()/12);
        return tkhome;
    }
    void display()
    {
        System.out.println("Employee name:\t"+name);
        System.out.println("Basic Pay:\tRs."+b);
        System.out.print("DA amount:\tRs."+da()+"\t\t\t");
        System.out.println("HRA amount:\tRs."+hra());
        System.out.println("Net Pay:\tRs."+net());
        System.out.println("Annual Pay:\tRs."+annual());
        System.out.println("Tax Deducted:\tRs."+tax());
        System.out.println("Annual Salary:\tRs."+salary());
        System.out.println("Take Home Pay:\tRs."+take_home());
        System.out.println("");
    }
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter name of Employee: ");
        String name=sc.nextLine();
        System.out.print("Enter Basic Pay: Rs. ");
        double basic=sc.nextDouble();
        Employee E=new Employee(name, basic);
        E.display();
    }
}
