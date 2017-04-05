package day7;

import java.util.Scanner;


/**
 * @author: chaudharimehul
 * @date:	Apr 5, 2017
 *Sample Input

4
1 4 3 2
Sample Output

2 3 4 1 
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int[] reveresedArr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
            reveresedArr[n-i-1] = arr[i];
        }
        in.close();
        for(int i : reveresedArr){
            System.out.print(i +" ");
        }
        System.out.println();
    }
}