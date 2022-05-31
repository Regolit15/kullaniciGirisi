import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Eger sifre yanlis ise kullaniciya sifresini sifirlayip sifirlamayacagini sorun
        Eger kullanici sifirlamak isterse yeni girdigi sifrenin hatali girdigi ve unuttugu sifre ile ayni olmamasi gerektigini kontrol edip, sifreler ayni ise
        ekrana "Sifre Olusturulamadi, lutfen baska bir sifre giriniz." sorun yoksa "Sifre Olusturuldu"yazan bir program yaziniz.
         */
        String userName, password, newPass;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanici Adi : ");
        userName = input.nextLine();
        System.out.print("Sifreniz : ");
        password = input.nextLine();
        if (userName.equals("patika") && password.equals("ja1234")) {
            System.out.print("Basarili Bir Sekilde Giris Yaptiniz!");
        } else {
            System.out.print("Bilgileriniz Hatali! Yeni Sifre almak icin 1, Iptal etmek icin 2 yi tuslayin.");

            int ans = input.nextInt();
            input.nextLine();



            switch(ans){
                case 1:
                    System.out.print("Yeni sifrenizi Giriniz : ");
                    newPass=input.nextLine();
                    if(newPass.equals("ja1234")){
                        System.out.print("Sifreniz,Eski Sifranizden Farkli Olmalidir! Tekrar Deneyiniz.");
                    }else {
                        System.out.print("Sifreniz Basarili Bir Sekilde Degisitirildi.");
                    }
                break;
                case 2:
                    System.out.print("Isleminiz Iptal Edildi !");
                    break;



                default:
                    System.out.print("Yanlis Secim Yaptiniz! Tekar Deneyiniz");

            }

        }
    }


}

