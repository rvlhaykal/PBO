import javax.swing.JOptionPane;

class BelajarDialog {
    private String pelajaran;

    public void inputPelajaran() {
        pelajaran = JOptionPane.showInputDialog(null, "Anda sedang belajar apa?");
    }

    public void tampilPesan() {
        JOptionPane.showMessageDialog(null, "Belajar " + pelajaran + " sangat mudah");
    }
}

public class Main {
    public static void main(String[] args) {
        BelajarDialog belajar = new BelajarDialog(); // membuat objek
        belajar.inputPelajaran();
        belajar.tampilPesan();
    }
}
