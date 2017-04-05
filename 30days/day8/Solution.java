package day8;

//Complete this code or write your own from scratch
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author: chaudharimehul
 * @date:	Apr 5, 2017
 * Sample Input

3
sam 99912222
tom 11122222
harry 12299933
sam
edward
harry
Sample Output

sam=99912222
Not found
harry=12299933
 */
class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Map<String,Integer> phoneBook = new HashMap<String,Integer>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name,phone);
            // Write code here
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(phoneBook.containsKey(s)){
                System.out.println(s+"="+phoneBook.get(s));
            }else{
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
