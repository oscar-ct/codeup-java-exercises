public class java_warmups {


    public static char returnFirstCapitalLetter (String word) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == Character.toUpperCase(word.charAt(i))) {
                return word.charAt(i);
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        System.out.println(returnFirstCapitalLetter("hellO"));
        System.out.println(returnFirstCapitalLetter("hello"));
        System.out.println( returnFirstCapitalLetter("hEllo"));
        System.out.println(returnFirstCapitalLetter("hELlO"));
        System.out.println( returnFirstCapitalLetter("H"));
        returnFirstCapitalLetter("hellO"); // returns 'O'
        returnFirstCapitalLetter("hello"); // returns ' '
        returnFirstCapitalLetter("hEllo"); // returns 'E'
        returnFirstCapitalLetter("hELlO"); // returns 'E'
        returnFirstCapitalLetter("H"); // returns 'H'

    }
}
