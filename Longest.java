import java.util.*;
class Longest
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String s, w="", lng="";
        char ch;
        int i, l, max=0, wrd=0, c=0, avg=0;
        System.out.println("Enter a Sentence:");
        s=sc.next();
        s=s.trim()+" ";
        l=s.length();
        for(i=0; i<l; i++)
        {
            ch=s.charAt(i);
            if(ch!=' ' )
            {
                c++;
                w=w+ch;
                if(w.length()>max)
                    lng=w;
                else if(w.length()==max)
                    lng=", "+w;
            }
            else
            {
                wrd++;
                w="";
            }
        }
        avg=(int)(Math.round(c/wrd));
        System.out.println("Longest word: "+lng);
        System.out.println("Average length of words: "+avg);
    }
}
