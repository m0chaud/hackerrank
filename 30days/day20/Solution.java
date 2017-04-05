package day20;

import java.util.Scanner;

/**
 * @author: chaudharimehul
 * @date:	Apr 5, 2017
 * Sample Input 0

3
1 2 3
Sample Output 0

Array is sorted in 0 swaps.
First Element: 1
Last Element: 3
Sample Input 1

3
3 2 1
Sample Output 1

Array is sorted in 3 swaps.
First Element: 1
Last Element: 3

 */
public class Solution {

    public static int[] bubbleSort(int[] arrElements){
        
        int totalNumOfSwaps = 0;
        int swapValue;
        for(int i = 0 ; i < arrElements.length ; i++){
            int numOfSwaps = 0;
            
            for(int j = 0 ; j < (arrElements.length - 1) ; j++){
                if(arrElements[j] > arrElements[j+1]){
                    swapValue = arrElements[j+1];
                    arrElements[j+1] = arrElements[j];
                    arrElements[j] = swapValue;
                    numOfSwaps++;
                    totalNumOfSwaps++;
                }
            }
            if(numOfSwaps == 0){
                break;
            }
        }
        System.out.println("Array is sorted in " + totalNumOfSwaps + " swaps.");
        return arrElements;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        a = bubbleSort(a);
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n-1]);
        in.close();
    }
}
