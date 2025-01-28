package challenges;

import java.util.Arrays;

public class VariableArgument {
    public static void main(String[] args) {
        System.out.println(concatenate("ajay","vijay","sanjay"));

    }

    public static String concatenate(String... str){
        StringBuilder sb=new StringBuilder();
        for (String s : str) {
            sb.append(s).append(" ");


        }
        return sb.toString();
    }
}
