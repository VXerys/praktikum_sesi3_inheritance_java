
# Praktikum Java OOP – Kalkulator Bangun Datar 🚀

Selamat datang di repositori **Kalkulator Bangun Datar** untuk praktikum **Java Object-Oriented Programming**. Proyek ini menunjukkan penerapan konsep-konsep OOP di Java melalui perhitungan luas dan keliling dari beberapa bangun datar, yaitu:

- **Bujur Sangkar**
- **Persegi Panjang**
- **Segitiga** (dengan tiga metode perhitungan)

*Note:* *file ada di dalam folder src*
---

## Daftar Isi
- [Praktikum Java OOP – Kalkulator Bangun Datar 🚀](#praktikum-java-oop--kalkulator-bangun-datar-)
  - [*Note:* *file ada di dalam folder src*](#note-file-ada-di-dalam-folder-src)
  - [Daftar Isi](#daftar-isi)
  - [Ikhtisar](#ikhtisar)
  - [Struktur Proyek](#struktur-proyek)
    - [File 1: BangunDatar.java](#file-1-bangundatarjava)
    - [File 2: BujurSangkar.java](#file-2-bujursangkarjava)
    - [File 3: PersegiPanjang.java](#file-3-persegipanjangjava)
    - [File 4: Segitiga.java](#file-4-segitigajava)
  - [Cara Kompilasi dan Jalankan](#cara-kompilasi-dan-jalankan)
  - [Konsep Kunci \& Penjelasan](#konsep-kunci--penjelasan)
  - [Referensi](#referensi)

---

## Ikhtisar

Repositori ini menyajikan sebuah aplikasi sederhana yang memungkinkan pengguna menghitung luas dan keliling dari berbagai bangun datar. Program ini menampilkan menu interaktif yang memungkinkan kamu memilih jenis bangun datar, lalu meminta input data untuk menghitung hasilnya. Konsep-konsep seperti validasi input, penggunaan exception, dan nested switch-case diimplementasikan dengan gaya OOP di Java.

---

## Struktur Proyek

### File 1: BangunDatar.java

File ini merupakan titik masuk (main) dari program. Di sini kamu akan menemukan menu interaktif yang memungkinkan pengguna memilih antara Bujur Sangkar, Persegi Panjang, atau Segitiga. Contoh penggunaannya:

```java
import java.util.Scanner;

public class BangunDatar {
     double luas;
     double keliling;
     public double luas(){
          return luas;
     }
     public double keliling(){
          return keliling;
     }
     public static void main(String[] args) {

          System.out.println("=====================================");
          System.out.println("Silahkan Pilih Bangun Datar:");
          System.out.println("1. Bujur Sangkar");
          System.out.println("2. Persegi Panjang");
          System.out.println("3. Segitiga");
          System.out.println("=====================================");
          try (Scanner scanner = new Scanner(System.in)) {
               System.out.println("Silahkan Isikan Pilihan:"); 
               int pilihan = scanner.nextInt();

               switch ( pilihan ) {
                    case 1 -> {
                        System.out.print("Masukkan panjang sisi; ");
                        double sisi = scanner.nextDouble();
                        BujurSangkar bs = new BujurSangkar(sisi);
                        System.out.println("Luas: " + bs.luas());
                        System.out.println("Keliling: " + bs.keliling());
                  }
                    case 2 -> {
                        System.out.print("Masukkan panjang: ");
                        double panjang = scanner.nextDouble();
                        System.out.print("Masukkan lebar: ");
                        double lebar = scanner.nextDouble();
                        PersegiPanjang pp = new PersegiPanjang(panjang, lebar);
                        System.out.println("Luas: " + pp.luas());
                        System.out.println("Keliling: " + pp.keliling());
                  }
                    case 3 -> {
                        System.out.println("Pilih Tipe Segitiga:");
                        System.out.println("1. Segitiga Siku-siku (alas dan tinggi)");
                        System.out.println("2. Segitiga dengan tiga sisi (Heron)");
                        System.out.println("3. Segitiga dengan dua sisi dan sudut (dalam derajat)");
                        System.out.print("Silahkan pilih tipe segitiga: ");
                        int tipeSegitiga = scanner.nextInt(); 

                    switch (tipeSegitiga) {
                       case 1 ->                            {
                               System.out.print("Masukkan alas: ");
                               double alas = scanner.nextDouble();
                               System.out.print("Masukkan tinggi: ");
                               double tinggi = scanner.nextDouble();
                               Segitiga segitiga = new Segitiga(alas, tinggi);
                               System.out.println("Luas: " + segitiga.luas());
                               System.out.println("Keliling: " + segitiga.keliling());
                           }
                       case 2 ->                            {
                               System.out.print("Masukkan sisi A: ");
                               double sisiA = scanner.nextDouble();
                               System.out.print("Masukkan sisi B: ");
                               double sisiB = scanner.nextDouble();
                               System.out.print("Masukkan sisi C: ");
                               double sisiC = scanner.nextDouble();
                               Segitiga segitiga = new Segitiga(sisiA, sisiB, sisiC);
                               System.out.println("Luas: " + segitiga.luas());
                               System.out.println("Keliling: " + segitiga.keliling());
                           }
                       case 3 ->                            {
                               System.out.print("Masukkan sisi A: ");
                               double alas = scanner.nextDouble();
                               System.out.print("Masukkan sisi B: ");
                               double tinggi = scanner.nextDouble();
                               System.out.print("Masukkan sudut di antara A dan B (dalam derajat): ");
                               double sudut = scanner.nextDouble();
                               Segitiga segitiga = new Segitiga(alas, tinggi, sudut, 'A');
                               System.out.println("Luas: " + segitiga.luas());
                               System.out.println("Keliling: " + segitiga.keliling());
                           }
                       default -> {
                           System.out.println("Pilihan tipe segitiga tidak valid!");
                       }
                   }

                  }
                    default -> System.out.println("Pilihan tidak tersedia");
               }
          } catch (Exception e) {
               System.out.println("Terjadi kesalahan: " + e.getMessage());
          }
     }
}

```

---

### File 2: BujurSangkar.java

File ini berisi kelas untuk menghitung luas dan keliling bujur sangkar. Validasi memastikan nilai sisi harus lebih besar dari 0.  
**Contoh Penggunaan:**  
- **Input:** sisi = 5  
- **Output:**  
  - **Luas:** 25.0  
  - **Keliling:** 20.0

```java
public class BujurSangkar extends BangunDatar {
     double sisi;

     public BujurSangkar( double sisi){
          if (sisi <= 0) {
               throw new IllegalArgumentException("Nilai sisi harus lebih besar dari 0.");
          }
          this.sisi = sisi;
     }
     @Override
     public double luas(){
          return sisi * sisi;
     }
     @Override
     public double keliling(){
          return 4 * sisi;
     }
}

```

---

### File 3: PersegiPanjang.java

Kelas ini mengimplementasikan perhitungan luas dan keliling untuk persegi panjang. Nilai panjang dan lebar harus lebih besar dari 0.  
**Contoh Penggunaan:**  
- **Input:** panjang = 10, lebar = 5  
- **Output:**  
  - **Luas:** 50.0  
  - **Keliling:** 30.0

```java
public class PersegiPanjang extends BangunDatar{
     double panjang;
     double lebar;

     public PersegiPanjang(double panjang, double lebar){
          if( panjang <= 0 || lebar <= 0) {
               throw new IllegalArgumentException("Nilai panjang dan lebar harus lebih besar dari 0.");
          }
          this.panjang = panjang;
          this.lebar = lebar;
     }
     @Override
     public double luas(){
          return panjang * lebar;
     }
     @Override
     public double keliling(){
          return 2 * (panjang + lebar);
     }
}

```

---

### File 4: Segitiga.java

File ini mengimplementasikan kelas **Segitiga** dengan tiga cara konstruksi:
- **Segitiga Siku-siku:** Menggunakan nilai alas dan tinggi.
- **Segitiga dengan Tiga Sisi (Heron):** Menggunakan tiga sisi dengan rumus Heron.
- **Segitiga dengan Dua Sisi dan Sudut:** Menghitung sisi ketiga menggunakan aturan cosinus, kemudian menghitung luas dengan rumus Heron.

**Contoh Penggunaan:**  
- **Segitiga Siku-siku:**  
  - **Input:** alas = 6, tinggi = 8  
  - **Output:** Luas = 24.0, Keliling = 24.0  
- **Segitiga Heron:**  
  - **Input:** sisiA = 7, sisiB = 8, sisiC = 9  
  - **Output:** Luas ≈ 26.83, Keliling = 24.0  
- **Segitiga Dua Sisi & Sudut:**  
  - **Input:** sisiA = 5, sisiB = 10, sudut = 45°  
  - **Output:** Luas ≈ 17.71, Keliling ≈ 22.37

```java
public final class Segitiga {
     double alas; 
     double tinggi;
     double sisiA;
     double sisiB;
     double sisiC;

     boolean isHeron = false;

     public Segitiga(double alas, double tinggi) {
          if(alas <= 0 || tinggi <= 0) {
               throw new IllegalArgumentException("Nilai alas dan tinggi harus lebih besar dari 0.");
          }

          this.alas = alas;
          this.tinggi = tinggi;
          this.isHeron = false; 
     }

     public Segitiga(double sisiA, double sisiB, double sisiC) {
          if (!isValidTriangle(sisiA, sisiB, sisiC)) {
               throw new IllegalArgumentException("Sisi tidak membentuk segitiga.");
          }
          this.sisiA = sisiA;
          this.sisiB = sisiB;
          this.sisiC = sisiC;
          this.isHeron = true; 
     }

     public Segitiga(double a, double b, double angle, char option){
          if(option == 'A') {
               if (a <= 0 || a <= 0) {
                    throw new IllegalArgumentException("Sisi harus positif.");
               }
               if (angle <= 0 || angle >= 180) {
                    throw new IllegalArgumentException("Nilai sudut harus lebih besar dari 0 dan kurang dari 180.");
               }
               double angleRad = Math.toRadians(angle);
               double c = Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(angleRad)); 
               if (c <= 0 || !isValidTriangle(a, b, c)) {
                    throw new IllegalArgumentException("Sisi tidak valid.");
               }
               this.sisiA = a;
               this.sisiB = b;
               this.sisiC = c;
               this.isHeron = true;
          } else {
               throw new IllegalArgumentException("Opsi tidak valid.");
          }
     }

     public double luas() {
          if(isHeron) {
               double s = (sisiA + sisiB + sisiC) / 2;
               return Math.sqrt(s * (s - sisiA) * (s - sisiB) * (s - sisiC));
          } else {
               return 0.5 * alas * tinggi;
          }
     }
     public double keliling() {
          if(isHeron) {
               return sisiA + sisiB + sisiC;
          } else {
               double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
               return alas + tinggi + sisiMiring;
          }
     }

     // cek validasi apakah segitiga atau tidak
     boolean isValidTriangle(double a, double b, double c) {
          return (a + b > c) && (a + c > b) && (b + c > a) && (a > 0) && (b > 0) && (c > 0);
     }
}

```

---

## Cara Kompilasi dan Jalankan

1. **Pastikan semua file berada di dalam direktori yang sama.**
2. Buka terminal atau command prompt di direktori proyek.
3. **Kompilasi file-file berikut:**

   ```bash
   javac BangunDatar.java BujurSangkar.java PersegiPanjang.java Segitiga.java
   ```

4. **Jalankan program:**

   ```bash
   java BangunDatar
   ```

---

## Konsep Kunci & Penjelasan

- **Kelas & Objek:**  
  Masing-masing bangun datar diwakili oleh kelas tersendiri, yang berisi properti dan metode untuk menghitung luas dan keliling.

- **Validasi & Exception Handling:**  
  Setiap konstruktor memeriksa apakah input valid (misalnya, nilai sisi harus positif). Jika tidak, program akan melempar `IllegalArgumentException` dengan pesan yang sesuai.

- **Interaksi Pengguna:**  
  Menu di file **BangunDatar.java** menggunakan nested switch-case untuk menangani pilihan pengguna dengan cara yang interaktif dan mudah dipahami.

[⬆️ Kembali ke Daftar Isi](#daftar-isi)

---

## Referensi

- [Dokumentasi Java Oracle](https://docs.oracle.com/javase/)
- [Tutorial Java W3Schools](https://www.w3schools.com/java/)
- [Pedoman Penulisan Kode Java](https://www.oracle.com/java/technologies/javase/codeconventions-contents.html)


[⬆️ Kembali ke Daftar Isi](#daftar-isi)

