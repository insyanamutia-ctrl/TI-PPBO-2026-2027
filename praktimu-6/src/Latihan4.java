public class Latihan4 {
    public static void main(String[] args){
        Buku[] daftarBuku= new Buku[4];

        daftarBuku[0]= new Buku("Algoritma", "Rudi", 2012);
        daftarBuku[1]= new Buku("OOP Java", "Siti", 2018);
        daftarBuku[2]=new Buku("Basis Data", "Andi", 2014);
        daftarBuku[3]= new Buku("Kecerdasan Buatan", "Dewi", 2021);

        for (Buku b:daftarBuku){
            if (b.tahunTerbit> 2015){
                System.out.println(b.judul + "(" + b.tahunTerbit+ ")");
            }
        }
    }
}
