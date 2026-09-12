import java.util.Scanner;

public class Biodatasaya {
    public static void main( String[] args){

        //Program menampilkan Biodata sederhana saya//
        System.out.println("Nama: Mutia Insyana");

        /*Dan kode program di bawah ini
        Akan menampilkan Nim dan Program Studi saya
         */
        System.out.println("Nim: 2025573010020");
        System.out.println("Program Studi: Teknik Informatika");


        /*2. ini program di modul bagian A
        yang sudah saya modifikasi
         */
        System.out.println("No.2");
        System.out.print("Nama: Mutia Insyana");
        System.out.print("_");
        System.out.print("NIM: 3010020");
        System.out.println();
        System.out.println();


        /* latihan no.3 Mendeklarasikan Variabel
        Bertipe int, double, char, dan boolean
        untuk data pribadi saya.
         */
            System.out.println("No.3");
            int umur = 20;
            double tinggi = 150;
            char inisial = 'B';
            boolean statusmahasiswa = true;

            System.out.println("Inisial: " + inisial);
            System.out.println("Umur: " + umur);
            System.out.println("Tinggi: " + tinggi);
            System.out.println("Status Mahasiswa Aktif: " + statusmahasiswa);
            System.out.println();



            /*No.4 konversi suhu dari
            Celcius ke Fahrenheit
             */
            System.out.println("No.4");
            double celcius = 36.5;
            double fahrenheit = celcius * 9/5 + 32;
            System.out.println("Suhu ruangan saat ini adalah: " + celcius + "°C");
            System.out.println("Suhu dari " +36.5 +"°C konversi ke fahrenheit adalah: " + fahrenheit + "°F");
            System.out.println();



            /*No.5 Program Membaca bilangan bulat dari Scanner,
            lalu menampilkan hasil seluruh operator aritmatika.
             */
        Scanner scanner =new Scanner(System.in);;
        System.out.println("Masukkan dua buah bilangan bulat yang ingin kamu operasikan: ");
        System.out.print("Masukkan bilangan Pertama: ");
        int a = scanner.nextInt();
        System.out.print("Masukkan bilangan Kedua: ");
        int b = scanner.nextInt();
        System.out.println("---Hasil Operator Aritmatika---");
        System.out.println("Jumlah: "    + (a + b));
        System.out.println("Selesih: "   + (a - b));
        System.out.println("Kali: "      + (a * b));
        System.out.println("Bagi: "     + (a / b));
        System.out.println("Sisa Bagi: " + (a % b));
        System.out.println();

        //pembagian dengan casting double agar hasl pecahan terbaca
        if (b != 0){
            System.out.println("Pembagian " + ( a + "/ " + b ) + " = "+ ((double) a / b));

            System.out.println("Sisa bagi " + a + "%" + b + "=" + (a%b));
        }else {
            System.out.println("Pembagian & Modulo tidak dapat dilakukan dengan pembagi 0.");
        }
        System.out.println();
        System.out.println("---Hasil Perbandingan---");
        System.out.println(a + ">" + b + ":" + (a > b));
        System.out.println(a + "==" + b + ":" + (a == b));
        System.out.println(a + "<" + b + ":" + (a < b));

        }
}
