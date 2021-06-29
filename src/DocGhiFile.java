import java.io.*;
import java.util.ArrayList;

public class DocGhiFile {
    File nguoi = new File("nguoi.csv");
    String tieuDe = "Name,Age,Gender,Phone";
    static BufferedWriter bufferedWriter;
    static BufferedReader bufferedReader;

    public void ghiFile(ArrayList<Nguoi> list) throws Exception {
        FileWriter fileWriter = new FileWriter(nguoi);
        bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(tieuDe);
        for (Nguoi n : list) {
            bufferedWriter.newLine();
            bufferedWriter.write(n.ghi());
        }
    }

    public void docFile(ArrayList<Nguoi> list) throws Exception {
        FileReader fileReader = new FileReader(nguoi);
        bufferedReader = new BufferedReader(fileReader);
        String line = bufferedReader.readLine();
        while ((line = bufferedReader.readLine()) != null) {
            String[] arr = line.split(",");
            list.add(new Nguoi(arr[0], Integer.parseInt(arr[1]), arr[2], arr[3]));
        }
    }
}
