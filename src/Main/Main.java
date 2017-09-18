package Main;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jesus on 02.09.2017.
 */
public class Main {

    static String fName = "C:\\JavaCreate\\IDEA2017\\FilesWorker\\src\\files\\f2.txt";
    static String text = "text 1";
    static String text2 = "text 2";

    public static void main(String [] args) throws FileNotFoundException {
       // FileWorker.write(fName, text);
        List<String> list = new ArrayList<String>();
        list = FileWorker.readWordsInList(fName);

        int i = 0;
        for (String s: list) {
            i++;
            System.out.println(i + " = " + s);
        }

       // FileWorker.delete(fName);

    }
}
