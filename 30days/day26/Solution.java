package day26;

import java.util.Scanner;

/**
 * @author: chaudharimehul
 * @date:	Apr 6, 2017
 * Sample Input

9 6 2015
6 6 2015
Sample Output

45
 */
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int actualDay = in.nextInt();
        int actualMonth = in.nextInt();
        int actualYear = in.nextInt();
        
        int expectedDay = in.nextInt();
        int expectedMonth = in.nextInt();
        int expectedYear = in.nextInt();
        
        if(actualYear > expectedYear){
            System.out.println(10000*1);
        }else if( (actualMonth > expectedMonth) && (actualYear == expectedYear) ){
            System.out.println((actualMonth-expectedMonth)*500);
        }else if((actualDay > expectedDay) &&  (actualYear == expectedYear) ){
            System.out.println((actualDay - expectedDay) * 15);
        }else{
            System.out.println("0");
        }
        in.close();
    }
}