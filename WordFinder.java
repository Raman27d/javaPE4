import java.util.Scanner;

class WordFinder{
    public static void main(String[] args) {
        int i=0;
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String str = scanner.nextLine();
        int count =0;
        int len = str.length();
        do{
            i = string.indexOf(str, i+1);
            int x=len+i;
            if(i!=-1)System.out.println("Found at: "+ i +"-" + x);
        }while(i!=-1);

    }
}