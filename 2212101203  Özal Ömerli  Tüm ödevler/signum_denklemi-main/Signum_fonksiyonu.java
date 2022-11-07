// “İşaret ( signum ) fonksiyonu” nun tanımına göre klavyeden girilen x değeri için 
// f(x) =x^2 -5x+3 fonksiyonunun işaretini hesaplayan program.
package signum_fonksiyonu;
import java.util.Scanner;

/*
Adım 1: Başla
Adım 2: Kullanıcıdan bir x değeri al 
Adım 3: Signum deklemini tanımla 
Adım 4: Eğer f(x)<0 --> (-) , Ekrana yazdır
Adım 5: Eğer f(x)>0 --> (+) , Ekrana yazdır
Adım 6: Değilse f(x)=0 --> (0) , Ekrana yazdır
Adım 7: Bitir
*/


public class Signum_fonksiyonu {

    public static void main(String[] args) {
       
        Scanner input=new Scanner(System.in);
        
        System.out.println("x^2 -5x +3 İşlemi İÇİN ...");     // Programın Ne yapacağını belirledik
        
        System.out.println("Bir X Değer Giriniz :");
        int girilen = input.nextInt();                        // Kullanıcıdan X değerini aldık
        
        int dnklm = (girilen*girilen)-(5*girilen)+3;          // Signum denklemini beilrledik
        
        if (dnklm < 0)                                        // Denklemin Sonucuna Göre Çıktıları Yazdırdık.
        {
            System.out.println("Sonuç NEGATİF 'tir. Girilen Değerin Sonucu : " +dnklm);
        }
        else if (dnklm > 0)
        {
            System.out.println("Sonuç POZİTİF 'tir. Girilen Değerin Sonucu : "+dnklm);
        }
        else 
        {
            System.out.println("Girilen Değerin Sonucu SIFIR 'dır.");
        }
        
    }
    
}
