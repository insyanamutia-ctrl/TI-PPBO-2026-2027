public class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(String merek, int kecepatanMaks, int jumlahPintu) {
        super(merek, kecepatanMaks); // harus baris pertama
        this.jumlahPintu = jumlahPintu;
    }

    // Latihan 4: akses langsung atribut protected
    public void tampilkanInfo() {
        System.out.println("Merek: " + merek);
        System.out.println("Kecepatan Maks: " + kecepatanMaks + " km/jam");
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}