package org.javaprogramming;

public class ShiftingBackward {
	public static void main(String[] args) {
		int[] a= {5,6,7,8,9,10};
		int key=1;
		for(int j=1;j<=key;j++)
		{
			int first=a[0];
			for(int i=0;i<a.length-1;i++)
			{
				a[i]=a[i+1];
			}
			a[a.length-1]=first;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}

}
