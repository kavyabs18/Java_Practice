package com.kodnest.w3resource;

public class Q14 {
/*Write a Java program to print an American flag on the screen.
Expected Output

* * * * * * ==================================                          
 * * * * *  ==================================                          
* * * * * * ==================================                          
 * * * * *  ==================================                          
* * * * * * ==================================                          
 * * * * *  ==================================                          
* * * * * * ==================================                          
 * * * * *  ==================================                          
* * * * * * ==================================                          
==============================================                          
==============================================                          
==============================================                          
==============================================                          
==============================================                          
==============================================*/
	public static void main(String[] args) {
		for(int i=1; i<=15; i++) {
			for(int j=1; j<=46; j++) {
				if(i<=9 && i%2==1 && j<=12 && j%2==1) {
					System.out.print("*");
				}
				if(i<=9 && i%2!=1 && j<=12 && j%2!=1 || i<=9 && i%2!=0 && j<=12 && j%2!=0) {
					System.out.print(" ");
				}
				if(i<=9 && i%2==0 && j<=10 && j%2==0) {
					System.out.print("*");
				}
				if(i<=9 && i%2==0 && j==12 && j%2==0) {
					System.out.print(" ");
				}
				if(i<=9 && j>12||i>9) {
					System.out.print("=");
				}
			}
			System.out.println();
		}
	}
}
