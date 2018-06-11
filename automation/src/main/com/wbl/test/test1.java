package com.wbl.test;

public class test1 {

	 
	public static void main(String[] st) {
		int[]a = {1,2,3,4};
	      int[]b = {10,16,1,2,3,22};
	      int[]c = new int[a.length+b.length];
	      int count =a.length;
	      
	      for(int i = 0; i<a.length; i++) { 
	         c[i] = a[i];
	         
	      } 
	      for(int j = 0;j<b.length;j++) { 
	         c[count++] = b[j];
	      } 
	      for(int i = 0;i<c.length;i++) System.out.print(c[i]+" ");


	}
}
