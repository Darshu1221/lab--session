/*
 * WAP to print even number and print in ascending order
 * Date:- 20/10/22
 * Name :- Darshana Parab
 */


import java.util.Arrays;
import java.util.Scanner;
public class Even_Ascending_Array{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
               //creating an object of scanner class
		System.out.print("Enter the number of element in array:");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.print("enter the "+ size+ "element of array:");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		//checking an even number in array
		for(int i=0;i<a.length;i++)
		{  
			if(a[i]%2==0) 
			System.out.println("Even Number are:"+a[i]);
			
		}
		
		Arrays.sort(a);
		System.out.println("\n Ascending order of array:");
		for (int n:a)
		{
		System.out.print(n+" ");	
		


	}
		sc.close();

	}
}
