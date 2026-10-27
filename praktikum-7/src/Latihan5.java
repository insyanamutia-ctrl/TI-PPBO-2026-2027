public class Latihan5 {
    public static void main(String[] args){
        Persegi[] daftarPersegi = {
                new Persegi(6.0),
                new Persegi(5.0),
                new Persegi(7.5),
                new Persegi(2.0),
        };
        Persegi terbesar= daftarPersegi[0];
        for (Persegi p:daftarPersegi){
            if (p.hitungLuas()>terbesar.hitungLuas()){
                terbesar=p;
            }
        }
        System.out.println("Persegi terbesar memiliki sis: " + terbesar.sisi + "\ndengan luas: " + terbesar.hitungLuas());
    }
}
