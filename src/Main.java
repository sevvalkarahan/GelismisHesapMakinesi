import java.util.Scanner;

public class Main {
    static int sum(int a, int b){
        return a+b;
    }
    static int minus(int a, int b){
        return a-b;
    }
    static int times(int a, int b){
        return a*b;
    }
    static int divided(int a, int b){
        if (b==0)
            System.err.println("TANIMSIZ!! İkinci sayıyı 0'dan farklı giriniz.");
        return a/b;
    }
    static int power(int a, int b){
        int us=1;
        for (int i = 1; i <=b ; i++) {
            us*=a;
        }
        return us;
    }
    static int mod(int a, int b){
        return a%b;
    }
    static void calc(int a, int b){
        int area=a*b;
        System.out.println("Dikdörtgenin alanı: "+area);
        int primeter=2*(a+b);
        System.out.println("Dikdörtgenin çevresi: "+primeter);

    }


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int select;
        String menu= "1-Toplama işlemi \n" +
                "2- Çıkarma işlemi \n" +
                "3-Çarpma işlemi \n" +
                "4- Bölme işlemi \n" +
                "5- Üslü sayı hesaplama \n" +
                "6- Mod alma \n" +
                "7- Dikdötgen alan ve çevre hesabı \n" +
                "0- Çıkış yap.";
        while (true){
            System.out.println(menu);
            System.out.print("YAPMAK İSTEDİĞİNİZ İŞLEMİ SEÇİNİZ : ");
            select=input.nextInt();
            if (select==0){
                System.out.println("Çıkış yapılıyor...");
                break;
            }

            System.out.print("İlk sayıyı giriniz: ");
            int a=input.nextInt();
            System.out.print("İkinci sayıyı giriniz: ");
            int b=input.nextInt();
            switch (select){
                case 1:
                    System.out.println("toplam: "+sum(a,b));
                    break;
                case 2:
                    System.out.println("Çıkarma: "+minus(a,b));
                    break;
                case 3:
                    System.out.println("Çarpma: "+times(a,b));
                    break;
                case 4:
                    System.out.println("Bölme: "+divided(a,b));
                    break;
                case 5:
                    System.out.println("Üs alma: "+power(a,b));
                    break;
                case 6:
                    System.out.println("Mod alma: "+mod(a,b));
                    break;
                case 7:
                    calc(a,b);
                    break;
                default:
                    System.err.println("GEÇERSİZ BİR İŞLEM YAPTINIZ!!");
            }
        }


    }
}
