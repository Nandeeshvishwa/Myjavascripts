package com.practice;

import java.awt.Point;

public class Practicedemo {

	public static void main(String[] args) {
		//primitive datatype
		byte x = 1;
		byte y = x;
		System.out.println(+y);
        x = 5;
        System.out.println(x+" "+y+" "+"after");
        
        // Reference datatype
        Point first = new Point(x,y);
        first.x = 10;
        Point second = first;
        System.out.println(second.x);
        first.x = 20;
        System.out.println(second.x+" "+"-after");
// direct method to print a string value 
    String message = "Hai nandeesh";
    System.out.println(message);
    // reference method to store a string value
	String message1  = new String("Hello World");
	System.out.println(message1);
	// join a string using concat
	String message3 = "To India";
	String Text = "Welcome"+"!!";
	System.out.println(message1.concat(Text).concat(message3));
	// to join a string using + operand
	System.out.println(message3+Text);
	// to compare 2 string values
	System.out.println(message.compareTo(message));
	System.out.println(Text.length());
	// to know the index value of char
	System.out.println(message1.indexOf("d"));
	// to know the char which is in the index value
	System.out.println(Text.charAt(5));
	// to replace a values in string but cannot change the original
	// string value can only return the new string value
	System.out.println(message.replace("Hai nandeesh","HAI NANDEESH"));
	System.out.println(message);
	// change string to upper case
	System.out.println(message3.toUpperCase());
	// change into lower case
	System.out.println(message1.toLowerCase());
	//Escape Sequences 
	// to include special character in string
	// \"value\" = inserts double invited comma before the string
	// \\value\\ = inserts backward slash
	// \n = prints value in next line
	// \t = inserts tab space
	String message4 = "\"Hello Java\"";
	System.out.println(message4);
	String message5 = "c:\\windows\\";
	System.out.println(message5);
	String message6 = "\"Java\"\n\t\"World\"";
	System.out.println(message6);
	String message7 = "\"Hello\"\n\\This is Nandeesh\\\t\"Thank you\"";
	
}
}
