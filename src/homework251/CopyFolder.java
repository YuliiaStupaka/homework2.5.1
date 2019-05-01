package homework251;
import java.io.File;
import java.io.IOException;
public class CopyFolder {
    public static void copyFolder(String pathFrom, String pathTo, String fileFilter) throws IOException {
        File from = new File(pathFrom);
        File to = new File(pathTo);
        MyFileFilter myFileFilter = new MyFileFilter(fileFilter);
        if (from==null || to==null) {
            throw new IllegalArgumentException();
        }
        File[] filelist = from.listFiles(myFileFilter);
        for (int i=0; i<filelist.length; i++) {
            String newPath = filelist[i].getPath().replace(from.getPath(), to.getPath());
            IOStream.fileCopy(filelist[i], new File(newPath));
            System.out.println(filelist[i].getPath() + " copy to " + newPath + " size " + filelist[i].length() + " B");
        }
    }
}
