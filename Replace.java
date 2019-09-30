import java.util.Scanner;

class Replace{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        string = string.replaceAll("d","f");
        string = string.replaceAll("l","t");
        System.out.println(string);
    }
}