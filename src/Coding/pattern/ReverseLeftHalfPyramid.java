package Coding.pattern;

public class ReverseLeftHalfPyramid {
    public static void main(String[] args) {
        reverseLeftHalfPyramid();

    }

    public static void reverseLeftHalfPyramid(){
        for (int i=1;i<=5;i++){
            for (int j=5;j>=i;j--){
                System.out.print(" ");
            }

            for (int k=1;k<=i;k++){
                System.out.println("*");
            }

            System.out.println();
        }
    }
}
