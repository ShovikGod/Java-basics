package Competitive;
import java.util.*;
class LongestConsec {
    public static String longestConsec(String[] strarr, int k){
        int n=strarr.length;      
        if(n==0 || k>n || k<=0)
            return "";
        int longest=0;
        String s1="";
        for(int i=0; i<(n-k+1); i++){
            String s="";
            for(int j=i; j<(i+k); j++)
                s=s+strarr[j];
            if(s.length()>longest){
                longest=s.length();
                s1=s;
            }
        }
        return s1;
    }
}
