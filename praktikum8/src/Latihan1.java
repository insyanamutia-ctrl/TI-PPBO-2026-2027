public class Latihan1 {
    public static void main(String[] args) {
        Kucing kc = new Kucing();
        kc.nama = "Meoong";

        System.out.println("Kucing: " + kc.nama);
        kc.bersuara();

        Anjing aj = new Anjing();
        aj.nama = "Guk guk";

        System.out.println("Anjing: " + aj.nama);
        aj.bersuara();
    }
}