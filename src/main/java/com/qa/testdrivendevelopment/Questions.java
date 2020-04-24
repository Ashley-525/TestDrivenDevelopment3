package com.qa.testdrivendevelopment;

import java.util.Scanner;

public class Questions {
	/**
	 * EXAMPLE: THIS ONE HAS BEEN DONE FOR YOU <br>
	 * 
	 * Given a name, return "Hi" plus the name <br>
	 * <br>
	 * For Example:<br>
	 * greetingExample("John") → "Hi John" <br>
	 * greetingExample("Matt") → "Hi Matt" <br>
	 * greetingExample("Angelica") → "Hi Angelica"
	 * 
	 */
	public String greetingExample(String name) {
		return "Hi " + name;
	}

	/**
	 * Write a function which takes 2 integers greater than 0, X,Y as input and generates a 2-dimensional array. 
	 * The element value in the i-th row and j-th column of the array should be i*j.  <br>
	 * Note: i=0,1.., X-1; j=0,1,¡­Y-1.  <br>
	 *   <br>
	 * For Example:  <br>
	 * multiply(3,2) → [[0,0,0],[0,1,2]]  <br>
	 * multiply(2,1) → [[0,0]]  <br>
	 * multiply(3,4) → [[0,0,0],[0,1,2],[0,2,4],[0,3,6]]
	 */
	public int[][] multiply(int arrayLength, int numOfArrays){
		
//		int[] intArray = new int[] {0,1,2};
//		int[] numOfArrays1 = new int[2];
		
//		int[][] multiples = new int[0][2];
//		int[][] multiples1 = new int[0][2];
		int[][] myArray = { 
                {0, 0},
                {0, 0},
                {1, 2},
               };
		
		for (int i = 0; i <myArray.length; i++) {
			
			for (int j = 0; j < myArray[i].length; j++) {
				
				myArray[i][j] = i*j;
				//return myArray;
			}

		} 
		
        for (int[] a : myArray) {
            for (int i : a) {
                System.out.print(i + "\t");
                return myArray;
            }
            System.out.println("\n");
        }
		
		
		return null;
	}
	
	/**
	 * Write a function that accepts a comma separated sequence of words as input and prints the words in a comma-separated
	 * sequence after sorting them alphabetically.
	 * 
	 * For Example:
	 * sortAlphabetically({"bag","car","dog"}) → {"bag","car","dog"}
	 * sortAlphabetically({"dog","car","bag"}) → {"bag","car","dog"}
	 * sortAlphabetically({"car","bark","bag","dog"}) → {"bag","bark","car","dog"}
	 */
	public String[] sortAlphabetically(String[] wordSequence) {
		int count = 0;
		String temp;
        for (int i = 0; i < count; i++) 

        {
            for (int j = i + 1; j < count; j++) { 
                if (wordSequence[i].compareTo(wordSequence[j])>0) 
                {
                	System.out.println(wordSequence);
                    temp = wordSequence[i];
                    wordSequence[i] = wordSequence[j];
                    wordSequence[j] = temp;
                   
                }
            }
        }
        
        for (int i =0; i <= count - 1; i++) {
        	System.out.println(wordSequence[i] + ", ");
        }
		


		return wordSequence;
	}

	/**
	 * Write a function which takes an input, a, and returns the sum a+aa+aaa+aaaa.
	 * So if 2 was the input, the function should return 2+22+222+2222 which is 2468.
	 *  above example looks like it counts the numbers and times it by itself eg 22
	 * For Example:
	 * aPlus(5) → 6170
	 * aPlus(9) → 11106
	 */
	public int aPlus(int num) {
//		int a=2; 
//		int b=2;
//		int c=2;
//		int d=2;
//		int e=2;
//		
//		//int result1 = a+b+c+d+e;
//		int result = 0;
////	    for(int i = 0 ; i < num; i++) {
////	        result += num;
////	       // System.out.println(num+i++);
////	        System.out.println(result1);
////	    } 
//	    
//	    while (num <= 9)
//	    {
//	      // System.out.println("random number in while iteration " + counter1 + " equals: " + number1);
//
//	    	num += result;
//	    	num++;
//	       if (result == 5)
//	          break;
//	       result = num.nextInt(10) + 1;
//	   }
	    
	    
	    

//	    
//	    System.out.println(result);
	    return 0;
	}

	/**
	 * Write a function which takes a string of numbers, separated by commas, and returns all the odd numbers as a string, separated by commas.
	 * If there are no odd numbers then the function should return "null".
	 * 
	 * Inputs will always be given in ascending order, eg "3,4,5". Outputs should also be given in ascending order.
	 * 
	 * For Example:
	 * oddNum("1,2,3,4,5") → "1,3,5"
	 * oddNum("2,4,6,8") → "null"
	 * oddNum("23,48,52,57") → "23,57"
	 */
	public String oddNum(String allNums) {
		
      //  int ivar = 111;
        String str = String.valueOf(allNums);
        System.out.println("String is: "+str);
        int resul = Integer.parseInt(allNums);
        System.out.println("String as int is: "+resul);
        
        for (int i =0 ; i<+1; i++) {
        	if (i % 2 == 0);
        }
        
        
//        int intresul = String.valueOf(resul);
        

        
        
        for (int i =0; i<= resul; i++) {
        	if (i % 2 ==0);
        }
        
//    	for (int i = 1; i <= allNums; i++) {
//    		   if (i % 2 != 0) {
//    			System.out.print(i + " ");
//    		   }
        
        
        
        /* Method 2: using toString() method 
         * of Integer class
         */
		
		return str;
		
	}

