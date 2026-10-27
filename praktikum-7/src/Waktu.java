public class Waktu {
    private int jam;
    private int menit;
    private int detik;

    public Waktu(int jam, int menit, int detik) {  //construktor
    this.jam=jam;
    this.menit=menit;
    this.detik=detik;
    }

    // getter
    public int getJam() {
        return jam;
    }

    public int getMenit() {
        return menit;
    }

    public int getDetik() {
        return detik;
    }

    // setter dengan validasi
    public void setJam(int jam) {
        if (jam >= 0 && jam <= 23) {
            this.jam = jam;
        }else{
            System.out.println("Nilai jam di luar rentang (0-23)");
        }
    }
    public void setMenit(int menit){
        if (menit >=0 && menit<=59){
            this.menit=menit;
        }else{
            System.out.println("Nilai menit diluar rentang (0-59)");
        }
    }

    public void setDetik(int detik){
        if (detik >=0 && detik<=59){
            this.detik=detik;
        }else{
            System.out.println("Nilai detik di luar rentang (0-59)");
        }
    }
}