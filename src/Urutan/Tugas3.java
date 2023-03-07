package Urutan;

import java.util.Arrays;
import java.util.Scanner;

public class Tugas3 {
    static int input;
    static float Positive;
    static float Negative;
    static float Zero;
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        System.out.print("Size: ");
        input = c.nextInt();
        int [] data = new int[input];

        System.out.print("Input Data: ");
        for (int i = 0 ; i < data.length; i++){
            data[i] = c.nextInt();
        }

        Arrays.sort(data);
        System.out.println();
        System.out.print("Result: \n");
        for(int i = 0 ; i < data.length ; i++){
            System.out.print(data[i] + " ");
        }

        for(int i = 0 ; i < data.length ; i++){
            if (data[i] > 0){
                    Positive++;
                }else if (data[i] < 0) {
                    Negative++;
                }else{
                    Zero++;
            }
        }

        System.out.printf("\n\nPositive : %1.2f", Positive / data.length);
        System.out.printf("\nNegative : %1.2f", Negative / data.length);
        System.out.printf("\nZero     : %1.2f", Zero / data.length);
    }
}