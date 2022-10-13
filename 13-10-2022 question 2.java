/* Write a program to demonstrate on nested for loop
 * and print the output as shown in the below fig
 *    *
 *    * *
 *    * * * 
 *    * * * *
 *    * * * * *
 * 
 */
public class StarPattern {

    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
