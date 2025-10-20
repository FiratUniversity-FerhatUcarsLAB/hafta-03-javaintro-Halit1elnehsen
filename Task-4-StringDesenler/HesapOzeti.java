public class HesapOzeti {
    public static void main(String[] args) {
        System.out.println("+----------------------------------------------+");
        System.out.println("|                HESAP ÖZETİ                  |");
        System.out.println("+----------------------------------------------+");
        System.out.printf("| %-15s | %-10s | %-10s |\n", "Ürün", "Miktar", "Fiyat");
        System.out.println("+----------------------------------------------+");
        
        System.out.printf("| %-15s | %-10d | %-10.2f |\n", "Elma", 2, 30.0);
        System.out.printf("| %-15s | %-10d | %-10.2f |\n", "Ekmek", 1, 10.0);
        System.out.printf("| %-15s | %-10d | %-10.2f |\n", "Süt", 3, 45.0);
        System.out.printf("| %-15s | %-10d | %-10.2f |\n", "Yumurta", 1, 20.0);
        
        System.out.println("+----------------------------------------------+");
        System.out.printf("| %-28s %-10.2f |\n", "Toplam:", (30.0 + 10.0 + 45.0 + 20.0));
        System.out.println("+----------------------------------------------+");
    }
}
