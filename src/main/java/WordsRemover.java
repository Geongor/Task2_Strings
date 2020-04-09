import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordsRemover {

    public void RemoveWords() {

        String regexp = "\\s*\\b(?ui:[йцкнгшщзхфвпрлджчсмтб])[а-яА-Я]{4}\\b";
        String test = "слова В некотором предложении текста слова заданной длины заменить указанной подстрокой, длина которой может не совпадать с длиной слова.";
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(test);

        String test2 = matcher.replaceAll("");
        System.out.println(test2);
    }

}
