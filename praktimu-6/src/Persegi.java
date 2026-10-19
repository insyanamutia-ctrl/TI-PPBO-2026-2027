public class Persegi {
    double sisi;


    public Persegi(double sisi){
        this.sisi=sisi;
    }
    public double hitungLuas(){
        double luas = sisi * sisi;
        System.out.println("Luas Persegi: " + luas);
        return luas;
    }
    public  double hitungKeliling(){
        double keliling = 4 * sisi;
        System.out.println("Keliling Persegi: " + keliling);
        return keliling;
    }
    public double getSisi(){
        System.out.println("Sisi: " +sisi);
        return 0;
    }
}