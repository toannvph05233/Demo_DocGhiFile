import java.io.*;
import java.util.ArrayList;

public class DocGhiFileNhiPhan {
    public void ghiFile(ArrayList<Nguoi> list) throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream("nhiPhan.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);
        oos.writeObject(list);
        oos.close();
    }

    public ArrayList<Nguoi> docFile() throws Exception {
        FileInputStream fileInputStream = new FileInputStream("nhiPhan.txt");
        ObjectInputStream ois = new ObjectInputStream(fileInputStream);
        ArrayList<Nguoi> list = (ArrayList<Nguoi>) ois.readObject();
        ois.close();
        return list;
    }
}
