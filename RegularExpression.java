import java.util.Scanner;

class RegularExpression{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] strings = string.split(" ");
        System.out.print("Is Harry here ? ");
        for(int i=0; i<strings.length; i++){
            if(strings[i].equals("Harry")){
                System.out.println(strings[i].equals("Harry"));
                return ;
            }
        }System.out.println(false);
    }
}