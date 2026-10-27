public class Produuk {
    private int kode_Produk;
    private String nama_Produk;
    private double harga;
    private int stok;

    public Produuk (int kode_Produk, String nama_Produk, double harga, int stok){
        this.kode_Produk=kode_Produk;
        this.nama_Produk=nama_Produk;
        this.harga=harga;
        this.stok=stok;
    }
    //getter untuk semua atribut
    public int getKode_Produk(){
        return kode_Produk;
    }
    public String getNama_Produk(){
        return nama_Produk;
    }
    public double getHarga(){
        return harga;
    }
    public int getStok(){
        return stok;
    }
    public void setHarga(double harga){ //setter
        if (harga>=0){
            this.harga=harga;
        }else{
            System.out.println("Harga tidak boleh negatif");
        }

    }
    //method tambah stok
    public void tambahStok(int jumlah){
        if (jumlah>0){
            stok+= jumlah;
            System.out.println("Stok berhasil ditambah " + stok);
        }else{
            System.out.println("Jumlah tambahan stok harus positif");
        }
    }
    //method kurangi stok
    public void kurangiStok(int jumlah){
        if (jumlah<=0){
            System.out.println("Jumlah pengurangan harus positif");
        }else if (stok >jumlah){
            System.out.println("Pengurangan stok gagal, stok tidak mencukupi");
        }else{
            stok-=jumlah;
            System.out.println("Stok berhasil dikurangkan" +stok);
        }
    }
}
