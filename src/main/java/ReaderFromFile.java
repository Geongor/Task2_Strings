import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;

public class ReaderFromFile {

    private static final Logger log = Logger.getLogger(ReaderFromFile.class);

    public static String ReadFromFile(String path){
        try {

            FileInputStream inFile = new FileInputStream(path);
            byte[] str = new byte[inFile.available()];
            inFile.read(str);
            log.info("Файл прочитан");
            return new String(str);
        }
        catch (IOException e) {

            System.out.println("Ошибка чтения с файла! Файл не был прочитан!");
            log.error("Файл не прочитан");
            System.exit(-1);
            return "";
        }
    }
}
