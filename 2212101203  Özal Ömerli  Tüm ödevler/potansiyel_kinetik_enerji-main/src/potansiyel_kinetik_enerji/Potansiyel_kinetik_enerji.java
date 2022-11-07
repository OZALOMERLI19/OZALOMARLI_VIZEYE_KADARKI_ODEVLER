// Kullanıcıdan Alınan Maddenin Kütlesi,Hızı Ve Yerden Yüksekliği İle Maddenin Potansiyel Ve Kinetik Enerjisini Hesaplayan Program.

/*
Adım 1: Başla
Adım 2: Kullanıcıdan Hız, Kütle ve Yerden Yüksekliğini al.
Adım 3: Yerçekimi kuvvetini double olarak ekle. (g=9.80665)
Adım 4: Double Potansiyel =(kutle*yerçekimi*yukseklik) olarak işlem yaptır.
Adım 5: Double Kinetik = (kutle*(hiz*hiz))/2 olarak işlem yaptır.
Adım 6: En son çıktıları ekrana yazdır.
Adım 7: Dur.
*/

package potansiyel_kinetik_enerji;
import java.util.Scanner;  //Java'nın util kütüphanesine ait Scanner Class'ı import edildi.


public class Potansiyel_kinetik_enerji {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); //Consoldan değer almak için tanımladık.
        System.out.println("Maddenin Kütlesini Giriniz :");
        int kutle =input.nextInt();
        System.out.println("Maddenin Hızını Giriniz :");
        int hiz = input.nextInt();
        System.out.println("Maddenin Yerden Yüksekliğini Giriniz :");
        int yukseklik =input.nextInt();
        
        double yercekimi=9.80665;  //Yerçekimi kuvvetini double olarak tanımladık.
        
        double potansiyel =(kutle*yercekimi*yukseklik); //Potansiyel Enerji Formülünden yararlandık.
        double kinetik =(kutle*(hiz*hiz))/2; //Kinetik Enerji Formülünden Yararlandık.
        
        System.out.println("Maddenin Potansiyel Enerjisi :" +potansiyel); //Pıtansiyel Enerji değerini Ekrana yazdırdık.
        System.out.println("Maddenin Kinetik Enerjisi :" +kinetik); //Kinetik Enerji değerini ekrana yazdırıdık.
        
        
        
        
    }
    
}
