public class BankDemo {
public static void main ( String [] args ) {
    RekeningBank rek1 = new RekeningBank("10123", "Siti", "Tabungan", 500000.0);
    RekeningBank rek2 = new RekeningBank("10124", "Budi ", "Giro", 200000.0);

    //cetak mutasi awal
    rek1.cetakMutasi();
    rek2.cetakMutasi();
    System.out.println();


    //Skenario setor dan tarik
    System.out.println("--Setor Dan Tarik Normal-- ");
    rek1.setor(150000.0);
    rek2.tarik(50000.0);
    System.out.println();

    //Skenario tranfer berhasil
    System.out.println("--Tranfer Berhasil--");
    rek1.transferKe(rek2, 100000.0);
    System.out.println();

    //skenrio tranfer gagl karena saldo gak mencukupi
    System.out.println("--Tf Gagal(Saldo gak mencukupi)--");
    rek2.transferKe(rek1, 1000000.0);
    System.out.println();

    //skenario tf gagal karena jumlah input gak valid
    System.out.println("--Tf Gagal (input negatif)--");
    rek1.transferKe(rek2, -50000.0);
    System.out.println();

    //cetak mutasi akhir
    System.out.println("--MUTASI AKHIR KEDUA REKENING--");
    rek1.cetakMutasi();
    rek2.cetakMutasi();

}
}