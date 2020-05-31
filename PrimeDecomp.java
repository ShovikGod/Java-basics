/*Given a positive number n > 1 find the prime factor decomposition of n. The result will be a string with the following form:

 "(p1**n1)(p2**n2)...(pk**nk)"
with the p(i) in increasing order and n(i) empty if n(i) is 1.

Example: n = 86240 should return "(2**5)(5)(7**2)(11)"*/

package Competitive;
public class PrimeDecomp{
    public static String factors(int n){
        String ans="";
        for(int i=2; i<Math.sqrt(n); i++){
            if(isPrime(i)==true && n%i==0){
                int c=0;    
                while(n%i==0){
                    n/=i;
                    c++;
                }
                if(c==1)
                    ans+="("+i+")";   
                else if(c!=0)
                    ans+="("+i+"**"+c+")";
            }
        }
        return ans;
    }
    public static boolean isPrime(int n)
    {
        for(int i=2; i<Math.sqrt(n); i++)
            if(n%i==0)
                return false;
        return true;
    }
}
