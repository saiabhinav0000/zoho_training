package test;

import java.util.Scanner;
import java.util.*;
public class Stud
{
	public static void mergesort(int[] a,int l,int h)
	{
		if(l>=h) {return;}
		int m=(l+h)/2;
		mergesort(a,l,m);
		mergesort(a,m+1,h);
		merge(a,l,h);
	}
	public static void merge(int [] a,int l,int h)
	{
		int m=(l+h)/2;
		int [] c=new int[h-l+1];
		int i=l,j=m+1,k=0;
		while(i<=m && j<=h)
		{
			if(a[i]<a[j]){c[k++]=a[i++];}
			else{c[k++]=a[j++];}
		}
		while(i<=m)
		{c[k++]=a[i++];}
		while(j<=h)
		{c[k++]=a[j++];}
		for(i=l;i<=h;i++)
		{
			a[i]=c[i-l];
			}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n,m,k=1;
        n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
        	a[i]=sc.nextInt();
        }
        m=sc.nextInt();
        int[] b=new int[m];
        int[] c=new int[n+m];
        for(int i=0;i<m;i++)
        {
        	b[i]=sc.nextInt();
        	c[i+n]=b[i];
        }
        
        for(int i=0;i<n;i++)
        {c[i]=a[i];}
        mergesort(c,0,m+n-1);
        int[] d=new int[n+m];
        k=1;
        int i=1;
        d[0]=c[0];
        while(i<n+m)
        {
        	if(c[i]!=c[i-1]) 
        	{d[k++]=c[i];}
        	i++;
        }
        for(i=0;i<k;i++)
        {
        	System.out.println(d[i]+" ");
        }
	}
}
