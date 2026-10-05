import java.util.Scanner;

public class KalkulatorMethod {

    // Penjumlahan 2 angka
    static double tambah(double a, double b) {
        return a + b;
    }

    // Overloading: penjumlahan 3 angka
    static double tambah(double a, double b, double c) {
        return a + b + c;
    }

    // Pengurangan
    static double kurang(double a, double b) {
        return a - b;
    }

    // Perkalian
    static double kali(double a, double b) {
        return a * b;
    }

    // Pembagian
    static double bagi(double a, double b) {
        return a / b;
    }

    // Perpangkatan
    static double pangkat(double a, double b) {
        return Math.pow(a, b);
    }

    // Akar kuadrat
    static double akar(double a) {
        return Math.sqrt(a);
    }

    // Mencari nilai maksimum dari riwayat hasil
    static double riwayatKeMaksimum(double[] riwayatHasil, int jumlahRiwayat) {
        double maksimum = riwayatHasil[0];

        for (int i = 1; i < jumlahRiwayat; i++) {
            if (riwayatHasil[i] > maksimum) {
                maksimum = riwayatHasil[i];
            }
        }

        return maksimum;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Array untuk menyimpan riwayat hasil
        double[] riwayatHasil = new double[100];
        int jumlahRiwayat = 0;

        int pilihan;

        do {
            System.out.println("\n=== KALKULATOR METHOD ===");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Pangkat");
            System.out.println("6. Akar");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();

            double hasil;

            switch (pilihan) {

                case 1:
                    System.out.print("Masukkan angka pertama: ");
                    double a = input.nextDouble();

                    System.out.print("Masukkan angka kedua: ");
                    double b = input.nextDouble();

                    hasil = tambah(a, b);
                    System.out.println("Hasil: " + hasil);

                    riwayatHasil[jumlahRiwayat] = hasil;
                    jumlahRiwayat++;
                    break;

                case 2:
                    System.out.print("Masukkan angka pertama: ");
                    a = input.nextDouble();

                    System.out.print("Masukkan angka kedua: ");
                    b = input.nextDouble();

                    hasil = kurang(a, b);
                    System.out.println("Hasil: " + hasil);

                    riwayatHasil[jumlahRiwayat] = hasil;
                    jumlahRiwayat++;
                    break;

                case 3:
                    System.out.print("Masukkan angka pertama: ");
                    a = input.nextDouble();

                    System.out.print("Masukkan angka kedua: ");
                    b = input.nextDouble();

                    hasil = kali(a, b);
                    System.out.println("Hasil: " + hasil);

                    riwayatHasil[jumlahRiwayat] = hasil;
                    jumlahRiwayat++;
                    break;

                case 4:
                    System.out.print("Masukkan angka pertama: ");
                    a = input.nextDouble();

                    System.out.print("Masukkan angka kedua: ");
                    b = input.nextDouble();

                    if (b != 0) {
                        hasil = bagi(a, b);
                        System.out.println("Hasil: " + hasil);

                        riwayatHasil[jumlahRiwayat] = hasil;
                        jumlahRiwayat++;
                    } else {
                        System.out.println("Tidak dapat membagi dengan nol.");
                    }
                    break;

                case 5:
                    System.out.print("Masukkan bilangan: ");
                    a = input.nextDouble();

                    System.out.print("Masukkan pangkat: ");
                    b = input.nextDouble();

                    hasil = pangkat(a, b);
                    System.out.println("Hasil: " + hasil);

                    riwayatHasil[jumlahRiwayat] = hasil;
                    jumlahRiwayat++;
                    break;

                case 6:
                    System.out.print("Masukkan bilangan: ");
                    a = input.nextDouble();

                    if (a >= 0) {
                        hasil = akar(a);
                        System.out.println("Hasil: " + hasil);

                        riwayatHasil[jumlahRiwayat] = hasil;
                        jumlahRiwayat++;
                    } else {
                        System.out.println(
                                "Tidak dapat menghitung akar bilangan negatif."
                        );
                    }
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }

        } while (pilihan != 0);

        // Menampilkan nilai maksimum dari riwayat
        if (jumlahRiwayat > 0) {
            double maksimum = riwayatKeMaksimum(
                    riwayatHasil,
                    jumlahRiwayat
            );

            System.out.println("Nilai maksimum riwayat: " + maksimum);
        } else {
            System.out.println("Belum ada riwayat hasil.");
        }

        input.close();
    }
}