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
public class Fibonacci {
    public int fibonacci(int n) {
		 // Base cases
	     if (n == 0) return 0;
	     if (n == 1) return 1;

	     // Recursive case
	     return fibonacci(n - 1) + fibonacci(n - 2);
	  }
    public static void main(String[] args) {
	     
		 Scanner sc = new Scanner(System.in);
    }
}
