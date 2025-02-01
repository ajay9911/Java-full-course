package Coding.pattern;

public class RightHalfPyramid {

    public static void main(String[] args) {
        rightHalfPyramid();

    }

    public static void rightHalfPyramid(){
        for(int i=1;i<=5;i++){

            for (int j=1;j<i;j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
