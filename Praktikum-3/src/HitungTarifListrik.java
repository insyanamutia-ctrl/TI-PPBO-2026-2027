import java.util.Scanner;
public class HitungTarifListrik {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        //tarif konstanta//
        final double Tarif_450 = 415.0;
        final double Tarif_900 = 1352.0;
        final double Tarif_1300 = 1444.70;
        final double Tarif_2200 = 1444.70;
        final double Tarif_di_atas_2200 = 1699.53;

        //membaca input golongan listrik//
        System.out.print("Masukkan daya listrik anda dalam VA (pilihan: 450, 900, 1300, 2200, atau di atas 2200): ");
        int daya= sc.nextInt();

        //membaca input jumlah kWh//
        System.out.print("Masukkan kWh listrik anda (kWh): ");
        double kwh = sc.nextDouble();

        /*validasi menggunakan operator logika agar program menolak
        (menampilkan pesan error, bukan menghitung) apabila input kWh bernilai negatif
        atau nol*/

        if (kwh <= 0){
            System.out.println("[ERROR] input pemakaian kWh tidak valid jumlah kWh harus bernilai positif (lebih dari 0).");
        }else{
            double tarifPerkwh = 0;
            boolean dayaValid = true;

            // menentukan tarif berdasarkan golongan daya//
            switch (daya){
                case 450:
                    tarifPerkwh = Tarif_450; break;
                case 900:
                    tarifPerkwh = Tarif_900; break;
                case 1300:
                    tarifPerkwh = Tarif_1300; break;
                case 2200:
                    tarifPerkwh = Tarif_2200; break;

                default:
                    if (daya > 2200){
                        tarifPerkwh = Tarif_di_atas_2200;
                    }else {
                        dayaValid = false;
                        System.out.println("[ERROR] Golongan daya listrik tidak valid!");
                        break;
                    }


                    //hasil akhir jika valid//
                    if (dayaValid){
                        double totalTagihan = kwh * tarifPerkwh;

                        System.out.println("Golongan daya: " + daya + "VA");
                        System.out.println("Jumlah pemakaian: " + kwh + "kWh");
                        System.out.println("Tarif per kWh: Rp " + tarifPerkwh);
                        System.out.println("Total tagihan: Rp" + totalTagihan);
                    }
            }
        }

    }
}