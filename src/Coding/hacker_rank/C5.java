package Coding.hacker_rank;



import java.util.regex.*;
import java.util.*;
/*


Sample Input

000.12.12.034
121.234.12.12
23.45.12.56
00.12.123.123123.123
122.23
Hello.IP
Sample Output

true
true
true
false
false
false
 */

public class C5 {

    // MyRegex class is non-static
    public  static class MyRegex {
        // Regular expression to match valid IP address
        String pattern = "^([01]?\\d{1,2}|2[0-4]\\d|25[0-5])\\.([01]?\\d{1,2}|2[0-4]\\d|25[0-5])\\.([01]?\\d{1,2}|2[0-4]\\d|25[0-5])\\.([01]?\\d{1,2}|2[0-4]\\d|25[0-5])$";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MyRegex regex = new MyRegex(); // Instantiate MyRegex through the Solution instance
        Pattern pattern = Pattern.compile(regex.pattern);

        // Test input lines
        while (scanner.hasNext()) {
            String ip = scanner.nextLine();
            Matcher matcher = pattern.matcher(ip);
            System.out.println(matcher.matches());
        }

        scanner.close();
    }
}
