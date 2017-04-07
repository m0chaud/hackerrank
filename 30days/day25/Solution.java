package day25;

import java.util.Scanner;

/**
 * @author: chaudharimehul
 * @date:	Apr 6, 2017
 * Sample Input

3
12
5
7
Sample Output

Not prime
Prime
Prime
 */
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner in = new Scanner(System.in);
        int numOfTest = in.nextInt();
        int inputNumber;
        for(int i = 0 ; i < numOfTest ; i++){
            inputNumber = in.nextInt();
            if(inputNumber == 1){
                System.out.println("Not prime");
            }else if(inputNumber == 2){
                System.out.println("Prime");
            }else{
                boolean isPrime = true;
                for(int j = 2 ; j*j <= inputNumber ; j++){
                    //System.out.println(inputNumber);
                    //System.out.println(j);
                    //System.out.println(inputNumber%j);
                    if( inputNumber % j == 0){
                        System.out.println("Not prime");
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime){
                    System.out.println("Prime");
                }
            }
        }
        in.close();
    }
}
