import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Nguoi> nguois = new ArrayList<>();
        DocGhiFile docGhiFile = new DocGhiFile();

        try {
            docGhiFile.docFile(nguois);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                DocGhiFile.bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        for (Nguoi n : nguois) {
            System.out.println(n.ghi());
        }

    }
}
