package day11;

import java.util.Scanner;

/**
 * @author: chaudharimehul
 * @date:	Apr 5, 2017
 * Sample Input

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
Sample Output

19
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int maxCount = Integer.MIN_VALUE;
        int sumValue = 0;
        for(int i=0; i < 4; i++){
            for(int j=0; j < 4; j++){
                sumValue = 0;
                sumValue = arr[i][j]  +  arr[i][j+1]   + arr[i][j+2] +
                                       arr[i+1][j+1]+
                           arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                if(sumValue > maxCount){
                    maxCount = sumValue;
                }
            }
        }
        System.out.println(maxCount);
        in.close();
    }
}
