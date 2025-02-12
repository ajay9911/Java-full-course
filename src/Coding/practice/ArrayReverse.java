package Coding.practice;




import java.util.*;

class ArrayReverse {
    public  static void reverseString(char[] s) {
        List<Character> list = new ArrayList<>();
        for (char c : s) list.add(c);  // Convert array to list
        Collections.reverse(list);  // Reverse the list
        for (int i = 0; i < s.length; i++) s[i] = list.get(i);  // Convert back to array
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        char[] s = {'h', 'e', 'l', 'l', 'o'};
        System.out.println("Original: " + Arrays.toString(s));

        reverseString(s);

        System.out.println("Reversed: " + Arrays.toString(s));
    }
}
