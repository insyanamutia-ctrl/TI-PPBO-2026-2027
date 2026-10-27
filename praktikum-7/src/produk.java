public class produk {
    String namaProduk;
    double harga;

    public produk(String NamaProduk, double Harga) {
        this.namaProduk = NamaProduk;
        this.harga =Harga;
    }
 public boolean isMahal(double batasHarga){

     return harga > batasHarga;
 }
}
