public class Latihan3 {
    public static void main (String[] args){
        produk p1=new produk("Laptop", 12000000);

        System.out.println("Nama Produk: " + p1.namaProduk + "\nDengan harga: "  +p1.harga);

        System.out.println("Apakah Harga Terlalu Mahal? " + p1.isMahal(25000000));
    }


}