	/**
	 * Define a function that can accept two strings as input and returns the string of largest length 
	 * 
	 * If two strings have the same length, then the function should return both strings separated by a single space.
	 * In this case, the strings should be returned in the same order in which they were given.
	 * 
	 * For Example:
	 * longString("hi","hello") → "hello"
	 * longString("three", "two") → "three"
	 * longString("three", "hello") → "three hello"
	 */
	public String longString(String input1, String input2) {
		
		int maxLength = 0;
		
		int count = 0; 
		String longestString = null;
		String s = "";

			if(input1.length() > maxLength && input2.length() > maxLength ) {
				maxLength = s.length();
				longestString = s;
				System.out.println(longestString);
				System.out.println(input2);
			}
		return longestString;
	}

	
	/**
	 * Given an email address person@company.com, and a parameter "person" or "company",
	 * write a function which returns the corresponding piece of information.
	 * Your function should ignore case.
	 * 
	 * For Example:
	 * email("john@google.com", "person") → "john"
	 * email("jane@Microsoft.com", "company") → "microsoft"
	 * email("Dave@amazon.com", "person") → "dave"
	 */
	public String email(String email, String parameter) {
		//String name1 = "john";
		System.out.println(email+parameter);
		
		//String[] splitted = email.split(" ");
		String[] splited = email.split("\\s+");
		System.out.println(splited);
		
		
		return email+parameter;
	}

	/**
	 * 	The fibonacci sequence is the sum of the last two numbers, 
	 * 	with index 0 and 1 having a value of 0 and 1 respectively
	 * 
	 * So fibonacci(5) is the sum of fibonacci(4) + fibonacci(3)
	 * 
	 * For Example:
	 * fibbonaci(0) → 0
	 * fibbonaci(1) → 1
	 * fibbonaci(2) → 1
	 * fibbonaci(3) → 2
	 * fibbonaci(4) → 3
	 * fibbonaci(5) → 5
	 * fibbonaci(8) → 21
	 */
	public int fibonacci(int num) {
		return -1;
	}


	/**
	 * Write a function which, given a string input, returns a string which contains only the characters with odd indexes.
	 * 
	 * For Example:
	 * oddLetters("Sponge") → "pne"
	 * oddLetters("hi") → "i"
	 * oddLetters("0H1e2l3l4o5w6o7r8l9d") → "Helloworld"
	 */
	public String oddLetters(String input) {
		
//		for (String word : strings) {
//
//	        for (int i = 0; i < word.length(); i += 2) {
//	            System.out.print(word.charAt(i));
//	        }
//
//	        System.out.print(" ");
//
//	        for (int i = 1; i < word.length(); i += 2) {
//	            System.out.print(word.charAt(i));
//	        }
//
//	        System.out.println();
//	    }
		
		
		return "";
	}


	/**
	 * Write a function which solves the following puzzle.
	 * A farm has chickens and rabbits, and scanners are able to detect the number of heads and legs.
	 * How many chickens do we have, if we know the number of heads and legs?
	 * The values for 'heads' and 'legs' will be inputs.
	 * If there are no solutions to the puzzle, return null
	 * 
	 * For Example:
	 * chickenAndRabbits(35, 94) → 23
	 * chickenAndRabbits(2, 6) → 1
	 * chickenAndRabbits(12,63) → null
	 */
	public Integer chickenAndRabbits(int heads, int legs) {
		
		return null;
	}


	/**
	 * Write a function which checks the validity of a credit card number.
	 * The function should return a boolean, True if the card is valid, or False if it is not.
	 * 
	 * A credit card has a valid number if it satisfies the following criteria.
	 * - it must start with a 4, 5 or 6.
	 * - it must contain exactly 16 digits.
	 * - each digit must be 0-9 inclusive.
	 * - it may contain hyphens ("-"), to separate groups of 4 digits only, but it cannot contain any other characters.
	 * - it must not have 4 or more consecutive repeated digits.
	 * 
	 * For Example:
	 * validCard("4012-3456-7890-1234") → True
	 * validCard("0123-4567-8901-2345") → False
	 * validCard("401234567890123") → False
	 * validCard("4012 3456 7890 1234") → False
	 * validCard("4444-0123-4567-8901") → False
	 * validCard("4012345678901234") → True
	 */
	public boolean validCard(String cardNumber) {
		
		//String validCardNumber = cardNumber;
		int[] ints = new int[cardNumber.length()];
		for (int i = 0; i < cardNumber.length(); i++) {
			ints[i] = Integer.parseInt(cardNumber.substring(i, i + 1));
			System.out.println("ints is: "+ints[i]);
		}
		for (int i = ints.length - 2; i >= 0; i = i - 2) {
			int j = ints[i];
			j = j * 2;
			if (j > 9) {
				j = j % 10 + 1;
				System.out.println("j is: "+j);
			}
			ints[i] = j;
			System.out.println("ints is: "+ints[i]);
		}
		int sum = 0;
		for (int i = 0; i < ints.length; i++) {
			sum += ints[i];
			System.out.println("ints is: "+sum);
		}
		if (sum % 10 == 0) {
			System.out.println(cardNumber + " is a valid credit card number");
			return true;
		} else {
			System.out.println(cardNumber + " is an invalid credit card number");
			return false;
		}
	
		
		//return false;
	}
}