

# 👨‍💻 Employee Maaş Hesaplayıcı

Bu Java uygulaması, bir çalışanın maaşını; vergi, bonus ve zam kriterlerine göre hesaplar. 
Java’nın Nesne Yönelimli Programlama (OOP) prensiplerine uygun olarak geliştirilmiştir.

---

## 📌 Özellikler

- 📉 **Vergi Hesabı**: Maaş 1000 TL üstündeyse %3 vergi kesilir.
- 💰 **Bonus Hesabı**: Haftalık 40 saatten fazla çalışılan her saat için 30 TL fazla mesai bonusu verilir.
- 📈 **Maaş Zammı**:
- < 10 yıl → %5 zam
- 10–19 yıl → %10 zam
- ≥ 20 yıl → %15 zam

- ⚠️ **Kullanıcı Giriş Kontrolü**:
- Negatif maaş girilemez
- Çalışma saati 0–100 arasında olmalı
- İşe giriş yılı 1950–2021 arasında olmalı
- İsim boş olamaz

---

## 🛠️ Nasıl Kullanılır?

1. `Employee.java` ve `Main.java` dosyalarını aynı klasöre koy.
2. Bir Java IDE (örneğin Eclipse, IntelliJ) ya da terminal kullanarak programı çalıştır.
3. Konsoldan kullanıcıdan gelen bilgileri gir.
4. Tüm maaş hesaplamaları detaylı şekilde ekrana yazdırılır.


---

## 🧪 Örnek Girdi / Çıktı

### 👤 Girdi:

İsim girin: Kemal

Maaş girin: 2000

Çalışma saati girin: 45

İşe başlama yılı girin: 1985

### 📋 Çıktı:

Adı : Kemal

Maaşı : 2000.0

Çalışma Saati : 45

Başlangıç Yılı : 1985

Vergi : 60.0

Bonus : 150.0

Maaş Artışı : 300.0

Vergi ve Bonuslar ile birlikte maaş : 2090.0

Toplam Maaş : 2300.0

---

## 🎯 Amaç

Bu proje sayesinde;
- Java sınıfları ve nesneleri tanımayı,
- Kurucu metot (constructor) kullanımını,
- OOP kavramlarını (encapsulation, abstraction),
- Kullanıcı giriş doğrulama ve hata fırlatma (`throw new`) mekanizmalarını,
- `toString()` metodunu kullanmayı öğrenebilirsin.

---

## 👨‍💻 Geliştiren

Ali Efe DENİZ