import java.util.Scanner;
public class Makanansederhana {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka 1-4: ");
        int makananSederhana= sc.nextInt();
        switch (makananSederhana){
            case 1:
                System.out.println("Nasi goreng" ); break;
            case 2:
                System.out.println("Sate padang"); break;
            case 3:
                System.out.println("Mie goreng"); break;
            case 4:
                System.out.println("Mie bakso ayam"); break;
            default:
                System.out.println("Pilihan tidak valid");
        }

    }
}