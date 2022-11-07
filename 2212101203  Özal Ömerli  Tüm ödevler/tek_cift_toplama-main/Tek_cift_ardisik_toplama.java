// Klavyeden girilen n sayısına göre 1’den n’ e kadar tamsayıların toplamını (t1) , 1 den n’ e kadar tek sayıların toplamı (t2) -
// ve 2’ den n’ e kadar çift tam sayıların toplamı (t3) hesaplayan program.

package tek_cift_ardisik_toplama;
import java.util.Scanner;

/*
Adım 1: Başla 
Adım 2: Kullanıcıdan bir n sayısı al
Adım 3: int t1 , t2, t3 değişkenlerini tanımla ve sıfıra eşitle 
Adım 4: 1 den n e kadar olan değerleri teker teker kontrol et
Adım 5: Eğer i%2 == 1 , topla t2 
Adım 6: Eğer i%2 == 0 && i!= 1  , topla t3 
Adım 7: Değilse topla t1  
Adım 7: t1 , t2 ve t3 değerlerini ekrana yazdır
Adım 8: Bitir.
*/

public class Tek_cift_ardisik_toplama {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);   // Kulanıcıdan Değer alabilmek için Scanner Sınıfını Kullanıyoruz. 
        
        System.out.println("Bir Tam Sayı Giriniz :");
        int girilen = input.nextInt();            // Kulanıcıdan aldığımız değeri girilene atadık.
        
        int t1 = 0;                               //Toplamlarını tutacağımız DEğişkenlerimizi Tanımladık
        int t2 = 0;
        int t3 = 0;
        
        for (int i =1; i<=girilen; i++)           // 1 den girilen Sayıya kadar olan bütün sayıları kontrol ediyoruz
        {
            if (i%2 == 1)                         // Tek sayıları seçiyoruz
            {
                t2 +=i;                           // t2 'nin içine ekliyoruz
            } 
            else if (i%2 == 0 && i!=1)            // Çift ve 1 e eşit olamyan sayıları seçiyoruz
            {
                t3 +=i;                           // t3 'ün içine ekliyoruz
            }
                t1 +=i;                           // 1 'den girilen sayıya kadar olan bütün sayıları topluyoruz.
            
        }
        System.out.println("1 'den Girilen Sayıya Kadar Olan Tam Sayıların Toplamı :" +t1);   // t1 'i ekrana yazdırıyoruz.
        System.out.println("1 'den Girilen Sayıya Kadar Olan Tek Tam Sayıların Toplamı :" +t2); // t2 'yi ekrana yazdırıyoruz.
        System.out.println("2 'den Girilen Sayıya Kadar Olan Çift Sayıların Toplamı :" +t3);  // t3 'ü ekrana yazdırıyoruz.
        
        
        
    }
    
}
