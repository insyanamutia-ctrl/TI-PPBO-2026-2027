import java.util.Scanner;

public class PengolahanNilaiKelas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Nilai KKM (Kriteria Ketunttasan minimal)

        final int KKM = 70;

        //a) input jumlah mahasiswa N daninput nilai ke array
        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int n = sc.nextInt();

        int[] nilai = new int[n];
        int total = 0;

        System.out.println("\n--Input Nilai Mahasiswa--");
        for (int i = 0; i < n; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
            total += nilai[i];  // Penjumlahan akumulatif untuk rata-rata
        }

        //Simpan salinan array asli sebelum diurutkan
        int[] nilaiawal = new int[n];
        for (int i = 0; i < n; i++) {
            nilaiawal[i] = nilai[i];
        }
        // b) Hitung rata-rata, tertinggi, terrendah, dan status kelulusan
        double rataRata = (double) total / n;
        int tertinggi = nilai[0];
        int terrendah = nilai[0];
        int jumlahLulusa = 0;
        int jumlahTidaklulus = 0;

        for (int i = 0; i < n; i++) {
            //Evaluasi Nilai Tertinggi & terendah
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terrendah) {
                terrendah = nilai[i];
            }
            //Evaluasi Kelulusan berdasarkan KKM (70)
            if (nilai[i] >= KKM) {
                jumlahLulusa++;
            } else {
                jumlahTidaklulus++;
            }
        }
        //c) urutkan array secara ascending menggukan bubble sort manual
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (nilai[j] > nilai[j + 1]) {
                    // Pertukaran elemen (Swap)
                    int temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }
        // d) Format Laporan Output
        System.out.println("\n==========================================");
        System.out.println("          LAPORAN HASIL UJIAN             ");
        System.out.println("==========================================");
        System.out.println("Jumlah Mahasiswa     : " + n);
        System.out.println("Batas KKM            : " + KKM);
        System.out.printf("Rata-rata Kelas      : %.2f\n", rataRata);
        System.out.println("Nilai Tertinggi      : " + tertinggi);
        System.out.println("Nilai Terendah       : " + terrendah);
        System.out.println("Jumlah Mahasiswa Lulus    : " + jumlahLulusa+ " orang");
        System.out.println("Jumlah Tidak Lulus        : " + jumlahTidaklulus + " orang");
        System.out.println("------------------------------------------");

        // Menampilkan array sebelum dan sesudah sorting
        System.out.print("Nilai Sebelum Diurutkan : ");
        for (int x : nilaiawal) {
            System.out.print(x + " ");
        }
        System.out.println();

        System.out.print("Nilai Setelah Diurutkan : ");
        for (int x : nilai) {
            System.out.print(x + " ");
        }
    }
}