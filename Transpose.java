import java.util.Scanner;

class Transpose{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] strings = string.split(" ");
        String output = "";
        for(String s:strings){
            StringBuffer stringBuffer = new StringBuffer(s);
            stringBuffer.reverse();
            output+= stringBuffer.toString();
            output+=" ";
        }
        System.out.println(output);
    }
}