package patica_week_2;

import java.util.Scanner;

public class PrimeNumberFindingProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen Bir Tam Sayı Giriniz: ");
        int number=scanner.nextInt();

        boolean isPrime=true;

        if(number<=1){
            isPrime = false;
        }else {
            for (int i = 2; i <=Math.sqrt(number) ; i++) {//kontrolü yaparken tüm sayılara kadar değil kareköklerine kadar kontrol etmek yeterli
                if(number % i ==0 ){
                    isPrime=false;
                    break;//bölündüyse zaten asal değildir
                }
            }
        }

        if(isPrime){
            System.out.println(number + " asal sayıdır");
        }else {
            System.out.println(number + " asal sayı değildir");
        }

    }
}
