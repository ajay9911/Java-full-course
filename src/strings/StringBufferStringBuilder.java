package strings;

public class StringBufferStringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("hello world ");
        System.out.println(stringBuilder);
        stringBuilder.append("I am Ajay");
        System.out.println(stringBuilder);

        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("Ajay ");
        stringBuffer.append("Kumar ");
        stringBuffer.append("I am Student");
        System.out.println(stringBuffer);
    }
}
