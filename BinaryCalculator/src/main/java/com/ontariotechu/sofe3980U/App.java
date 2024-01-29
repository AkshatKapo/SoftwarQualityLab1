package com.ontariotechu.sofe3980U;

import org.joda.time.LocalTime;

/**
 * Hello world!
 *
 */
public class App 
{
	/**
	* Main program:  The entry point of the program. The local time will be printed first,
	*      Then it will create two binary variables, add them and print the result.
	*
	* @param args: not used
	*/
    public static void main( String[] args )
    {
		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime);
		Binary binary1=new Binary("00010001000"); // creates a binary object and send the number to Binary class
        System.out.println( "First binary number is "+binary1.getValue()); // get the number from binary class and display it
		Binary binary2=new Binary("111000"); // Created a another binary number and send the number to binary class
        System.out.println( "Second binary number is "+binary2.getValue()); // get the number from binary class and display it

		System.out.println("-----------------------------------------------------------------------------");


		System.out.println("ADD OPERATOR");
		Binary sum= Binary.add(binary1,binary2);  // Send both numbers to add function in Binary class
		System.out.println( "Their summation is "+sum.getValue()); // Get the answer from add function in the primary class


		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("OR OPERATOR");
		Binary logic_OR = Binary.OR(binary1,binary2);// Send both numbers to OR function in Binary class
		System.out.println("OR Operator:"+logic_OR.getValue()); // Get the answer from OR function in the binary class



		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("AND OPERATOR");
		Binary logic_AND = Binary.And(binary1,binary2);// Send both numbers to OR function in Binary class
		System.out.println("AND operator:" + logic_AND.getValue());// Get the answer from AND function in the binary class

		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("MULTIPLY OPERATOR");
		Binary logic3 = Binary.multiply(binary1,binary2); //Send both numbers to OR function in Binary class
		System.out.println("Multiply operator:" + logic3.getValue());// Get the answer from AND function in the binary class







	}
}
