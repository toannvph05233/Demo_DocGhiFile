import java.io.*;
import java.util.ArrayList;

public class DocGhiFile {
    public static void main(String[] args) {
//        ghi();
        doc();
    }

    public static void ghi() {
        File nguoi = new File("nguoi.txt");
        FileWriter fileWriter = null;
        try {
            nguoi.createNewFile();
            fileWriter = new FileWriter(nguoi);
            fileWriter.write("nguyễn văn toàn");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void doc() {
        File nguoi = new File("nguoi.txt");
        try {
            FileReader fileReader = new FileReader(nguoi);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
