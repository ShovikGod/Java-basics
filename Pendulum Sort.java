import java.util.*;
class PendSort
{
    String s;
    public PendSort(String s)
    {
        this.s=s.trim();
    }
    String newString(String a)
    {
        StringTokenizer str=new StringTokenizer(a, " ,.!;");
        int i, j;
        String b="", c="";
        while(str.hasMoreTokens()==true)
        {
            for(i=0; i<str.nextToken().length(); i++)
                for(j=65; j<120; j++)
                {
                    if((int)a.charAt(i)==j)
                        b+=a.charAt(i);
                }
            c+=b+" ";
        }
        return c+".";    
     }
     public static void main()
     {
         Scanner sc=new Scanner (System.in);
         System.out.print("Enter sentence: ");
         String p=sc.next().trim();
         PendSort ob=new PendSort(p);
         System.out.println("Sorted String: "+ob.newString(p));
      }
}
