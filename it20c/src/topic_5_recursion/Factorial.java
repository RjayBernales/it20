/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package topic_5_recursion;

/**
 *
 * @author Admin
 */
public class Factorial {
     public int factorial(int n) {
	        if (n == 0 || n == 1) {
	            return 1;
	        } else {
	            // Recursive case
	            return n * factorial(n - 1);
	        }
	    }
}
