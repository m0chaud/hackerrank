package day9;

import java.util.Scanner;

/**
 * @author: chaudharimehul
 * @date:	Apr 5, 2017
 *Sample Input

3
Sample Output

6 
 */
public class Solution {

    public int factorial(int n){
        int factValue;
        if(n <=0 ){
            System.out.println("Invalid input");
            return 0;
        }
        if(n == 1){
            return n;
        }
        factValue = n * factorial(n-1);
        //System.out.println(factValue);
        return factValue;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner userInput = new Scanner(System.in);
        Solution sol = new Solution();
        System.out.println(sol.factorial(userInput.nextInt()));
        
        userInput.close();
    }
}