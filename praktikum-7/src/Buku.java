public class Buku {
    private String judul;
    private String pengarang;
   private int tahunTerbit;

    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    public  String getJudul(){
        return judul;
    }
    public String getPengarang(){
        return pengarang;
    }
    public int getTahunTerbit(){
        return tahunTerbit;
    }
   public void setJudul(String judul){
        if (judul== "Basis Data"){
            this.judul=judul;
        }else{
            System.out.println("Judul tidak sesuai");
        }
   }
   public void setPengarang(String pengarang){
        if (pengarang=="Andi"){
            this.pengarang=pengarang;
        }else {
            System.out.println("Nama pengarang tidak tersedia");
        }

   }
}