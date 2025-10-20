package donusumtablosu;

public class DonusumTablosu {
    public static void main(String[] args) {
     
        double milToKm = 1.609;

    
        int[] miller = {1, 5, 10, 20, 50};

        System.out.println("=== Mil → Kilometre Dönüşüm Tablosu ===");
        System.out.printf("%-10s %-15s%n", "Mil", "Kilometre");

      
        for (int mil : miller) {
            double km = mil * milToKm;
            System.out.printf("%-10d %-15.3f%n", mil, km);
        }
    }
}
