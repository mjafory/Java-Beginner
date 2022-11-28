package main;

import java.util.Scanner;

public class mainwork {
	public static void main(String[] args) {
	/*
	DataType	Size	Description
	byte		1 byte	Stores whole numbers from -128 to 127
	short		2 bytes	Stores whole numbers from -32,768 to 32,767
	int	    	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
	long		8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
	float		4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
	double		8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
	boolean		1 bit	Stores true or false values
	char		2 bytes	Stores a single character/letter or ASCII values 
	*/
	System.out.print("Hello ");
	System.out.print("World ");
	System.out.print("People, \n");
	String myvarialbe = "How are you world? I'm ";
	int myAge = 20;
	String year = " years old";
	System.out.print(myvarialbe + myAge + year);
	
	int t = 6;
	
	double y = 63.0;
	
	double f= 7.0;
	
	double tAvg = y/t;

	double fAvg = y/f;
	
	System.out.print("\n" + tAvg);
	System.out.print("\n" + fAvg+"\n");
	

    if (tAvg < fAvg) {
		boolean myT= true;
		System.out.print(myT);
	} else {
		boolean myT= false;
		System.out.print(myT);
	}
    
    System.out.print("\n\n----------------------------------\n\n");
    
    /*	   
    Operator	Name			Description							Example
     
	+			Addition		Adds together two values			x + y	
	-			Subtraction		Subtracts one value from another	x - y	
	*			Multiplication	Multiplies two values				x * y	
	/			Division		Divides one value by another		x / y	
	%			Modulus			Returns the division remainder		x % y	
	++			Increment		Increases the value of a variable by 1	++x	
	--			Decrement		Decreases the value of a variable by 1	--x
	
	==	Equal to	x == y	
	!=	Not equal	x != y	
	>	Greater than	x > y	
	<	Less than	x < y	
	>=	Greater than or equal to	x >= y	
	<=	Less than or equal to	x <= y
	
	&& 	Logical and	Returns true if both statements are true	x < 5 &&  x < 10	
	|| 	Logical or	Returns true if one of the statements is true	x < 5 || x < 4	
	!	Logical not	Reverse the result, returns false if the result is true	!(x < 5 && x < 10)

    Method
    nextBoolean()	Reads a boolean value from the user
    nextByte()	Reads a byte value from the user
    nextDouble()	Reads a double value from the user
    nextFloat()	Reads a float value from the user
    nextInt()	Reads a int value from the user
    nextLine()	Reads a String value from the user
    nextLong()	Reads a long value from the user
    nextShort()	Reads a short value from the user
   */
    
   // double reminder = fAvg;
    /*
User input is obtained using the Scanner class, which may be found in the java.util package.
Create an instance of the Scanner class and use any of the various methods listed in the class
documentation to utilize the class. We'll utilize the nextLine() function, which is used to read 
strings, in our example.
    */
     Scanner userValue =new Scanner(System.in);
     System.out.print("Enter value: ");
     double reminder = userValue.nextDouble(); 
     
   
    if (reminder % 2==0) {
    	System.out.print("\n\neven\n");
		
	} else if (reminder % 2==1) {
		System.out.print("\n\nodd\n");
	} else {
		System.out.print("\nneither even or odd\n");
	}
    
    Scanner userChScanner= new Scanner(System.in);
    System.out.print("What's your name: ");
    String name1 = userChScanner.nextLine();
    String name = name1;
    System.out.print("\n" + name + "\n");
    
    //When will an int/string become a char? The char isn't enclosed it in quotes. Use next to get a string version. Use .equals() to check strings. 
    
    if(name.equals("John") || name.equals("White")) {
		System.out.print(name + ", your in group A");
	}else if(name.equals("David") || name.equals("White")) {
		System.out.print(name + ", you are in group B");
	}else {
		System.out.print(name + ", you are not in group yet");
	}
    
    
    Scanner userVlue= new Scanner(System.in);
    System.out.print("\n\nWhat's your age: ");
    int value = userVlue.nextInt();
    System.out.print("\n" + value + "\n");
    
    if(value >= 0 && value <= 8 ) {
		System.out.print("\nYou are kid");
	}else if(value >= 9 && value <= 12 ) {
		System.out.print("\nYou are child");
	}
	else if(value >= 13 && value <= 17 ) {
		System.out.print("\nYou are teen");
	}else {
		System.out.print("\nYou are adult");
	}
    
    Scanner userValue1= new Scanner(System.in);
    System.out.print("\n\nWhat's your serial number: ");
    int uvalue = userValue1.nextInt();
    System.out.print("\n" + uvalue + "\n");
    
    switch (uvalue) {
    //range 1-5
	case 1: case 2: case 3: case 4: case 5:
		System.out.print("Group 1");
		break;
	case 6: case 7: case 8: case 9: case 10:
		System.out.print("Group 2");
		break;
	case 11: case 12: case 13: case 14: case 15:
		System.out.print("Group 3");
		break;
	default:
		System.out.print("Out of a group");
		break;
	}
    
    System.out.print("\n\n----------------------------------\n\n");
    

    
    //for loop
    /*
     
    Statement 1 is executed (one time) before the execution of the code block.

	Statement 2 defines the condition for executing the code block.

	Statement 3 is executed (every time) after the code block has been executed..
	for(initialization; condition;increment/decrement)
	*/
	
    System.out.println("print even number from 50 to 60");
    //1 way
    for (int i = 50; i <= 60; i++) {
		if ( i % 2==0) {
			System.out.println(i);
		}
	}
    System.out.println("____________________________");
    //another way
    for (int i = 50; i <= 60; i = i+2) {
			System.out.println(i);
	}
    
    System.out.println("\n\nProblem: Write a for loop wich will print the follwoing numbers: 0 10  20  30 ....100");
    
    for (int i = 0; i <= 100; i = i+10) {
    	
		System.out.println(i);
	}
    
    System.out.println("\n\nProblem: Write a for loop which will print the follwoing numbers: 100  90  80 .... 0");
    //one
    for (int i = 100; i >-10; i = i-10) {
		System.out.println(i);
	}
    
    System.out.println("another way\n");
    for (int i = 100; i >= 0; i = i - 10) {
		System.out.println(i);
	}
    
    System.out.println("\n\nProblem: Write a for loop which will print summation of all athe nubers which are divded by 3 and 5 between 30 to 120");
    
    //one way
    int sum = 0;
    for (int i = 30; i <= 120; i = i + 15) {
    	sum = sum + i; 
	}
    System.out.println("Sum is " + sum);
 	
 	
 	System.out.println("another way\n");
 	
    int sum1 = 0;
    for (int i = 30; i <= 120; i++) {
    	if(i % 3 == 0  && i % 5==0) {
    		sum1 = sum1 + i;
    	}
	}
 	System.out.println("Sum is " + sum1);
}
}
