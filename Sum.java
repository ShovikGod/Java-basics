package Competitive;
public class Sum
{
   public int GetSum(int a, int b)
   {
        int max=Math.max(a, b), min=Math.min(a, b), sum=0;
        for(int i=min; i<=max; i++)
            sum+=i;
        return sum;    
   }
}
