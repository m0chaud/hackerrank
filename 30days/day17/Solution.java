package day17;

import java.util.Scanner;

//Write your code here
class Calculator{
  public int power(int n, int p) throws Exception{
      int powerValue = 1;
      if(n < 0 || p < 0){
          throw new Exception("n and p should be non-negative");
      }
      for(int i = 0 ; i < p ; i++){
          powerValue = powerValue * n;
      }
      return powerValue;
  } 
}
/**
 * @author: chaudharimehul
 * @date:	Apr 2, 2017
 * Sample Input

4
3 5
2 4
-1 -2
-1 3
Sample Output

243
16
n and p should be non-negative
n and p should be non-negative
 */
class Solution{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}

