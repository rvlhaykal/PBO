public class mahasiswa {
    private String nim;
    private String nama;
    private int nilai;
    private String grade;
    private boolean lulus;

    // Constructor
    public mahasiswa(String nim, String nama, int nilai) {
        this.nim = nim;
        this.nama = nama;
        this.nilai = nilai;
        tentukanGrade();
    }

    // Method untuk menentukan grade
    private void tentukanGrade() {
        if (nilai >= 80 && nilai <= 100) {
            grade = "A";
            lulus = true;
        } else if (nilai >= 70 && nilai <= 79) {
            grade = "B";
            lulus = true;
        } else if (nilai >= 60 && nilai <= 69) {
            grade = "C";
            lulus = true;
        } else if (nilai >= 50 && nilai <= 59) {
            grade = "D";
            lulus = false;
        } else if (nilai >= 0 && nilai < 50) {
            grade = "E";
            lulus = false;
        } else {
            grade = "Nilai salah";
            lulus = false;
        }
    }

    // Getter
    public String getNim() { return nim; }
    public String getNama() { return nama; }
    public int getNilai() { return nilai; }
    public String getGrade() { return grade; }
    public boolean isLulus() { return lulus; }

    // Method untuk menampilkan data
    public void tampilkanData() {
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Nilai : " + nilai);
        System.out.println("Grade : " + grade);
        System.out.println("===========================================");
    }
}