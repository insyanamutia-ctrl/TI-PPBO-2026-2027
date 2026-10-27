public class mahasiswa {
   private String nama;
    private String nim;
    private double ipk;


    public mahasiswa(String nama, String nim, double ipk) {
       this.nama= nama; // this.nama= atribut, nama=parameter
        this.nim= nim;
        this.ipk = ipk;
    }

    public String getNama() {
        return nama;
    }
    public String getNim(){
        return nim;
    }
    public double getIpk(){
        return ipk;
    }

}