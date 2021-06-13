package java_wk3_codingassignment;


public class java_wk3_codingassignment {

	public static void main(String[] args) {

		//1.	
	
			int[] ages = new int[8];
			ages[0] = 3;
			ages[1] = 9;
			ages[2] = 23;
			ages[3] = 64;
			ages[4] = 2;
			ages[5] = 8;
			ages[6] = 28;
			ages[7] = 93;
			
			System.out.println("#1a " + ages[ages.length - 1] + " - " + ages[0] + " = " + subtractFirstFromLast(ages));
			int[] ages2 = new int[9];
			ages2[0] = 3;
			ages2[1] = 9;
			ages2[2] = 23;
			ages2[3] = 64;
			ages2[4] = 2;
			ages2[5] = 8;
			ages2[6] = 28;
			ages2[7] = 93;
			ages2[8] = 63;
			System.out.println("#1b " + ages2[ages2.length - 1] + " - " + ages[0] + " = " + subtractFirstFromLast(ages2));
			
			int sum = 0;
			
			for (int age : ages) {
				sum += age;
			}
				int average = sum / ages.length;
				System.out.println("#1c Average of original array: " + average);
				
			System.out.println("#2a Average name length and #2b Concatenated names list");
				
				avgLength("Sam", "Tommy", "Tim", "Sally", "Buck", "Bob");	
				
			System.out.println("#3 How do you access the last element of any array?  arrayName[arrayName.length – 1]");	
			
			System.out.println("#4 How do you access the first element of any array?  arrayName[0]");
				
			System.out.println("#7 multiplied string: " + multiplyString("Hello", 3));
			
			//testing #10
//			double[] dubs = new double[3];
//			dubs[0] = 4.5;
//			dubs[1]= 5.0;
//			dubs[2] = 5.5;
//			System.out.println(avgOfDoubles(dubs));
			
			//testing #11
//			double[] dubs = {4.5, 5.0, 5.5};
//			double[] dubs2 = {5.5, 6.0, 6.5};
//			System.out.println(firstArrayGreater(dubs, dubs2));
			
	}
	
			public static int subtractFirstFromLast(int[] ages) {
				int difference = (ages[ages.length-1] - ages[0]);
				return difference;
			}	
			
			
			//2.
				
				public static void avgLength(String a, String b, String c, String d, String e, String f) {
					int sum = 0;
					String[] names = {a, b, c, d, e, f};		
					//a.	Use a loop to iterate through the array and calculate the average number of letters per name. 
					//Print the result to the console.
					for (String name : names) {
						sum += name.length();
					}
					
					double averageLength = sum/names.length;
					System.out.println(averageLength);
					
					//b.	Use a loop to iterate through the array again and concatenate all the names together,
				    // separated by spaces, and print the result to the console.
					String concatenatedResults = "";
					for (String name : names) {
						concatenatedResults = concatenatedResults + name + " ";
					} 
					System.out.println(concatenatedResults);
				
					
//					3.	How do you access the last element of any array?
					
					// arrayName[arrayName.length - 1]
					
//					4. How do you access the first element of any array?
					
					// arrayName[0]
					
//					5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously
//					 created names array and add the length of each name to the nameLengths array.
				
				
					int[] nameLengths = new int[names.length];
				
					for (int i = 0; i < names.length; i++) {
						nameLengths[i] = names[i].length();
					
					}
//					6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in
//					the array. Print the result to the console.
				
					int sumOfLengths = 0;	
					for (int length : nameLengths) {
						sumOfLengths += length;
					}
					
						System.out.println("#6 Sum of lengths: " + sumOfLengths);
					}
				
				
					
					
//					7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word
//					concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I would expect the method
//			      to return “HelloHelloHello”).
				public static String multiplyString(String word, int n)	{
					String multipliedString = "";
					for(int i = 0; i < n; i++) {
						multipliedString += word;
					
					}
						return multipliedString;
				}
				
//					8.	Write a method that takes two Strings, firstName and lastName, and returns a full name (the full
//						name should be the first and the last name as a String separated by a space).
				public static String createFullName(String firstName, String lastName) {
					return (firstName + " " + lastName);
				}
				
//					9.	Write a method that takes an array of int and returns true if the sum of all the ints in the
//						array is greater than 100.
				public static boolean greaterThanOneHundred(int[] numbers) {
					int sum = 0;
					for (int num : numbers) {
						sum += num;
					}
					if (sum>100) {
						return true;
					} else {
						return false;
					}
				}
				
//					10.	Write a method that takes an array of double and returns the average of all the elements in the
//						array.
				
				public static double avgOfDoubles(double[] dbls) {
					double sum = 0;
					for (double d : dbls) {
						sum += d;
					}
					double avgDbl = sum / dbls.length;
					return avgDbl;
						
				}
//					11.	Write a method that takes two arrays of double and returns true if the average of the elements
//						in the first array is greater than the average of the elements in the second array.
				
				public static boolean firstArrayGreater(double[] array1, double[] array2) {
					if (avgOfDoubles(array1) > avgOfDoubles(array2)) {
						return true;	
					} else {
						return false;
					}
				}
					
//					12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket,
//						and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
				public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
					if (isHotOutside && (moneyInPocket>10.50)) {
						return true;
					} else {
						return false;
					}
				}
				
//					13.	Create a method of your own that solves a problem. In comments, write what the method does and
//						why you created it.
				public static boolean isTooMuch(int numOfOpenClass, boolean includesCodingAssignment) {
					if (numOfOpenClass > 2 || ((numOfOpenClass > 0) && includesCodingAssignment)) {
						System.out.println("It is too much work");
						return true;
					} else {
						System.out.println("That's not too much");
						return false;
					}	
				//made this in good fun, struggling with the load this week
			
				}
			}
			