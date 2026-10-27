public class TokoDemo {
    public static void main(String[] args) {
        // Array of Object berisi 5 Produk
        Produc[] daftarProduk = new Produc[5];
        daftarProduk[0] = new Produc("PRD01", "Laptop Gaming", 15000000.0, 5);
        daftarProduk[1] = new Produc("PRD02", "Mouse Wireless", 150000.0, 20);
        daftarProduk[2] = new Produc("PRD03", "Keyboard Mech", 750000.0, 2);
        daftarProduk[3] = new Produc("PRD04", "Monitor 24 Inch", 2100000.0, 8);
        daftarProduk[4] = new Produc("PRD05", "Headset Bluetooth", 450000.0, 15);

        //  Menampilkan seluruh data produk
        System.out.println("=== DAFTAR PRODUK TOKO ===");
        for (Produc p : daftarProduk) {
            p.tampilkanData();
        }
        System.out.println();

        //  Simulasi Pembelian (Sukses dan Gagal)
        System.out.println("=== SIMULASI TRANSAKSI ===");
        // Skenario 1: Stok mencukupi
        System.out.println("Transaksi 1: Membeli 5 Mouse Wireless");
        System.out.println("Total Bayar: Rp" + daftarProduk[1].TotalHarga(5));
        daftarProduk[1].kurangiStok(5);

        System.out.println();

        // skenario Stok TIDAK mencukupi
        System.out.println("Transaksi 2: Membeli 5 Keyboard Mech");
        System.out.println("Total Bayar: Rp" + daftarProduk[2].TotalHarga(5));
        daftarProduk[2].kurangiStok(5);

        System.out.println();

        //  Mencari Produk Termahal
        System.out.println("=== PRODUK TERMAHAL ===");
        Produc produkTermahal = daftarProduk[0];
        for (int i = 1; i < daftarProduk.length; i++) {
            if (daftarProduk[i].harga > produkTermahal.harga) {
                produkTermahal = daftarProduk[i];
            }
        }
        System.out.println("Produk Termahal adalah:");
        produkTermahal.tampilkanData();
    }
}