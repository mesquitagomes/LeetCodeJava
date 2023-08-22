package br.com.mesquitagomes.leetcodejava;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Unique combination of Boxes
 * 
 * Suppose you are given a set of boxes numbered from 0 to n. Each box has a unique binary representation based on the number of I's in its binary form.
 * Your task is to create an array of length n+l that contains the number of I's in the binary representation of each box number from O to n.
 * Write a function that takes n as input and returns the array with the required information?
 * 
 * Example 1:
 * Input: n = 3
 * Output: [0,1,1,2]
 * Explanation:
 * 0 --> 0
 * 1 --> 1
 * 2 --> 10
 * 3 --> 11
 * 
 * Example 2:
 * Input: n = 5
 * Output: [0,1,1,2,1,2]
 * Explanation:
 * 0 --> 0
 * 1 --> 1
 * 2 --> 10
 * 3 --> 11
 * 4 --> 100
 * 5 --> 101
 * 
 * Constraints:
 * 0 <= n <= 100000
 * 
 */
public class UniqueBinaryBox {

    public int[] solution(int n) {

        int[] result = new int[n + 1];

        for (int i = 0; i < result.length; i++) {
        
            String binaryI = Integer.toBinaryString(i);

            for (char ch : binaryI.toCharArray()) {
                if (ch == '1')
                    result[i] += 1;
            }
        }
        return result;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        sc.close();
        int[] output = new UniqueBinaryBox().solution(n);
        String[] sarr = Arrays.stream(output).mapToObj(String::valueOf).toArray(String[]::new);
        String result = String.join(",", sarr);

        if (result == "")
            System.out.println("[ ]");
        else
            System.out.println("[" + result + "]");
    }

}
