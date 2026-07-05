import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class CSVWriter {
    public static void main(String[] args) {
        Path csvPath = Paths.get("student.csv");
        Scanner scanner = new Scanner(System.in);

        try {
            Files.createDirectories(csvPath.getParent() != null ? csvPath.getParent() : Paths.get("."));

            try (BufferedWriter bw = Files.newBufferedWriter(
                    csvPath,
                    StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND)) {
                System.out.print("Masukkan jumlah data yang ingin ditambahkan: ");
                int jumlah = scanner.nextInt();
                scanner.nextLine(); // konsumsi newline

                for (int i = 0; i < jumlah; i++) {
                    System.out.print("Masukkan NIM: ");
                    String nim = scanner.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan Umur: ");
                    String umur = scanner.nextLine();
                    System.out.print("Masukkan Prodi: ");
                    String prodi = scanner.nextLine();

                    String line = nim + ", " + nama + ", " + umur + ", " + prodi;
                    bw.write(line);
                    bw.newLine();
                }

                System.out.println("Data berhasil ditulis ke file " + csvPath.toAbsolutePath());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
