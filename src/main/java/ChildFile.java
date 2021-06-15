import java.util.*;
public class ChildFile extends BaseFile {
    String fileName;
    BaseFile opperatingFile;
    int sum = 0;
    public ChildFile (String file){
        this.fileName = file;
        this.opperatingFile = new BaseFile(fileName);
    }
    public String sumOfLine(){
        int sumOfLine = 0;
        String line = opperatingFile.readNextLine();
        if(line == null){
            return null;
        }
        StringTokenizer st = new StringTokenizer(line,",");
        while(st.hasMoreTokens()){
          int num = Integer.parseInt(st.nextToken());
          sum+=num;
        }
        return "";
    }


}
