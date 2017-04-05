package day14;

import java.util.Scanner;

class Difference {
  	private int[] elements;
  	public int maximumDifference;
// Add your code here
Difference(int[] elements){
    this.elements = elements;
}

void computeDifference(){
    maximumDifference = Integer.MIN_VALUE;
    int maximum = Integer.MIN_VALUE;
    int minimum = Integer.MAX_VALUE;
    for(int i = 0 ; i < elements.length ; i++){
        maximum = ( elements[i] > maximum ) ? elements[i]:maximum;
        minimum = ( elements[i] < minimum ) ? elements[i]:minimum;
    }
    maximumDifference = maximum - minimum;
} 
} // End of Difference class
/**
 * @author: chaudharimehul
 * @date:	Apr 2, 2017
 * 
 * Sample Input

3
1 2 5
Sample Output

4
 */
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}