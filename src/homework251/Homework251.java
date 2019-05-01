package homework251;
import java.io.IOException;
public class Homework251 {
    public static void main(String[] args) {
        String pathFrom = ".\\testFrom";
        String pathTo = ".\\testTo";
        String fileFilter = "docx";
        try {
            CopyFolder.copyFolder(pathFrom, pathTo, fileFilter);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
