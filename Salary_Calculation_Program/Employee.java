package patica_week_2_Salary_Calculation_Program;

public class Employee {
    //sınıfımızın özellikleri
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name,double salary,int workHours,int hireYear){// kurucu constructor
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){ // maaşın durumuna göre vergi uygulanıp uygulanmayacağı
        if(salary <1000){// maaş 1000 TL nin altında ise vergi uygulanmaz
            return 0;
        }
        return salary * 0.03;// maaş 1000 TL nin üzerinde ise yüzde 3 lük vergi uygulanacak
    }

    public double bonus(){
        /*
        bu methot ile öncelikle kişi eğer 40 saatin üzerinde çalışıyorsa
        çalıtığı fazla saat için 30 TL fazlada ücret alacak
         */
        if(workHours > 40){
            int overwork = workHours -40;
            return overwork * 30;
        }
        return 0;//eğer fazla çalışmııyorsa ücret alamayacağı için return 0 döndürecek
    }

    public double raiseSalary(){
        /*
        işe giriş yılına göre zam hesabı yapılması
        10 yıldan az ise = %5 zam;
        10-19 yıl arasında ise = %10 zam;
        20 yıl üzeri ise = %15 zam yapılacak
         */

        int yearsWorked= 2021-hireYear; // kaç yıl çalıştığını hesaplıcaz
        if(yearsWorked<10){
            return salary * 0.05;
        }else if(yearsWorked <20){
            return salary * 0.10;
        }else{
            return salary * 0.15;
        }
    }

    public String toString(){
        /*
        çalışanın tüm bilgilerini ekrana yazdıracağımız methot
         */
        double tax = tax();
        double bonus = bonus();
        double raise = raiseSalary();
        double salaryWithBonusTax = salary - tax + bonus;
        double totalSalary = salary + raise;

        return "Adı: " + name +
                "\nMaaşı: " + salary +
                "\nÇalışma Saati: " + workHours +
                "\nBaşlangıç Yılı: " + hireYear+
                "\nVergi: " + tax+
                "\nBonus: " +bonus+
                "\nMaaş Artışı: " + raise +
                "\nVergi ve Bonuslar ile birlikte maaş: " + salaryWithBonusTax+
                "\nToplam Maaş: " + totalSalary;
    }
}
