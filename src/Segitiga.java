public class Segitiga {
     double alas; 
     double tinggi;

     public Segitiga(double alas, double tinggi) {
          this.alas = alas;
          this.tinggi = tinggi;
     }
     public double luas() {
          return 0.5 * alas * tinggi;
     }
     public double keliling() {
          double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
          return alas + tinggi + sisiMiring;
     }
}
