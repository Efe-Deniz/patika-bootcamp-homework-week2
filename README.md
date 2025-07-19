# patika-bootcamp-homework-week2
Patika.dev Java Backend Bootcamp week2  homework submissions

# 🔐 Geçerli Şifre Kontrolü – Java Ödevi

Bu proje, kullanıcının girdiği bir şifrenin geçerli olup olmadığını belirlemek için bazı kurallara göre kontrol yapan bir Java uygulamasıdır. Ödev, Patika.dev Java eğitim programı kapsamında geliştirilmiştir.

## 📌 Kontrol Kuralları
Kullanıcının şifresi aşağıdaki kuralları sağlamalıdır:

1. En az 8 karakterden oluşmalı
2. Boşluk (space) karakteri içermemeli
3. İlk karakteri büyük harf olmalı
4. Son karakteri `?` olmalı

Kullanıcı bu kuralları sağlayamazsa, 3 kez tekrar deneme hakkı verilir. 3 hatalı girişten sonra program sonlanır.

## ⚙️ Kullanım

Projeyi çalıştırmak için:

1. Java yüklü olmalıdır (`Java 11+` önerilir).
2. `PasswordValidator.java` dosyasını bir Java IDE’sinde veya terminalde çalıştırın.
3. Konsoldan gelen yönergeleri izleyerek şifre girin.

## 📂 Dosyalar

- `PasswordValidator.java` – Tüm doğrulama mantığını içeren ana Java dosyası.
- `README.md` – Bu dokümantasyon dosyası.

## 🧠 Öğrenilenler

- Scanner ile kullanıcıdan veri alma
- String metodları (`length()`, `contains()`, `charAt()`, `endsWith()`)
- `if`, `else if` koşul yapıları
- Döngü kullanımı (`while`)
- Karakter kontrolü (`Character.isUpperCase()`)




# 🧮 Exponent Calculation Program – Java

Bu proje, kullanıcıdan taban ve üs değerlerini alarak **üs hesaplama** işlemini gerçekleştiren bir Java konsol uygulamasıdır.
Kullanıcı negatif üs de girebilir. Program, kullanıcıya işlemi tekrar edip etmek istemediğini sorar ve döngüye girerek birden fazla işlem yapılmasına izin verir.

## 🚀 Özellikler

- Taban ve üs değerleri kullanıcıdan alınır
- Hem pozitif hem negatif üs hesaplaması yapılır
- 0^0 gibi özel durumlar kontrol edilir
- Kullanıcıya tekrar işlem yapma imkanı sunulur (`e/h`)
- Döngü, metot ve matematiksel mantık içerir

## 📌 Kullanım

1. Java yüklü olmalıdır (`Java 11+` önerilir)
2. `ExponentCalculationProgram.java` dosyasını bir Java IDE'sinde açın veya terminalde çalıştırın
3. Girişleri yapın, sonucu alın
4. Devam etmek için `e`, çıkmak için `h` yazın

## 📚 Öğrenilen Java Konuları

- `Scanner` ile kullanıcı girişi
- `nextInt()` ve `nextLine()` farkları
- `do-while` döngüsü
- `return` ve metot kullanımı
- `double`, `int` veri türleri ve dönüşümler
- `Math` işlemleri (negatif üs → 1.0 / sonuç)

## 🧠 Özel Durumlar

| Taban | Üs | Sonuç |
|-------|-----|------------|
| 2 | 3 | 8.0 |
| 2 | -3 | 0.125 |
| 5 | 0 | 1.0 |
| 0 | 0 | Belirsiz! |


