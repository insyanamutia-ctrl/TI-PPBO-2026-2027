import java.util.Scanner;
public  class UmurdanStatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan umur kamu: ");
        int umur = sc.nextInt();

        System.out.print("Apakah Kamu seorang Mahasiswa? (true/false): ");
        boolean isMahasiswa = sc.hasNextBoolean();

        //logika penentuan tiket//
        if (isMahasiswa && umur < 30){
            System.out.println("Harga tiket: Rp 30.000 (Mendapat harga khusus)");
        }else{
            System.out.println("Harga tiket: Rp 50.000 (Harga normal)");
        }
    }
}