package com.wostal.taskthree;

/**
 * Checks open and close brackets in a string
 * @author Aleksander Wostal
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
    	BracketsChecker bc = new BracketsChecker();
    	String str = "[[[(())]]]";
        System.out.println( str + " - has brackets propertly?" );
        bc.checkBrackets(str);
    }
}
