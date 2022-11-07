/*
1.Başla;
2.Kilometre cinsinden değeri giriniz;
3.Kilometre-Mil dönüşümünü yapmak için formulü giriniz;
4.Yazdırın;
5.Bitir...
 */

/**
 *
 * @author spgam
 */
import java.util.Scanner;

public class km_mil_dönüştürücü {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Lütfen km cinsinden değer giriniz: ");
    double km = input.nextDouble();
    System.out.println("--------------------- ");
    
 
    System.out.println("Kilometreyi Mil olarak ifade ediniz: ");
    double mil = km*0.62137;
    
    System.out.println("Mil cinsinden bulunan sonuç= "+mil);
    System.out.println("--------------------- ");
    
 
    
    System.out.println("İşlem başarıyla gerçekleştirilmiştir ");
     
    }
    
}
