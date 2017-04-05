package day6;

import java.util.Scanner;

/**
 * @author: chaudharimehul
 * @date:	Apr 5, 2017
 * Sample Input

2
Hacker
Rank
Sample Output

Hce akr
Rn ak
 */
public class Solution {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int numOfInput = userInput.nextInt();
        String[] inputStr = new String[numOfInput];
        String[] evenIndexStr = new String[numOfInput];
        String[] oddIndexStr = new String[numOfInput];
        userInput.nextLine();
        for(int i = 0 ; i < numOfInput; i++){
            inputStr[i] = userInput.nextLine();
            evenIndexStr[i]="";
            oddIndexStr[i]="";
            for(int k = 0 ; k < inputStr[i].length() ; k++){
                if((k % 2) == 0 ){
                    evenIndexStr[i] = evenIndexStr[i] + inputStr[i].charAt(k);
                }
                else{
                    oddIndexStr[i] = oddIndexStr[i] + inputStr[i].charAt(k);
                }
            }
        }
        for(int i = 0 ; i < numOfInput; i++){
            System.out.println(evenIndexStr[i] + " " + oddIndexStr[i]);
        }
        userInput.close();
    }
}