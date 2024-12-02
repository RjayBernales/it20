/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package topic_5_recursion;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ArraySum {
    public int sum(int[] arr, int n) {
        if (n <= 0) {
            return 0;
        }
        // Recursive case
        return arr[n - 1] + sum(arr, n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArraySum calculator = new ArraySum();
        
	System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        
        System.out.println("The size of the array is: " + size);
        System.out.println();
    }
}
