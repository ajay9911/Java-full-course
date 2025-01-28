package Coding.hacker_rank;

import java.io.*;
import java.math.*;
/*

Sample Input

13
Sample Output

prime
 */



public class C6 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        bufferedReader.close();
        BigInteger num = new BigInteger(n);

        // Check if the number is prime using isProbablePrime with certainty = 1
        // A certainty of 1 means the result is very likely correct
        if (num.isProbablePrime(1)) {
            System.out.println("prime");  // Print "prime" if the number is prime
        } else {
            System.out.println("not prime");  // Print "not prime" if it's not prime
        }
    }
}

