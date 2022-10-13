/* Write to print sum of 10 natural numbers using 
* while loop
* Date -13-10-2022
*/



public class SumOfNaturalNum
{  
public static void main(String[] args)   
{  
int num = 10, i = 1, sum = 0;  
//executes the condition  
 
while(i <= num)  
{  
//adding the value of i into sum variable  
sum = sum + i;  
//increments the value of i by 1  
i++;  
}  
//prints the sum   
System.out.println("Sum of First 10 Natural Numbers is = " + sum);  
}  
}
