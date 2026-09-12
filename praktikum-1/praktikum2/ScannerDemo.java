import java.util.Scanner;
    public class ScannerDemo {
        public static  void main (String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Masukkan Nama: ");
            String nama = sc.nextLine();

            System.out.println("Masukkan umur: ");
            int umur = sc.nextInt();

            System.out.print("Halo " + nama + ", umur anda " + umur + " tahun. ");

        }
    }

