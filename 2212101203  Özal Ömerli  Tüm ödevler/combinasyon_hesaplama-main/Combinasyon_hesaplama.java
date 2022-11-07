// - Klavyeden eleman sayısı girilen bir kümenin belirtilen kombinasyonlarının sayısını hesaplayan program.
package combinasyon_hesaplama;
import java.util.Scanner;

/*
Adım 1: Başla 
Adım 2: Kullanıcıdan n ve r değerlerini al
Adım 3: f1 =n! , f2 =r! ve f3 = (n-r)! olarak tanımla 
Adım 4: for döngüsü kullanarak n! işlemini hesaplattır
Adım 5: for döngüsü kullanrak r! işlemini hesaplattır
Adım 6: for döngüsü kullanrak (N-R)! işlemini hesaplattır
Adım 7: int islem diye bir değişken tanımla 
Adım 8: islem = f1/(f2*f3) işlemini yaptır
Adım 9: islemi ekrana yazdır
Adım 10: Bitir.
*/

public class Combinasyon_hesaplama {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);         //Kullanıcıdan veri alabilmek için Scanner Sınfı kullanıldı
        
        System.out.println("Program C = (N,R) İşlemini Yapacaktır.");  // ne işlemi yapacağımızdan bahsettik
        
        System.out.println("Bir N Sayısı Giriniz :");
        int n =input.nextInt();                                        // Kullanıcıdan bir N sayısı aldık
        
        System.out.println("Bir R Sayısı Giriniz :");
        int r =input.nextInt();                                        // Kullanıcıdan Bir R Sayısı Aldık
        
        int f1 =1;                       // Değişkenlerimizi tanımladık
        int f2 =1;
        int f3 =1;
        
        int islem =1;                     // İşlem yapacağımız değikenimizi tanımladık
        
        for (int i =1; i<=n; i++)          // for döngüsü ile n sayısını hesaplattık
        {
            f1 *=i;
        }
        for (int j =1; j<=r; j++)           // for döngüsü ile r sayısını hesaplattık
        {
            f2 *=j;
        }
        for (int k =1; k<=(n-r); k++)        // for döngüsü ile (n-r)! işlemini hesaplattık 
        {
            f3 *=k;
        }
        
        islem = f1 /(f2*f3);                   // işlemimizi yaptık ve işleme atadık
        
        System.out.println("Girdiğiniz Kombinasyonun Sonucu :" +islem);        // işlemimizin sonucunu erana bastırdık.  
         
        
    }
    
}
