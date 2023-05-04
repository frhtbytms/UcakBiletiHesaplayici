import java.util.Scanner;
import java.util.Random;
public class Main {
    static Scanner scanner=new Scanner(System.in);
    public static int menu(){
        System.out.println("*****************");
        System.out.println("hosgeldiniz...");
        System.out.println("İslemler");
        System.out.println("1-UCAK BİLETİ ALMA");
        System.out.println("3-KAMPANYALAR");
        System.out.print("Hangi islemi gerçekleştrimek istersiniz?: ");

        int karar=scanner.nextInt();
        if(2<karar&&karar<1) {
            menu();
        }
        return karar;
    }
    public static double YasKampanya(int yas){
        // Rastgele sayı üretmek için bir Random nesnesi oluştur
        Random random = new Random();
        // 0 ile 100000000 arasında rastgele bir tam sayı üret
        int randomNumber = random.nextInt(500,120000);
        int mesafe=randomNumber;
        double kmbasifiyat=144;
        double biletfiyatı=kmbasifiyat*mesafe;
        if(yas<=12)
            biletfiyatı=biletfiyatı/2;
        else if (12<yas&&yas<=24)
            biletfiyatı=biletfiyatı/100*90;
        else if (65<=yas)
            biletfiyatı=biletfiyatı/100*70;

        return biletfiyatı;

    }
    public  static void BiletAl(){
        System.out.println("**************");
        System.out.println("Biletsepeti.com");
        System.out.println("**************");
        System.out.print("Ucağa nerden bineceksiniz? :");
        String kalkıs=scanner.next();
        System.out.print("nereye gitmek istersiniz?:");
        String inis=scanner.next();
        System.out.println("kampanyadan yararlanmak için yasınızı girebilirmisiniz? :");
        int yas= scanner.nextInt();
        double biletfiyati=YasKampanya(yas);
        System.out.println("istediğiniz bilet fiaytı: "+biletfiyati);
        System.out.println("bileti gidis dönüş mü keseceksiniz?:(evet için 1 hayır için 2 tıklayınız)");
        int karar=scanner.nextInt();
        switch (karar){
            case 1:
                System.out.print("Ucağa nerden bineceksiniz? :");
                String kalkıs1=scanner.next();
                System.out.print("nereye gitmek istersiniz?:");
                String inis1=scanner.next();
                double biletfiyatı2=YasKampanya(yas);
                if(yas<=12)
                    System.out.println("istediğiniz bilet fiaytı: "+biletfiyatı2/2);
                else if (12<yas&&yas<=24)
                    System.out.println("istediğiniz bilet fiaytı: "+biletfiyatı2/100*90);
                else if (65<=yas)
                    System.out.println("istediğiniz bilet fiaytı: "+biletfiyatı2/100*70);
                else
                    System.out.println("istediğiniz bilet fiaytı: "+biletfiyatı2);
                System.out.println("gidis dönüş ucak bileti fiyatı toplamda :"+((biletfiyatı2+biletfiyati)/100*30));
                break;

            case 2:
                System.out.println("istediğiniz bilet fiaytı: "+biletfiyati);
                break;
            default:
                System.out.println("1 veya ikiye tuslayınız.");
        }
    }


    public static void main(String[] args) {
        System.out.println("Hello world!");
        int i=0;
        int karar;
        while(i==0) {
            karar=menu();
            if(karar==1)
                BiletAl();
            else
                System.out.println("Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.\n" +
                        "Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.\n" +
                        "Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.\n" +
                        "Kişi \"Yolculuk Tipini\" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.");



        }
    }
}