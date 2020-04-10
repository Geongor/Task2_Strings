import org.testng.Assert;
import org.testng.annotations.Test;

public class WordsRemoverTest {

    private WordsRemover wordsRemover = new WordsRemover("Арена,      Глина (Гольф) Афера. зебра. слово");

    @Test
    public  void  testRemoveWords_mustPrintTextWithout5LetterWords(){

        Assert.assertEquals("Арена, Афера.", wordsRemover.RemoveWords(5));
    }

    @Test
    public  void  testGetText_mustPrintOriginalText(){

        StringBuilder st = new StringBuilder();
        st.append("Арена,      Глина (Гольф) Афера. зебра. слово");
        Assert.assertEquals(st, wordsRemover.getText());
    }
}
