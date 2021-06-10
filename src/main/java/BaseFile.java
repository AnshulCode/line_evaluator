import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BaseFile {
    String fileName;
    BufferedReader reader;

    //constructor, takes in file name parameter, creates Buffer reader
    BaseFile(String fileName) {
        this.fileName = fileName;
        try {
            reader = new BufferedReader(new FileReader(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    BaseFile() {
    }

    //return next line in file, returns null if end of file reached
    public String readNextLine() {

        try {
            String line = reader.readLine();
            if (line != null) {
                return line;
            }
            reader.close();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
