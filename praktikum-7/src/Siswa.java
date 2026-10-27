public class Siswa {
    private double nilai;
    String huruf;

    public Siswa(double nilai) {
        this.nilai = nilai;
        this.huruf = huruf;
    }

    public void setNilai(double nilai) {
        if (nilai >= 0 && nilai <= 100) {
            this.nilai = nilai;
        }else{
            System.out.println("Nilai di luar rentang (0-100)");
        }
    }
    //method getter
    public double getNilai(){
        return nilai;
    }
    public String getHuruf(){
        if (nilai>=85){
            return "A";
        }else if (nilai>=75){
            return "B";
        }else if (nilai>=65){
            return "C";
        } else if (nilai>=50) {
            return "D";
        }else return "E";
    }
}
