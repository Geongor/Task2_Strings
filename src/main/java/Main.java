public class Main {
    public static void main(String[] args) {

        WordsRemover wordsRemover = new WordsRemover(ReaderFromFile.ReadFromFile("E:\\Task2_Strings\\test.txt"));
        System.out.println(wordsRemover.RemoveWords(5));
        System.out.println(wordsRemover.getText());
    }
}
