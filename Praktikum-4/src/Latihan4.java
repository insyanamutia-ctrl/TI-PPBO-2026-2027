import java.util.Scanner;public class Latihan4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] matriks = new int [3][3];
        int totalMatriks = 0;

        for (int i = 0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.println("Masukkan elemen ["+ i+"][" + j +"]: ");
                matriks[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i<3; i++){
            int jumlahBaris = 0;
            for (int j=0; j<3; j++){
                System.out.print(matriks[i][j] + "\t");
                jumlahBaris += matriks [i][j];
                totalMatriks+= matriks[i][j];
            }
            System.out.println("|jumlah baris " + (i+ 1) + "=" + jumlahBaris);
        }
        System.out.println("\nTotal seluruh elemen matriks: " + totalMatriks);
    }

}