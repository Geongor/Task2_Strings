import java.io.FileInputStream;
import java.io.IOException;

public class ReaderFromFile {

    public static String ReadFromFile(String path){
        try {

            FileInputStream inFile = new FileInputStream(path);
            byte[] str = new byte[inFile.available()];
            inFile.read(str);
            return new String(str);
        }
        catch (IOException e) {

            System.out.println("Ошибка чтения с файла! Файл не был прочитан!");
            System.exit(-1);
            return "";
        }
    }
}
