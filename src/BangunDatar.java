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
                        System.out.print("Masukkan alas: ");
                        double alas = scanner.nextDouble();
                        System.out.print("Masukkan tinggi: ");
                        double tinggi = scanner.nextDouble();
                        Segitiga segitiga = new Segitiga(alas, tinggi);
                        System.out.println("Luas: " + segitiga.luas());
                        System.out.println("Keliling: " + segitiga.keliling());
                  }
                    default -> System.out.println("Pilihan tidak tersedia");
               }
          } catch (Exception e) {
               System.out.println("Terjadi kesalahan: " + e.getMessage());
          }
     }
}
