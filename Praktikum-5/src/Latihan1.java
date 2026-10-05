public class Latihan1 {

    static double luasPersegiPanjang(double p, double l) {
        return p * l;
    }

    static double luasLingkaran(double r) {
        return Math.PI * r * r;
    }

    public static void main(String[] args) {
        double panjang = 10;
        double lebar = 5;
        double jariJari = 7;

        System.out.println("Luas Persegi Panjang: "
                + luasPersegiPanjang(panjang, lebar));

        System.out.println("Luas Lingkaran: "
                + luasLingkaran(jariJari));
    }
}