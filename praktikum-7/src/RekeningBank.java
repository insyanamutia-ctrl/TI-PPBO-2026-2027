public class RekeningBank {
    private String nomorRekening;
    private String pemilik;
    private String jenisRekening; //read only
    private double saldo;

//contructor
    public RekeningBank(String nomor, String pemilik, String jenisRekening,double saldoAwal) {
        this.nomorRekening = nomor;
        this.pemilik = pemilik;
        this.jenisRekening=jenisRekening;
        this.saldo = (saldoAwal >= 0) ? saldoAwal : 0;
    }

    //getter
    public String getNomorRekening() {
        return nomorRekening;
    }
    public String getPemilik() {
        return pemilik;
    }
    public String getJenisRekening(){return jenisRekening;}
    public double getSaldo() {return saldo;
    }

    //Method transaksi
    public void setor(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah setor harus lebih dari 0");
            return;

        }
        saldo += jumlah;
        System.out.println("Setor berhasil "+jumlah+  " ke rekening " +nomorRekening+ ". Atas Nama:"+pemilik+". Saldo :" + saldo);
    }

    public void tarik(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah tarik harus lebih dari 0");
        } else if (jumlah > saldo) {
            System.out.println("Saldo tidak mencukupi");
        } else {
            saldo -= jumlah;
            System.out.println("Tarik berhasil "+jumlah+  " ke rekening " +nomorRekening+ ". Atas Nama:"+pemilik+". Saldo :" + saldo);
        }
    }
    public void transferKe(RekeningBank tujuan, double jumlah) {
        if (tujuan == null) {
            System.out.println("[Gagal Tf] Rekening tujuan tidak valid.");
            return;
        }
        if (jumlah <= 0) {
            System.out.println("[Gagal Tf] Jumlah transfer harus lebih dari 0.");
            return;
        }
        if (jumlah > saldo) {
            System.out.println("[Gagal Tf] Transfer gagal. Saldo pengirim (" + pemilik + ") tidak mencukupi!");
            return;
        }

        //proses eksekusi tf
        this.saldo -= jumlah;
        tujuan.saldo += jumlah;
        System.out.printf("[Tf Berhasil] Rp%.2f dari %s ke %s.\n", jumlah, this.pemilik, tujuan.getPemilik());
    }
    public void cetakMutasi(){
        System.out.println(" No. Rekening   : " + nomorRekening);
        System.out.println(" Nama Pemilik   : " + pemilik);
        System.out.println(" Jenis Rekening : " + jenisRekening);
        System.out.printf(" Saldo Saat Ini : Rp%.2f\n", saldo);
    }
}