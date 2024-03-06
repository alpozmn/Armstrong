import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir sayı alınır
        System.out.println("Bir sayı girin:");
        int sayi = scanner.nextInt();

        // Sayının basamaklarının toplamını hesaplamak için değişken tanımlanır
        int toplam = 0;

        // Sayı sıfır olana kadar basamaklarının toplamı hesaplanır
        while (sayi != 0) {
            // Sayının son basamağı alınır ve toplama eklenir
            toplam += sayi % 10;
            // Sayının son basamağı silinir
            sayi /= 10;
        }

        // Sonuç ekrana yazdırılır
        System.out.println("Basamaklarının toplamı: " + toplam);
    }
}
