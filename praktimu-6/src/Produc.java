public class Produc {
    String kodeProduk;
    String namaProduk;
    double harga;
    int stok;

    public Produc (String Kodeproduk, String namaProduk, double harga, int stok){
        this.kodeProduk=Kodeproduk;
        this.namaProduk=namaProduk;
        this.harga=harga;
        this.stok=stok;
    }
    //method tampilin produc
    public void tampilkanData(){
        System.out.println("Kode Produk: " + kodeProduk);
        System.out.println("Nama Produk: " +namaProduk);
        System.out.println("Dengan Harga: " + harga);
        System.out.println("Sisa Stok: " + stok + "\n");

    }
    //method menghitung total harga
public double TotalHarga(int jumlahBeli){
        return harga*jumlahBeli;
}
//method mengurangi stok
public void kurangiStok(int jumlah){
 if (jumlah<=stok){
     stok-= jumlah;
     System.out.println("Pembelian berhasil (" + jumlah + "unit" + "). Stok tersisa: " + stok);

 }else {
     System.out.println("Gagal membeli" + namaProduk + "! Stok tidak mencukupi. (Diminta: " +jumlah + ", Stok ada: " +stok + ")");
 }
}

}
