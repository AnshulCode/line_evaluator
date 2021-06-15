import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestCases {
    @Test
    void testCase(){
        String path = "/Users/anshulfiles/Documents/projects/maven_for_file_num_sum/src/main/java/test.txt";
        ChildFile child = new ChildFile(path);
        while(child.sumOfLine()!=null){
             child.sumOfLine();
        }
        System.out.println(child.sum);
    }


}
