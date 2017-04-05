package day16;

import java.util.Scanner;

/**
 * @author: chaudharimehul
 * @date:	Apr 5, 2017
 * Sample Input 0

3
Sample Output 0

3
Sample Input 1

za
Sample Output 1

Bad String
 */
public class Solution {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try{
            Integer strToInt = Integer.parseInt(S);
            System.out.println(strToInt);
        }catch(NumberFormatException e){
            System.out.println("Bad String");
        }
        in.close();
    }
}