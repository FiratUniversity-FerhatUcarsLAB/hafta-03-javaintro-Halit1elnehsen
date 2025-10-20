package carpimtablosu;

public class CarpimTablosu {
    public static void main(String[] args) {
        int sayi = 2; 
        System.out.println("=== " + sayi + "’nin Çarpım Tablosu ===");

        for (int i = 1; i <= 10; i++) {
            int sonuc = sayi * i;
            System.out.println(sayi + " x " + i + " = " + sonuc);
        }
    }
}
