public class Latihan1dan2 {
    public static void main(String[] args){
        Buku b1 = new Buku("Basis Data", "budi", 2014);

        b1.setJudul("Basis Data"); // judul buku valid
        System.out.println("Judul Buku: " +b1.getJudul());

        b1.setJudul("Algoritma");//judul buku tidak valid
        System.out.println();

        b1.setPengarang("Andi"); //nama pengarang valid
        System.out.println("Pengarang: "+b1.getPengarang());

        b1.setPengarang("Budi"); //nama pengarang tidak valid
        System.out.println();

        System.out.println("Tahun Terbit: " + b1.getTahunTerbit()); //tahun terbit hanya bisa di isi lewat construktor

    }


        }


