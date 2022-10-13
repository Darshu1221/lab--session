
/*Write a program demonstrate on nested if.Take the
*Input from the user
*Date :- 13/10/2022
*/

import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        double percent;
        Scanner scanner = new Scanner(System.in);
        /*Reading the percentage of student from the command line
        * using nextDouble(method provided by Scanner class)
        */
        System.out.print("Enter the percentage of student:- ");
        percent = scanner.nextDouble();
        /*Checking the percentage of the student and printing
        * the grade 
        */
        if(percent > 90) {
            System.out.println("Grade is A");
        } else if(percent < 90 && percent >= 80) {
            System.out.println("Grade is A1");
        } else if(percent < 80 && percent >= 70) {
            System.out.println("Grade is B");
        } else if(percent < 70 && percent >= 60) {
            System.out.println("Grade is B1");
        } else if(percent < 60 && percent >= 50) {
            System.out.println("Grade is C");
        } else if(percent <50 && percent >=40){
            System.out.println("Grade is C1");
        } else if(percent <40 && percent >=10){
            System.out.println("The student is failed in exam");

        } 
        }
    }
}
