import java.util.Scanner;

class Count{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String s =scanner.next();
        String string1 = string.replaceAll(s, "");
        int count = string.length()-string1.length();
        System.out.println(count);
    }
}