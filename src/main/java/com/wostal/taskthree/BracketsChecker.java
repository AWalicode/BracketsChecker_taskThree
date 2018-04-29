package com.wostal.taskthree;

/**
 * Checks the string has brackets propertly 
 * @author Aleksander Wostal
 *
 */
public class BracketsChecker {

	/**
	 * Constructor
	 */
	public BracketsChecker() {}
	
	/**
	 * Checks brackets
	 * @param str
	 */
	public void checkBrackets(String str) {
		if(!str.matches("[0-9\\[\\]\\(\\)]*")) {
			return;
		}
		str = str.replaceAll("\\d","");
		while(!str.equals("")) {
			str = str.replaceAll("\\[\\]","");
			str = str.replaceAll("\\(\\)","");
			if(str.indexOf("[)")>=0) {
				System.out.print("FALSE");
				return;
			}
			if(str.indexOf("(]")>=0) {
				System.out.print("FALSE");
				return;
			}
		}
		System.out.print("TRUE");
		
	}
}
