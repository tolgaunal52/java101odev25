import java.util.Scanner;

public class odev25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, passWord;
        int dene = 3, sec, py, pc, bs, bakiye = 100;

        while (dene > 0) {
            System.out.print("Kullanici adiniz : ");
            userName = input.nextLine();
            System.out.print("Parolaniz : ");
            passWord = input.nextLine();
            if (userName.equals("Tolga") && passWord.equals("12345")) {
                System.out.println("Merhaba Sisteme Hosgeldiniz !");
                do {
                    System.out.println("\n1-Para Yatirma\n" + "2-Para Cekme\n" + "3-Bakiye Sorgulama\n" + "4-Cikis Yap");
                    System.out.print("Lutfen Yapmak Istediginiz Islemi Seciniz : ");
                    sec = input.nextInt();
                    switch (sec) {
                        case (1):
                            System.out.print("Para miktari : ");
                            py = input.nextInt();
                            bakiye += py;
                           break;
                        case (2):
                            System.out.print("Para miktari : ");
                            pc = input.nextInt();
                            bs = bakiye >= pc ? 1 : 2;
                            switch (bs) {
                                case (1):
                                    bakiye -= pc;
                                    break;
                                case (2):
                                    System.out.println("Bakiye Yetersiz !\n");
                                    break;
                            }
                            break;
                        case (3):
                            System.out.println("\nBakiyeniz : " + bakiye);
                            break;
                    }
                } while (sec != 4);
                System.out.println("Tekrar Gorusmek Uzere.");
                break;
            } else {
                dene--;
                System.out.println("Hatali Kullanici Adi veya Sifre.");
                System.out.println("Kalan Hakkiniz " + dene);
                switch (dene) {
                    case (0):
                        System.out.println("Hesabiniz Bloke Olmustur.");
                }
            }


        }
    }
}
