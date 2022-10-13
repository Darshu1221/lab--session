/* Write a program to print sum of only positive 
*  numbers using do-while loop.Take the input from the
*  user if the user enters any negative number then
*  that number should not be added in sum
* Date- 13-10-2022
* Name- Darshana Parab
*/
import java.util.Scanner;

class PositiveNum{
  public static void main(String[] args) {
      
    int sum = 0;

    // create an object of Scanner class
    Scanner sc = new Scanner(System.in);

    // take integer input from the user
    System.out.println("Enter a number");
    int number = sc.nextInt();
	   
    // while loop continues 
    // until entered number is positive
    while (number >= 0) {
      // add only positive numbers
      sum += number;

      System.out.println("Enter a number");
      number = sc.nextInt();
    }
	   
    System.out.println("Sum = " + sum);
    sc.close();
  }
}
