package com.ontariotechu.sofe3980U;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for Binary class.
 */
public class BinaryTest 
{
    /**
     * Test The constructor with a valid binary vallue
     */
    @Test
    public void normalConstructor()
    {
		Binary binary=new Binary("1001001");
        assertTrue( binary.getValue().equals("1001001"));
    }
    /**
     * Test The constructor with an invalid binary value of out-of-range digits
     */
    @Test
    public void constructorWithInvalidDigits()
    {
		Binary binary=new Binary("1001001211");
        assertTrue( binary.getValue().equals("0"));
    }
    /**
     * Test The constructor with an invalid binary value of alphabetic characters
     */
    @Test
    public void constructorWithInvalidChars()
    {
		Binary binary=new Binary("1001001A");
        assertTrue( binary.getValue().equals("0"));
    }
    /**
     * Test The constructor with an invalid binary value that has a sign
     */
    @Test
    public void constructorWithNegativeSign()
    {
		Binary binary=new Binary("-1001001");
        assertTrue( binary.getValue().equals("0"));
    }
    /**
     * T	est The constructor with a zero tailing valid binary value
     */
    @Test
    public void constructorWithZeroTailing()
    {
		Binary binary=new Binary("00001001");
        assertTrue( binary.getValue().equals("1001"));
    }
    /**
     * Test The constructor with an empty string
     */
    @Test
    public void constructorEmptyString()
    {
		Binary binary=new Binary("");
        assertTrue( binary.getValue().equals("0"));
    }
	/**
     * Test The add functions with two binary numbers of the same length
     */
    @Test
    public void add()
    {
		Binary binary1=new Binary("1000");
		Binary binary2=new Binary("1111");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("10111"));
    }
	/**
     * Test The add functions with two binary numbers, the length of the first argument is less than the second
     */
    @Test
    public void add2()
    {
		Binary binary1=new Binary("1010");
		Binary binary2=new Binary("11");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("1101"));
    }
	/**
     * Test The add functions with two binary numbers, the length of the first argument is greater than the second
     */
    @Test
    public void add3()
    {
		Binary binary1=new Binary("11");
		Binary binary2=new Binary("1010");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("1101"));
    }
	/**
     * Test The add functions with a binary numbers with zero
     */
    @Test
    public void add4()
    {
		Binary binary1=new Binary("0");
		Binary binary2=new Binary("1010");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("1010"));
    }
	/**
     * Test The add functions with two zeros
     */
    @Test
    public void add5()
    {
		Binary binary1=new Binary("0");
		Binary binary2=new Binary("0");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("0"));
    }


    @Test
// Test case 1 for OR
    public  void  ORTest1(){

        Binary binary1 = new Binary("0101");
        Binary binary2 = new Binary("0111");
        Binary binary3 = Binary.OR(binary1,binary2);
        assertTrue(binary3.getValue().equals("111")); // checks the output of our code is equal to the actual answer (111), if it test passes

    }

    // Test case 2 for OR
    @Test

    public  void  ORTest2(){

        Binary binary1 = new Binary("1001");
        Binary binary2 = new Binary("0101");
        Binary binary3 = Binary.OR(binary1,binary2);
        assertTrue(binary3.getValue().equals("1101"));// checks the output of our code is equal to the actual answer (1101), if it test passes


    }

    // Test case 3 for OR
    @Test

    public  void  ORTest3(){

        Binary binary1 = new Binary("1100");
        Binary binary2 = new Binary("1000");
        Binary binary3 = Binary.OR(binary1,binary2);
        assertTrue(binary3.getValue().equals("1100")); // checks the output of our code is equal to the actual answer (1100), if it test passes


    }


    @Test

    // Test case 1 for AND

    public  void  ANDTest1(){

        Binary binary1 = new Binary("0101");
        Binary binary2 = new Binary("0111");
        Binary binary3 = Binary.And(binary1,binary2);
        assertTrue(binary3.getValue().equals("101"));

    }

    // Test case 2 for AND
    @Test
    public  void  ANDTest12(){

        Binary binary1 = new Binary("1001");
        Binary binary2 = new Binary("0101");
        Binary binary3 = Binary.And(binary1,binary2);
        assertTrue(binary3.getValue().equals("1"));// checks the output of our code is equal to the actual answer (1), if it test passes


    }
    // test case 3 for AND
    @Test
    public  void  ANDTest3(){

        Binary binary1 = new Binary("1100");
        Binary binary2 = new Binary("1000");
        Binary binary3 = Binary.And(binary1,binary2);
        assertTrue(binary3.getValue().equals("1000")); // checks the output of our code is equal to the actual answer (1000), if it test passes


    }


// test case 1 for Multiply

    @Test
    public  void  MUltiplyTest1(){

        Binary binary1 = new Binary("0101");
        Binary binary2 = new Binary("0111");
        Binary binary3 = Binary.multiply(binary1,binary2);
        assertTrue(binary3.getValue().equals("100011"));// checks the output of our code is equal to the actual answer (100011), if it test passes

    }

    // test case 2 for Multiply

    @Test
    public  void  MUltiplyTest2(){

        Binary binary1 = new Binary("1100");
        Binary binary2 = new Binary("1000");
        Binary binary3 = Binary.multiply(binary1,binary2);
        assertTrue(binary3.getValue().equals("1100000"));// checks the output of our code is equal to the actual answer (1100000), if it test passes

    }
    // Test case 3 for Multiply

    @Test
    public  void  MUltiplyTest3(){

        Binary binary1 = new Binary("1001");
        Binary binary2 = new Binary("0101");
        Binary binary3 = Binary.multiply(binary1,binary2);
        assertTrue(binary3.getValue().equals("101101"));// checks the output of our code is equal to the actual answer (101101), if it test passes

    }


}
