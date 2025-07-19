package patica_week_2;

import java.util.Scanner;

public class PasswordValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // kullanıcıya şifreyi doğru girmesi için 3 hak tanıyoruz
        int attempts = 0;


        while(attempts <5){
            System.out.print("Lütfen şifrenizi giriniz: ");
            String password = scanner.nextLine();

            // büyük harf ile başlayıp başlamadığını kontrol etmek için char veri tipinde bir değişken atıyoruz
            char firstChar = password.charAt(0);
            // girilen şifrenin son karakterini almak
            char lastChar = password.charAt(password.length()-1);

            if(password.length()<8){
                System.out.println("Şifre en az 8 karakter içermelidir!!");
                attempts++;
            } else if (password.contains(" ")) {//karakter içerisinde boşluk olup olmadığını kontrol ediyor
                System.out.println("Şifre içerisinde boşluk olmamalıdır.");
                attempts++;
            } else if (!Character.isUpperCase(firstChar)) {// karakterin büyük harf olup olmadığını kontrol ediyor
                System.out.println("Şifrenin ilk harfi büyük olmalıdır.");
                attempts++;
            } else if (!password.endsWith("?")) {// bir metin belirli bir karakter veya kelime ile bitiyor mu kontrol eder
                System.out.println("Şifre '?' karkateri ile bitmelidir!");
                attempts++;
            } else {
                System.out.println("Şifre Başarılı");
                break;
            }

            if(attempts == 5){
                System.out.println("Üzgünüz, 3 kez yanlış giriş yaptınız. Program sonlandırıldı!!");
                break;
            }



        }


    }
}
