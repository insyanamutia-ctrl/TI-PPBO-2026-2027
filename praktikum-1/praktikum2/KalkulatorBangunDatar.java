import java.util.Scanner;
public class KalkulatorBangunDatar {
    public static void main(String[] args){
       Scanner sc =new
               Scanner(System.in);

       //input dan hitung persegi panjang
        System.out.print("Masukkan panjang & lebar: ");
        double p = sc.nextDouble(), i = sc.nextDouble();
        double luasPP = p * i;
        double kelilingPP = 2 * (p + i);

        //input dan hitung lingkaran
        System.out.print("Masukkan jari-jari lingkaran: ");
        double r = sc.nextDouble();
        double luasL = Math.PI * r * r;
        double kelilingL = 2 * Math.PI *r;

        //pengecekan boolean luas >100
        boolean luasBesar = luasPP > 100;

        //Menampilkan hasil
        System.out.println("----------Hasil----------");
        System.out.println("Luas Persegi Panjang: " + luasPP);
        System.out.println("Keliling Persegi Panjang: " + kelilingPP);
        System.out.println("Luas Lingkaran: " +luasL);
        System.out.println("Keliling Lingkaran: " + kelilingL);
        System.out.println("LuasBesar (>100):" + luasBesar);

    }


}
