package day28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * @author: chaudharimehul
 * @date:	Apr 6, 2017
 * Sample Input

6
riya riya@gmail.com
julia julia@julia.me
julia sjulia@gmail.com
julia julia@gmail.com
samantha samantha@gmail.com
tanya tanya@gmail.com
Sample Output

julia
julia
riya
samantha
tanya
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> names = new ArrayList<String>();
        int N = in.nextInt();
        //Pattern p = Pattern.compile("^(.+)@gmail\\.com$");
        Pattern p = Pattern.compile("^[A-Za-z0-9+._-]+@gmail\\.com$");
        for(int a0 = 0; a0 < N; a0++){
            String firstName = in.next();
            String emailID = in.next();
            Matcher m = p.matcher(emailID);
            if(m.find()){
                names.add(firstName);
            }
        }
        Collections.sort(names);
        for(String n: names){
            System.out.println(n);
        }
        in.close();
    }
}

