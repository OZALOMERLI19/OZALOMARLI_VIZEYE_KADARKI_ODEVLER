/*
Adım 1: Başla
Adım 2: Kullanıcıdan n sayısını al
Adım 3 : toplam diye bir değişken tanımla
Adım 4: Bir döngü aç(i değikenini kullan) ve girilen sayıya kadar döndür 
Adım 5: Eğer girilen sayı i değerine tam bölünüyorsa ekrana yazdır 
Adım 6: Ekrana yazdır ve toplam +=idiyerek değerleri toplam 
Adım 7: toplam değerelerini ekrana yazdır 
Adım 8: Bitir.
*/
package tam_bolen_hesaplama;

import java.util.Scanner;

public class Tam_bolen_hesaplama {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); // Kullanıcıdan Aldığımız değeri okutabilmek için Scanner Kütüphanesini Kullandık
        
        System.out.println("Bir Pozitif Tam Sayı Giriniz :");
        int girilen = input.nextInt();  // Kullanıcıdan Değer Aldık
        
        int toplam = 0;
        
        for (int i =1; i<=girilen; i++)    // for döngüsü ile değerleri teker teker kontrol ettik
        {
            if (girilen%i == 0)           // Tam bölenleri bulmak için if koşulunu ekledik 
            {
                System.out.print(i+" ");  // Tam bölenleri ekrana yazdırdık
                
                toplam += i;              // tam bölenleri toplama ekledik
            }
        }
        System.out.println("\nGirdiğiniz Sayının Pozitif Tam Bölenlerinin Toplamı : " +toplam );   // Tam bölenler toplamını ekrana yazdırdık
        
    }
    
}
