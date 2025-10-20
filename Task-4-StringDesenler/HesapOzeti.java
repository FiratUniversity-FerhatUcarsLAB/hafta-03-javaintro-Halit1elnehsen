package hesapozeti;

public class HesapOzeti {

    public static void main(String[] args) {
       
        String[] urunler = {"Elma", "Ekmek", "Süt", "Peynir"};
        int[] miktarlar = {2, 3, 1, 2};
        double[] fiyatlar = {15.50, 5.00, 20.00, 45.00};

     
        System.out.println("=== HESAP ÖZETİ ===");
        System.out.printf("%-10s %-10s %-10s %-10s%n", "Ürün", "Miktar", "Fiyat", "Toplam");

        double genelToplam = 0;

      
        for (int i = 0; i < urunler.length; i++) {
            double toplam = miktarlar[i] * fiyatlar[i];
            genelToplam += toplam;
            System.out.printf("%-10s %-10d %-10.2f %-10.2f%n", urunler[i], miktarlar[i], fiyatlar[i], toplam);
        }

       
        System.out.println("-----------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10.2f%n", "", "", "GENEL TOPLAM:", genelToplam);
    }
}


