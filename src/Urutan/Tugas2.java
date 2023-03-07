package Urutan;

import java.util.Scanner;
import java.util.Arrays;

public class Tugas2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] data = new int[] {-75, -10, 0, 30, 0, -30, 90, 70, 89, -50, -55, -30};

        Arrays.sort(data);
        for(int i : data) {
            System.out.println(i);
        }
        System.out.print("Input data  : ");
        int dataSearch = scan.nextInt();
        System.out.println("data " + dataSearch + " ditemukan pada index " + Arrays.binarySearch(data,dataSearch));
    }
}
