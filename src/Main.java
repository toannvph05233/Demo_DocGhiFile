import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Nguoi> nguois = new ArrayList<>();
        DocGhiFileNhiPhan docGhiFile = new DocGhiFileNhiPhan();

        nguois.add(new Nguoi("ToAn1444444444", 4, "a", "a"));
        nguois.add(new Nguoi("ToAn24444444444", 4, "a", "a"));

        try {
            docGhiFile.ghiFile(nguois);
            nguois = docGhiFile.docFile();
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (Nguoi n:nguois) {
            System.out.println(n.ghi());
        }
    }
}
