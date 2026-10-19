public class mahasiswa {
    String nama;
    String nim;
    double ipk;

    //Constructor default (tanpa parameter)
    public mahasiswa() {
        nama = "Belum disi";
        nim = "-";
        ipk = 0.0;
    }

    public mahasiswa(String nama, String nim, double ipk) {
       this.nama= nama; // this.nama= atribut, nama=parameter
        this.nim= nim;
        this.ipk = ipk;
    }

    public void tampilkamData() {
       System.out.println("Nama: "+nama);
       System.out.println("NIM: "+nim);
       System.out.println("IPK: "+ipk);
    }

    public  boolean isCumlaude(){
        return ipk>3.5;
    }

}