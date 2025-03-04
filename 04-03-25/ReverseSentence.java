public class ReverseSentence {

    private static void reverseSen(String str) {
        String[] splitWords = str.split("\s+");

        String reverseSentence = "";
        for (int i = splitWords.length - 1; i >= 0; i--) {
            // System.out.println(splitWords[i]);
            reverseSentence += splitWords[i] + " ";
        }

        System.out.println(reverseSentence);
    }

    public static void main(String[] args) {
        String str = "I Love Java   Programming"; 
        reverseSen(str);
    }
}
