import java.io.*;

public class CSVCopy {
    public static void main(String[] args) {
        String sourceFile = "D:\\PBO\\tugas#11pbo\\student.csv";
        String destinationFile = "D:\\PBO\\tugas#11pbo\\copy_student.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(destinationFile))) {

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
            System.out.println("File berhasil disalin ke " + destinationFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
