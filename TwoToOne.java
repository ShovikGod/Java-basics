/*Take 2 strings s1 and s2 including only letters from ato z. Return a new sorted string, the longest possible, containing distinct letters,

each taken only once - coming from s1 or s2.
Examples:
a = "xyaabbbccccdefww"
b = "xxxxyyyyabklmopq"
longest(a, b) -> "abcdefklmopqwxy"

a = "abcdefghijklmnopqrstuvwxyz"
longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"*/


package Competitive;
public class TwoToOne {
    public static String longest (String s1, String s2){
        if(s1==s2)
            return s1;
        String s3=s1==s2 ? s1 : s1+s2;
        s1="";
        for(char i='a'; i<='z'; i++)
            for(int j=0; j<s3.length(); j++)
                if(s3.charAt(j)==i){
                    s1+=i;
                    break;
                }
         return s1;           
    }
}
