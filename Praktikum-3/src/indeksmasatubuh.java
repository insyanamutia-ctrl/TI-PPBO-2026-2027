import  java.util.Scanner;
public class indeksmasatubuh {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan berat kamu (kg):");
        double berat = sc.nextDouble();
        System.out.print("tinggi badan kamu (meter) : ");
        double tinggi = sc.nextDouble();

        //Hitung BMI//
        double bmi= berat / (tinggi * tinggi);
        System.out.print("BMI kamu adalah : " + bmi);

        if (bmi < 18.5 ){
            System.out.println("\nKategori: Kurus");
        }else if (bmi >= 25.0 && bmi < 25.0){
            System.out.println("\nKategori: Normal");
        }else if(bmi >=25.0 && bmi < 30.0){
            System.out.println("\nKategori: Gemuk");
        }else{
            System.out.println("\nKategori: Obesitas");
        }

    }

}