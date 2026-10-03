import java.util.Scanner;
public class Latihan5 {
    public  static  void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = sc.nextInt();
        int [] arr= new int [n];

        System.out.print("Masukkan " + n + "elemen array: ");
        for (int i = 0; i<n; i++){
            System.out.print("Elemen ke-" + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int maxKeduan= Integer.MIN_VALUE;

        for (int i=0; i < n; i++){
            if (arr [i]>max){
                maxKeduan = max;
                max = arr[i];
            }else if (arr [i] > maxKeduan && arr[i] != max){
                maxKeduan = arr[i];
            }
        }
        System.out.println("\nNilai Terbesar Pertama: " + max);
        if (maxKeduan == Integer.MIN_VALUE){
            System.out.println("Tidak ada nilai terbesar kedua (semua elemen bernilai sama).");
        }else{
            System.out.println("Nilai Terbesar kedua: "+ maxKeduan);
        }
    }
}