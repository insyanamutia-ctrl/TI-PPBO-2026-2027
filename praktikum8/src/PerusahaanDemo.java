public class PerusahaanDemo {
    public static void main(String[] args) {
        Manager mgr = new Manager("Budi", "M001", 8000000, 2000000);
        Staff stf = new Staff("Sari", "S001", 5000000, 1000000);
        Direktur dir = new Direktur("Andi", "D001", 15000000, 5000000, 3000000);

        mgr.tampilkanData();
        System.out.println();
        stf.tampilkanData();
        System.out.println();
        dir.tampilkanData(); // warisan lewat 2 tingkat
    }
}