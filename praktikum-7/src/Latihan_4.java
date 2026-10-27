public class Latihan_4 {
    public static void main(String[] args){
        Siswa s1 = new Siswa(88.5);
        System.out.println("Nilai:" +s1.getNilai() + "\nNilai huruf:" + s1.getHuruf());

        s1.setNilai(60.7);
        System.out.println("Nilai:" +s1.getNilai() + "\nNilai huruf:" + s1.getHuruf());

        System.out.println("\nmencoba nilai di luar rentang");
        s1.setNilai(120.0);
        System.out.print("");


    }
}
