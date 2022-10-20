Hb/*
 * Wap to print ascending and descending order of an array
 * Date:-20/10/22
 * Name:- Darshana Parab
 */

import java.util.*;
public class ArraySorting {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Integer[] arr = new Integer[5];
        int i;
        System.out.println("Please Enter 5 elements in the Array : ");
        for (i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        
        //printing numbers in Ascending order
        Arrays.sort(arr);
        System.out.println("Sorted Array in Ascending Order " + Arrays.toString(arr));
        
        // printing numbers in Descending order
        Arrays.sort(arr,Comparator.reverseOrder());
        System.out.println("Sorted Array in Descending Order " + Arrays.toString(arr));
    }
}
