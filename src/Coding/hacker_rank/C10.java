package Coding.hacker_rank;

import java.util.*;
import java.util.regex.*;
/*

Sample Input 0

8
Julia
Samantha
Samantha_21
1Samantha
Samantha?10_2A
JuliaZ007
Julia@007
_Julia007
Sample Output 0

Invalid
Valid
Valid
Invalid
Invalid
Valid
Invalid
Invalid
 */

public class C10{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String username = in.nextLine();

            String pattern="^[a-zA-Z][a-zA-Z0-9_]{7,29}$";

            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(username);
            if(m.find()){
                System.out.println("Valid");
            }else{
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
}
