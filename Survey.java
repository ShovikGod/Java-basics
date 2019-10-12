import java.util.*;
class Survey
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int s=0, ill=0, p=0, age;
        char q;
        do
        {
            System.out.println("Enter your age:");
            age=sc.nextInt();
            if(age<0)
                break;
            s++;    
            System.out.println("Enter your educational qualification:");
            q=sc.next().charAt(0);
            if(age<=16 && (q=='u' || q=='U'))
                System.out.println("In Schoo1");
            else if(age>16 && age<=21)
            {
                System.out.println("Young Adult");
                if(q=='u' || q=='U')
                    System.out.println("Undergraduate");
                else if(q=='g' || q=='G')    
                    System.out.println("Graduate");
                else    
                {
                    System.out.println("Illiterate");
                    ill++;
                }
            }
            else if(age>21)
            {
                System.out.println("Adult");
                if(q=='u' || q=='U')
                    System.out.println("Undergraduate");
                else if(q=='g' || q=='G')    
                    System.out.println("Graduate");
                else if(q=='p' || q=='P')
                {
                    System.out.println("Post Graduate");    
                    p++;
                }
                else
                {
                    System.out.println("Illiterate");
                    ill++;
                }
            }
            else
            {
                System.out.println("Illiterate");
                ill++;
            }
        }
        while(age>0);
        double ip=(ill*100.0)/s;
        ip=((int)Math.round(ip*100.0))/100.0;
        System.out.println("Number of surveys taken:"+s);
        System.out.println("Percentage of Illiterates:"+ip);
        System.out.println("Number of Post Graduate Adults:"+p);
    }
}
