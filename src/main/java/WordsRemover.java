import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordsRemover {

    public String RemoveWords(String text) {

        String regexp = "\\s*\\b(?ui:[йцкнгшщзхфвпрлджчсмтб])[а-яА-Я]{4}\\b";
        StringBuilder sb = new StringBuilder();
        sb.append(text);
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(sb);

        return matcher.replaceAll("");
    }

}
