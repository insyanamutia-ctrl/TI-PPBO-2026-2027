public class mahasiswa {
    String nama;
    String nim;
    double ipk;

    //Constructor default (tanpa parameter)
    public mahasiswa() {
        nama = "Belum disi";
        nim = "-";
        ipk = 0.0;
    }

    public mahasiswa(String namaAwal, String nimAwal, double ipkAwal) {
       this.nama= nama; // this.nama= atribut, nama=parameter
        this.nim= nim;
        this.ipk = ipk;
    }
}