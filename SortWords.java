import java.util.*; 

class SortWords{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] strings =string.split(" ");
        List<String> words = Arrays.asList(strings);
        words.sort( Comparator.comparing( String::toString ) );
        for(String s: words){
            System.out.print(s + " ");
        }
    }
}