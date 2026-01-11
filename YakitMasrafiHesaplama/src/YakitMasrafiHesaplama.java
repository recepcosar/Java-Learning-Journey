import java.util.Scanner;
public class YakitMasrafiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Aracınız kilometrede kat TL yakıyor ? ");

        double TL = input.nextDouble();
        System.out.println("Aracınızla kaç kilometre gittiniz ? ");

        int km = input.nextInt();
        System.out.println("Toplam ödemeniz gereken tutar = " +  (TL * km) + "TL'dir");

    }
}
