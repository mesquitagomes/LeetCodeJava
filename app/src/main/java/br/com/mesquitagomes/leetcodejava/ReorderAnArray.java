package br.com.mesquitagomes.leetcodejava;
/**
 * Reorder An Array
 * 
 * Given two arrays of integers, x and y. Create an array under these rules:
 *  • Initially, the new array arr, is empty.
 *  • From left to right read x[i] and y[i], insert the value x[i] at index y[i] in arr.
 *  • Repeat the previous step until all in x and y have been utilized.
 *  • Return arr.
 * There is no need to check that the values of y are valid.
 * 
 * Example:
 * Input: x
 * Output:
 * Explanation
 * x y arr
 * 1 0 [1]
 * 2 1 [1,2]
 * 3 2 [1,2,3]
 * 4 2 [1,2,4,3]
 * 
 * Constraints:
 *  • 1 x <= length, y.length <= 100
 *  • x.length == y.length
 *  • 0 <= x[i] <= 100
 *  • 0 <= y[i] <= i
 * 
 */
public class ReorderAnArray {
    
    public int[] solution(int[] x, int[] y) {
        
        int[] arr = new int[x.length];

        for(int i = 0; i < x.length; i++) {
            int index = y[i];
            if(arr[index] != 0) {
                arr[index + 1] = arr[index];
                arr[index] = x[i];
            } else
                arr[index] = x[i];
        }

        return arr;
    }

}
