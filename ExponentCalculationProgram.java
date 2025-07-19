package patica_week_2;

import java.util.Scanner;

public class ExponentCalculationProgram {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        //kullanıcıdan tekrar giriş verisi almak için do-while döngüsünü kullancaz
        String again;
        do {
            System.out.println("Taban Sayıyı Giriniz: ");
            int baseNumber = scanner.nextInt();
            System.out.println("Üs Sayıyı Giriniz:  ");
            int exponentNumber = scanner.nextInt();
            double result = calculatePower(baseNumber,exponentNumber);
            if(result != -1){
                System.out.println(baseNumber+"^"+exponentNumber+" = "+result);
            }


            scanner.nextLine();
            System.out.print("Yeni işlem yapmak ister misiniz? (e/h): ");
            again = scanner.nextLine();

        }while (again.equalsIgnoreCase("e"));
        System.out.println("Program Sonlandırıldı!");
    }

    public static  double calculatePower(int base, int exponent){

        if(base==0 && exponent==0){
            System.out.println("0^0 belirsiz bir ifadedir!!!");
            return -1;
        }

        double result = 1;
        if(exponent>=0){
            for (int i = 1; i <=exponent ; i++) {
                result*=base;
            }
        }else {
            for (int i = 1; i <= -exponent ; i++) {
                result *=base;
            }
            /*
            result = 1.0/result;
            bir sayının negatif üssü o sayının pozitif üssünün 1'e bölünmüş halidir.
            2^3=1/(2^3)=1/8=0.125
            döngü ile base önce üs kadar çarpıyoruz
            daha sonra negatif üs olduğu için o sayıyı 1 bölüyoruz
            1.0 yazmamızın sebebi double döndürmesi gerektiği için
             */
            result = 1.0/result;
        }
        return result;

    }
}
