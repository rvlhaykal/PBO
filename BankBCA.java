class BankBCA extends Bank {

    @Override
    void sukuBunga() {
        System.out.println("Suku bunga Bank BCA adalah 4.5%");
    }

    @Override
    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        System.out.println("Transfer " + jumlah + " ke rekening " + rekeningTujuan +
                " di bank " + bankTujuan + " (BCA)");
    }
}