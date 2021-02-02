import java.util.Arrays;
import java.util.Scanner;

public class week3assingment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * PART 1
		 */
		
		// A.
		// declaring array, and Filling Array
		int[] ages = {3,9,23,64,2,8,28,93};
		
		// Gets the length of the array
		int lengthOfArray = ages.length;
		
		// Uses Math.abs to get absolute number, Takes length of array - length of array to get first number, 
		//then subtracts it form the length of array -1 because the array starts at zero not 1.
		int subtraction = Math.abs(ages[lengthOfArray - lengthOfArray] - ages[lengthOfArray - 1]);
		
		System.out.println("First number in array minus the second number is " + subtraction);
		
		//B.
		//new array
		int[] age = {3,9,23,64,2,8,28,93,98};
		// get length of new array
		int lengthOfSecondArray = age.length;
		//subtract new array
		int sub = Math.abs(age[lengthOfSecondArray - lengthOfSecondArray] - age[lengthOfSecondArray - 1]);
		
		System.out.println("First number in array minus the second number is " + sub);
		//C.
		//int sum value
		int sum = 0;
		// loop trough array adding the sum
		for (int i = 0; i < lengthOfSecondArray; i++) {
			//sum will be equal to the array numbers
			sum = sum + age[i];
		}
		// will double average variable 
		double average = sum / age.length;
		
		System.out.println("The Avrage is: " + average);
		
		/*
		 * PART 2
		 */
		
		//A. 
		//Create array of strings
		String[] names = {"Sam","Tommy", "Tim","Sally","Buck","Bob"};
		//int sum of names letters
		int sumNames = 0;
		// for loop to loop through array
		for (int i = 0; i < names.length; i++) {
			// sumNames value will be + array run through with i .length
			sumNames += names[i].length();
		}
		//reuse average
		average = sumNames / names.length;
		//print average to console
		System.out.println(average);
		
		//B.
		//for loop to loop through array of names
		for(int u = 0; u < names.length; u++) {
			System.out.print(names[u] + ", ");
		}
		
		//C.
		//4
			//This will create a space for more organized output to console.
			System.out.println("");	
			//This will access the last element of the name array
			System.out.println(names[names.length - 1]);
		//5	
			//This will print the first element in the array
			System.out.println(names[names.length - names.length]); 
			//Make new array nameLengths that is equal to the names array.length
			int[] nameLengths = new int[names.length];
			// loop through
			for (int i = 0; i < names.length; i++) {
				// add name length to name each time.
					nameLengths[i] = names[i].length();
					// Prints to console to verify. will be deleted.
					//System.out.println(nameLengths[i]);
				}
		//6 Sum of all elements in nameLengths array
			
			// create variable to hold sum
			int sums = 0;
			//Loop trough nameLengths
			for (int i = 0; i < nameLengths.length; i++) {
				//Add up numbers in nameLengths, the numbers are the length of the names in the name array
				sums += nameLengths[i];
				
			}
			// print total.
			System.out.println("The sum of the numbers in nameLengths array is: " + sums);
		//7
			System.out.println(concatenateWord("Hello", 3));
	
		//8
				System.out.println(fullName("Zachary", "Zerbst"));
				
		//9 
				// Will send ages to the suGreaterthan100 method
				System.out.println(sumGreaterthan100(ages));
				
		//10
				// Will Create an array of doubles
				double[] dArray = { 1.99, 2.48, 8.48, 0.1};
				//This will print The avrage of dArray after it is sent to method.
				System.out.println(averageDoubleArray(dArray));
				
		//11 
				// Creating 2 arrays of doubles
				double[] fArray = {4.5, 2.4, 4.8,7.4};
				double[] sArray = {5.4,4.2,8.4,7.9};
				System.out.println(greaterAvrageOfDoubles(fArray, sArray));
				
				
		//12 
				
				//Create Boolean
				boolean isHotOutside = true;
				//Creat Double money
				double moneyInPocket = 11;
				// Will give Boolean and double to willBuyDrink Method, then will print what boolean method returns.
				System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
				
				
		//13
				
		/* Create a method that will take user input in the form of a string as a password
		 *  check to see if it matches and return true.
		*/
				Scanner scan = new Scanner(System.in);
				//Prompt user to create password
				System.out.print("Create your password: ");
				// String users input and create string to save password
				String userPassword = scan.nextLine();
				// Have user use password to log in
				System.out.print("Enter your password :");
				// save the attempt at the current password
				String attemptedPassword = scan.nextLine();
				
				if (checkPassword(userPassword,attemptedPassword)) {
					System.out.println("Welcome.");
				}else {
					System.out.println("Incorrect.");
				}
							
	}//args


	//7
	//Create Method to print a word, n amount of times.
	public static String concatenateWord(String word, int n) {
		//Create variable for string arg
		String concatenateWord = "";
		// Loop for how ever many time n int is put into the method
		for(int e = 0; e < n; e++) {
			concatenateWord+= word;
			// return reslut
		}return concatenateWord;
	
	}
	
	
	//8
	
		
		
		// Create method to take 2 strings, then concatenate them into 1 and return.
		private static String fullName(String firstName, String lastName) {
			return  firstName + " " + lastName;
		
	}
		
		//9
		// Create a boolean method that will accept an array as args.
		public static boolean sumGreaterthan100(int[] arr) {
			// Using the Stream API this will take the array that is pushed into the method and return sum greater then 100
			return Arrays.stream(arr).sum() > 100;
			
			
			
		}
	
		
		//10
		// Create a method that will take an array or doubles.
		public static double averageDoubleArray(double[] arr) {
			// Will take the array and get an average or double not a number.
			return Arrays.stream(arr).average().orElse(Double.NaN);
			
		}
	
		//11
		// Create a method that will take two arrays of doubles
		public static boolean greaterAvrageOfDoubles(double [] firstArray, double [] secondArray) {
			// Return False if the Average of the first Array of doubles is less then the second Array
			return averageDoubleArray(firstArray) > averageDoubleArray(secondArray); 
			
			
		}
		
		
		//12
		// Creat a metho that will take double and boolean
		public static boolean willBuyDrink(boolean x, double y) {
			// Create boolean to test and return
			boolean buy;
			// see if conditions are meet.
			if (x == true && y > 10.50) {
				buy = true;
			}else buy = false;
			//return condition in boolean true/false
			return buy;
			
			
			
		}
	
		
		//13
		// Create a method to check if the 2 string are the same
		public static boolean checkPassword(String createdPassword, String attemptedPassword) {
			// create a boolean to return
			boolean testPassword;
			// check condition
			if (createdPassword.equals(attemptedPassword)) {
				testPassword = true;
			}else testPassword = false;
			// return true/ false
			return testPassword;
			
			
		}
	

}//class
