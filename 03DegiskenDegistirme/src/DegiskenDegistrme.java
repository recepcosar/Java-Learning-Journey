import java.util.Scanner;
public class DegiskenDegistrme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int birinci_sayi;
        int ikinci_sayi;

        System.out.print("Birinci sayi = ");
        birinci_sayi = input.nextInt();

        System.out.print("Ikinci sayi = ");
        ikinci_sayi = input.nextInt();

        System.out.println("Değiştirilmeden önce ... ");
        System.out.println("Birinci sayı = " + birinci_sayi + " İkinci sayı= " + ikinci_sayi );

        // DEĞİŞTİRME MANTIĞI
        int gecici = birinci_sayi;
        birinci_sayi = ikinci_sayi;
        ikinci_sayi = gecici;

        System.out.println("Değiştirildikten sonra ... ");
        System.out.println("Biriniz sayı = " + birinci_sayi + " ikinci sayı = " + ikinci_sayi );

    }
}
// Kullanıcıdan aldığınız iki sayının değerini değiştiren basit program.
