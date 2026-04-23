class BankBNI extends Bank {

    @Override
    void sukuBunga() {
        System.out.println("Suku bunga Bank BNI adalah 4%");
    }

    @Override
    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        System.out.println("Transfer " + jumlah + " ke rekening " + rekeningTujuan +
                " di bank " + bankTujuan + " (BNI)");
    }
}