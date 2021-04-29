package test;

import java.util.*;
public class prog_substr{
    static String find(String a, String b)
    {
        int l1,l2;
        l1=a.length();l2=b.length();
        if(l1<l2){return "-1";}
        int[] bb=new int[256];
        int[] aa=new int[256];
        for(int i=0;i<l2;i++)
        {bb[b.charAt(i)]++;}
        int i=0,min=Integer.MAX_VALUE,c=0,start=-1;
        for(int j=0;j<l1;j++)
        {
            aa[a.charAt(i)]++;
            if(aa[a.charAt(j)]<=bb[a.charAt(j)]){c++;}
            if(c==l2)
            {
                while(aa[a.charAt(i)]>bb[a.charAt(i)]||bb[a.charAt(i)]==0)
                {
                    if(aa[a.charAt(i)]>bb[a.charAt(i)])
                    {aa[a.charAt(i)]--;}
                    i++;
                }
                int l=j-i+1;
                if(min>l){min=l;start=i;}
            }
        }
        if(start==-1){return "-1";}
        return a.substring(i,i+min+1);
    }
     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         String a;
         String b;
         a=sc.nextLine();
         b=sc.nextLine();
        System.out.println(find(a,b));
     }
}