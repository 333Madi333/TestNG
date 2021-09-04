import java.util.Locale;

public class StringManipulation {

    public String ConvertFirstLetterToUppercase(String testWords) {
        String [] words = testWords.split(" ");
        String sentence = "";
        for ( String word : words) {
            String first = word.charAt(0)+"";
            String rest = word.substring(1);
            sentence += first.toUpperCase() + rest + " ";
        }
        return sentence.trim();
    }

    public  String ReturnInitials (String testWords){
        String [] words = testWords.split(" ");
        String sentence = "";
        for ( String word : words) {
            String first = word.charAt(0)+"";
            sentence += first.toUpperCase();
        }
        return sentence;
    }

}
