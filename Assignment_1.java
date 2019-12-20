/*
 * @author Jonathan Helms
 * @date 9/19/2019
 * @description: User picks a program to run, between average calculator, dice roll, circle area, or compute distance
 * @pseudocode: 
 * 1. Display options
 * 2. user enters choice
 * 3. switch statements to separate choices
 * 4. Average calculator:
 * 		 user enters 3 test grade
 * 		 average is calculated
 * 		 formula is average = (test1 + test2 + test3) / 3
 * 		 average is returned
 * 5. dice roll
 * 		 dice roll is randomly generated
 * 		 user guess odd or even
 * 		 returns whether user is right or wrong 
 * 6. Circle area calculator
 * 		 user enters a radius for a circle
 * 		 pi at 3.14 is placed at a constant variable
 *  	 area of a circle is calculated
 *  	 formula is area = 3.14 * radius^2
 *  	 area is displayed
 * 7. distance calculator
 * 		 user enters the x and y coordinates for two points  
 * 		 distance is calculated using formula sqrt((x2 - x1)^2 + (y2-y1)^2)
 * 		 display distance
 * 8. choice 5
		 display a goodbye message
 * 9. default statement if user enters something other than 1, 2, 3, 4, and 5
 * 		 tell user they must enter one of the numbers
 * 
 * 
 */

import java.util.Scanner;
public class Assignment_1 {

	public static void main(String[] args) {
		//create scanner for users inputs
		Scanner keyboard = new Scanner(System.in);
		
		//prompt user to pick program
		System.out.println("Enter number for corresponding program:"
				+ "\n	1. Lab Test Average Calculator"
				+ "\n	2. Dice Roll"
				+"\n	3. Circle Area Calculator"
				+"\n	4. Compute Distance"
				+"\n	5. Quit");
		int choice = keyboard.nextInt();
		
		//switch statements for choices
		switch (choice) {
		case 1:
			
			//prompt user to enter 3 test scores
			System.out.print("What did you get on the first test? ");
			double test1 = keyboard.nextInt();
			System.out.print("What did you get on the second test? ");
			double test2 = keyboard.nextInt();
			System.out.print("What did you get on the third test? ");
			double test3 = keyboard.nextInt();
			
			//calculate average and display it
			double average = (test1 + test2 + test3) / 3;
			average = Math.round(average * 100) / 100.0;
			System.out.println("Your average is " + average + "%");
			break;
			
		case 2: 
			
			//randomly generate dice roll
			int diceRoll = (int) (Math.random()* 6 ) + 1;
			
			//prompt user to guess odd or even
			System.out.print("Guess whether a dice roll is odd or even. ");
			System.out.print("Enter even and odd: ");
			String guess = keyboard.next();
			
			//if-else statements if user gets it right or wrong
			if (diceRoll % 2 != 0 && guess.contentEquals("odd")) {
				System.out.println("You're right! It was odd.");
			}
			
			else if (diceRoll % 2 == 0 && guess.contentEquals("even")) {
				System.out.println("You're right! It was even.");
			}
			
			else if (diceRoll % 2 == 0 && guess.contentEquals("odd")) {
				System.out.println("You're wrong! It was even.");
			}
			
			else if (diceRoll % 2 != 0 && guess.contentEquals("even")) {
				System.out.println("You're wrong! It was odd.");
			}
			break;
			
		
		case 3:
			
			//prompt user for radius of circle
			System.out.print("Enter the radius of the circle: ");
			double radius = keyboard.nextDouble();
			final double pi = 3.14;
			
			//calculate area and display it
			double area = Math.pow(radius, 2) * pi;
			System.out.print("The area of the circle is " + area);
			break;
		
			
		case 4:
			
			//prompt user for location of 2 points
			System.out.println("Calculate the distance between two points.");
			System.out.print("Enter the first x cooridnate: ");
			double x1 = keyboard.nextDouble();
			System.out.print("First y cooridante: ");
			double y1 = keyboard.nextDouble();
			System.out.print("Second x cooridante: ");
			double x2 = keyboard.nextDouble();
			System.out.print("Second y cooridante: ");
			double y2 = keyboard.nextDouble();
			
			//calculate distance and display it
			//difference in x values
			double a = x2 - x1;
			
			//differences in y values
			double b = y2 - y1;
			
			//differences of x squared
			double c = Math.pow(a, 2);
			
			//differences of y squared
			double d = Math.pow(b, 2);
			
			//squared of each added 
			double e = c + d;
			
			//square root of the addition 
			double f = Math.pow(e, 0.5);
			
			//display distance
			System.out.println("The distance is " + f);
			break;
			
		
		case 5:
			//goodbye message to end program
			System.out.print("Goodbye.");
			break;
			
			
		default:
			//statement if user doesn't enter 1,2,3,4,or 5
			System.out.print("You must enter one of the number choices.");

		
		}
	}

}
