import java.util.Scanner;
/*
* Taksimetre Programı
* java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
* taksimetre km başına 2.20 TL tutmaktadır.
* Min ödenecek tutar 20 Tl'dir. 20 TL altında ücretler de 20 tl alınacaktır.
* Taksimetre açılış ücreti 10 TL'dir.
** */
public class Main {
    public static void main(String[] args) {
        int km;
        double perKm= 2.20, total=10; //km başı anlamına gelir

        Scanner input  = new Scanner(System.in);
        System.out.println("Mesafeyi km cinsinden giriniz: ");
        km = input.nextInt();

        total += km * perKm; // total = total + (km * perKm);

        total = (total < 20) ? 20 : total;
        System.out.println("Toplam tutar: " + total);


    }
}
