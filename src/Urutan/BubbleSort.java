package Urutan;
import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] data = new int[] {-75, -10, 0, 30, 0, -30, 90, 70, 89, -50, -55, -30};
        int temp;
        for(int i = 0; i < data.length; i++){
            for(int j = 0; j < data.length; j++){
                if(data[i] < data[j]){
                    temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
        for(int i : data){
            System.out.println(i);
        }
        System.out.println("Cari Data  : ");
        int dataSearch = scan.nextInt();
        for(int i = 0; i < data.length; i++) {
            if (dataSearch == data[i]) {
                System.out.println("Data " + dataSearch + " ditemukan pada index ke- " + i);
            }
        }
    }
}