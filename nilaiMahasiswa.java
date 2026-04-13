import java.util.ArrayList;

public class nilaiMahasiswa {
    public static void main(String[] args) {
        ArrayList<mahasiswa> daftar = new ArrayList<>();

        // Data mahasiswa langsung dimasukkan (hardcode)
        daftar.add(new mahasiswa("1102020", "Budi", 80));
        daftar.add(new mahasiswa("1102021", "Aris", 79));
        daftar.add(new mahasiswa("1102022", "Fahmi", 90));
        daftar.add(new mahasiswa("1102023", "Cahyo", 50));

        // Tampilkan data mahasiswa
        for (mahasiswa m : daftar) {
            m.tampilkanData();
        }

        // Hitung statistik
        int totalNilai = 0;
        int lulusCount = 0;
        int tidakLulusCount = 0;
        ArrayList<String> namaLulus = new ArrayList<>();
        ArrayList<String> namaTidakLulus = new ArrayList<>();
        int gradeA = 0, gradeB = 0, gradeC = 0, gradeD = 0, gradeE = 0;

        for (mahasiswa m : daftar) {
            totalNilai += m.getNilai();
            if (m.isLulus()) {
                lulusCount++;
                namaLulus.add(m.getNama());
            } else {
                tidakLulusCount++;
                namaTidakLulus.add(m.getNama());
            }

            switch (m.getGrade()) {
                case "A": gradeA++; break;
                case "B": gradeB++; break;
                case "C": gradeC++; break;
                case "D": gradeD++; break;
                case "E": gradeE++; break;
            }
        }

        double rataRata = (double) totalNilai / daftar.size();

        // Tampilkan hasil akhir
        System.out.println("Jumlah Mahasiswa : " + daftar.size());
        System.out.println("Jumlah Mahasiswa yg Lulus : " + lulusCount + " yaitu " + namaLulus);
        System.out.println("Jumlah Mahasiswa yg Tidak Lulus : " + tidakLulusCount + " yaitu " + namaTidakLulus);
        System.out.println("Jumlah Mahasiswa dengan Nilai A = " + gradeA + " yaitu " + (gradeA>0?namaLulus:""));
        System.out.println("Jumlah Mahasiswa dengan Nilai B = " + gradeB);
        System.out.println("Jumlah Mahasiswa dengan Nilai C = " + gradeC);
        System.out.println("Jumlah Mahasiswa dengan Nilai D = " + gradeD);
        System.out.println("Jumlah Mahasiswa dengan Nilai E = " + gradeE);
        System.out.println("Rata-rata nilai mahasiswa adalah : " + rataRata);
    }
}