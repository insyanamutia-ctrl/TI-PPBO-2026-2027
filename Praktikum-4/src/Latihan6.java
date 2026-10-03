import java.util.Scanner;

public class Latihan6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Masukkan " + n + "elemen:");
        for (int i = 0; i<n; i++){
            System.out.print("Elemen ke-" + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
//Tampilkan array sebelum diurutkan
        System.out.print("\nSebelum durutkan: ");
        for (int num : arr) {
            System.out.print(num + "");
        }
        System.out.println();
        //Algoritma Bubble sort (Ascending)
        for (int i=0; i<n-1; i++){
            for (int j=0; j<n-1 -i; j++){
                if (arr[j] > arr[j + 1]){

                    //tukar nilai
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1]= temp;
                }
            }
        }
        //tampilkan array setelah diurutkan
        System.out.print("Sesudah diurutkan: ");
        for (int num : arr){
            System.out.print(num + "");
        }
    }
}