import java.io.IOException;

public class Main extends BaseFile {
    public static void main(String[] args) throws IOException {
        System.out.println("hello");
        BaseFile file = new BaseFile("/Users/anshulfiles/Documents/projects/maven_for_file_num_sum/src/main/java/test.txt");
        String res = file.readNextLine();
        res = file.readNextLine();
        System.out.println(res);
    }
}
