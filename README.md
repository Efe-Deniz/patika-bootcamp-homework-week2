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
