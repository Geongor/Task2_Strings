import org.apache.log4j.Logger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordsRemover {
    private StringBuilder text = new StringBuilder();

    public WordsRemover(String text) {
        this.text.append(text);
    }

    public String RemoveWords(int wordLength) {

        wordLength--;
        String regexp = "\\s*\\p{Punct}*\\b(?ui:[йцкнгшщзхфвпрлджчсмтб])[а-яА-Я]{" + wordLength + "}\\b\\p{Punct}*";
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(text);

        return matcher.replaceAll("");
    }

    public StringBuilder getText() {

        return text;
    }
}
