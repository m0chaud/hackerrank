package day3;

import java.util.Scanner;
/**
 * @author: chaudharimehul
 * @date:	Apr 5, 2017
 * 
 * Sample Input 0

3
Sample Output 0

Weird
Sample Input 1

24
Sample Output 1

Not Weird
 */
public class Solution {
   
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt(); 
      scan.close();
      String ans="";
          
      // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
      if(n%2==1){
         ans = "Weird";
      }
      else{
          if(n >=2 && n <= 5){
             ans = "Not Weird"; 
          }
          else if(n >=6 && n <= 20 )
          {
              ans = "Weird";
          }
          else if(n > 20)
          {
              ans = "Not Weird";
          }
         // Complete the code 
      }
      System.out.println(ans);
   }
}
