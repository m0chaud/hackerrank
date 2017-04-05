package day10;

import java.util.Scanner;

/**
 * @author: chaudharimehul
 * @date:	Apr 5, 2017
 * Sample Input 1

5
Sample Output 1

1
Sample Input 2

13
Sample Output 2

2
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int maxOneCount = 0;
        int oneCount = 0;
        while(n > 0){
            if((n%2) == 1){
                oneCount++;
            }else{
                oneCount = 0;
            }
            if(oneCount > maxOneCount){
                maxOneCount = oneCount;
            }
            n = n/2;
        }
        System.out.println(maxOneCount);
        in.close();
    }
}
