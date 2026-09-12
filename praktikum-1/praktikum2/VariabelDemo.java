public class VariabelDemo {
    public static void main(String[] args){
        String nama = "Mutia Insyana";
        int umur = 20;
        double tinggi = 150;
        char golDarah = 'B';
        boolean mahasiswaAktif = true;

        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Tinggi: " + tinggi);
        System.out.println("Golongan Darah: " + golDarah);
        System.out.println("Aktif: " + mahasiswaAktif);


        //Widening dan Narrowing//
        int nilaiBulat = 9;
        double nilaiDouble = nilaiBulat; //widening otomotis
        System.out.println("Widening: " + nilaiDouble);

        double pecahan = 9.8;
        int hasilCasting = (int) pecahan; //narowing eksplisit
        System.out.println("Narrowing: " + hasilCasting);

    }

}
