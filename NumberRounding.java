package patica_week_2;

import java.util.Scanner;

public class NumberRounding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Lütfen ondalık bir sayı giriniz: ");
        double inputDouble = scanner.nextDouble();

        /*
         kullanıcıdan alınan sayıyı aşağı yuvarlamak için Math.floor methodunu kullanacaz
         ancak ekrana int bir değer verecez
         */
        double floorValue = Math.floor(inputDouble);
        System.out.println("Aşağı Yuvarlama: " + (int)floorValue);

        /*
        yukarı yuvarlamak için Math.ceil() methodunu kullanacaz
         */

        double ceilValue=Math.ceil(inputDouble);
        System.out.println("Yukarı Yuvarlama: " +(int)ceilValue);

        /*
        .5 üzerini yukarı, altını aşağı yuvarlamak için Math.round() kullanılır
         */
        double roundValue= Math.round(inputDouble);
        System.out.println("En Yakın Tam Sayı Değeri: " + (int)roundValue);

    }
}
