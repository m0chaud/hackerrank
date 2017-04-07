package day29;

import java.util.Scanner;

/**
 * @author: chaudharimehul
 * @date:	Apr 6, 2017
 * Sample Input

3
5 2
8 5
2 2
Sample Output

1
4
0
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int maxKvalue = Integer.MIN_VALUE;
            for(int i = 1 ; i <=n ; i++){
                for(int ki = i+1; ki <=n ; ki++){
                    if((i & ki) < k){
                        maxKvalue =  (maxKvalue < (i&ki))?i&ki:maxKvalue;
                    }
                }
            }
            System.out.println(maxKvalue);
        }
        in.close();
    }
}