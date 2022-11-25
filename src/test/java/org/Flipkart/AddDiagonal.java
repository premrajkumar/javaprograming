package org.Flipkart;

public class AddDiagonal {
	public static void main(String[] args) {
		int[][] i = {{1,2,3},{4,5,6},{7,8,9}};
		int sum=0;
		for(int k=0;k<i.length;k++)
		{
			sum=sum+i[k][k];
		}
		System.out.println(sum);
	}

}
