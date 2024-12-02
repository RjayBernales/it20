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
public class ArraySum {
    public int sum(int[] arr, int n) {
        if (n <= 0) {
            return 0;
        }
        // Recursive case
        return arr[n - 1] + sum(arr, n - 1);
    }
}
