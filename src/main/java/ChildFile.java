import java.util.StringTokenizer;
public class ChildFile extends BaseFile {
    BaseFile operatingFile;
    int sum;
    public ChildFile (BaseFile base){
        this.operatingFile = base;
    }
    private void sumOfLine(){
        String line = operatingFile.readNextLine();
        if(line == null){
           return;
        }

    }

}
