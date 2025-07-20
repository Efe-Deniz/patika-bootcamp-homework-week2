package patica_week_2_Salary_Calculation_Program;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         /*
        try-catch ile hatalı verileri yakalama
        1- isim boş olmasın
        2-maaş negatif sayı olamaz
        3-çalışma saati belirli bir aralıkta olsun
        4-işe giriş yılı mantıklı olsun
         */

        try{
            System.out.print("Lütfen Çalışan Adını Giriniz: ");
            String name = scanner.nextLine();
            if(name== null || name.trim().isEmpty()){
            /*
             ->IllegalArgumentException= yanlış değer girdiğinde kullanıcıya hata mesajı gönderir
             ->throw new = kullanıcıya özel bir hata mesajı vermek için kullanılır
             hatalı bir durumla karşılaşıldığında program sonlanmaz hata mesajı verir
             neden kullanılır:
             -yanlış veri girişinde
             -istemediğimiz bir durum oluşursa
             -programın kontrolünü kaybetmek istemiyorsak

             */
                throw new IllegalArgumentException("İsim Boş Olamaz!!");
            }
            System.out.println("Çalışanın Maaşını Giriniz: ");
            double salary = scanner.nextDouble();
            if(salary<=0){
                throw new IllegalArgumentException("Maaş 0 veya negatif olamaz!!");
            }
            System.out.println("Çalışma Saatini Giriniz: ");
            int workHours = scanner.nextInt();
            if(workHours<0 || workHours>100){
                throw new IllegalArgumentException("Çalışma Saati 0 ile 100 Arasında olmalıdır.");
            }
            System.out.println("İşe Başlangıç Yılını Giriniz: ");
            int hireYear = scanner.nextInt();
            if(hireYear>2021 || hireYear<1950){
                throw new IllegalArgumentException("İşe giriş yılı 1995-2021 yılları arasında olmalıdır");
            }

            Employee worker = new Employee(name,salary,workHours,hireYear);
            System.out.println(worker.toString());
        }catch (IllegalArgumentException e){
            System.out.println("Hata: " + e.getMessage());
        }catch (Exception e){
            System.out.println("Geçersiz Giriş!!");
        }
        scanner.close();


    }
}
