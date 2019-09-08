import java.util.*;
class PigLatin
{
    String s;
    public PigLatin(String x)
    {
        s=x;
    }
    String pigLatin(String a)
    {
        for(int i=0; i<a.length(); i++)
            if(isVowel(a.charAt(i))==true)
                return a.substring(i)+a.substring(0,i)+"AY";
        return a+"AY";
    }
    boolean isVowel(char ch)
    {
        String check="AEIOU";
        if(check.indexOf(ch)==-1)
            return false;
        return true;
    }
    void work()
    {
        StringTokenizer str=new StringTokenizer(s);
        int l=str.countTokens();
        String newstring="";
        for(int i=1; i<=l; i++)
        {
            newstring = newstring + (pigLatin(str.nextToken().trim()))+" ";
        }
        System.out.println(newstring);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sentence:");
        String a=sc.next().trim().toUpperCase();
        PigLatin pl=new PigLatin(a);
        pl.work();
    }
}
