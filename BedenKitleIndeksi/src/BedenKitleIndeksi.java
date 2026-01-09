   import java.util.Scanner;
public class BedenKitleIndeksi { //Kullanıcının boy ve kilosuna göre kullanıcının beden kitle Indeksini bulunuz.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("kilonuzu giriniz = ");
        int kilo = input.nextInt();
        System.out.print("Boyunuzu giriniz = "); //Boyunuzu lütfen virgül kullnarak giriniz 1,82 gibi.
        double boy = input.nextDouble();

        double bki = kilo / (boy * boy);

        System.out.print("Beden kitle Indeksiniz  = " + bki);

    }
}
  // Beden kitle ındeksi : Kilo / Boy(m) * Boy(m)