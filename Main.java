package main;

import java.util.function.BiConsumer;

public class Main {
	public static void main(String[] args) {
		
		 System.out.println("While Loop");
		 	
	 	/*The while loop loops through a block of code as long as a specified condition is true:
		initialization
		while(condition){
		code to execute
		increment/decrement
		}
*/		 //print 0, 5, 10...30
		 int i = 0;
		 while(i<=30) {
			 System.out.println(i);
			 i=i+5;
		 }
		 
		 System.out.println("\n another way\n");
		 //print 41,31,21,11,1
		 int y = 41;
		 while(y >= 0) {
			 System.out.println(y);
			 y=y-10;
		 }
		 
		 System.out.println("\nPrint  5+ 10 + 15 +.....100=1050\n");
		 
		 int x = 0;
		 int b = 5;
		 
		 while(b <= 100) {
			 x = x+b;
			 b=b+5;
		 }
		 System.out.println(x);
		
	    }
	} 

