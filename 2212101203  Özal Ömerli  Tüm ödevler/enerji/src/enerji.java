/*
1.Başla;
2.Kilogram cinsinden değeri giriniz;
3.Hızı m/s cinsinden gösteriniz;
4.Yüksekliği m cinsinden giriniz;
5.Potensiyal enerji formulünü giriniz(10*kütle*yükseklik);
6.Kinetik enerji formulünü giriniz(kütle*hız*hız/2);
7.Yazdır;
8.Bitir...

 */

/**
 *
 * @author spgam
 */
import java.util.Scanner;

public class enerji {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.println("Lütfen kg cinsinden kütleyi giriniz :");
    double kütle = input.nextDouble();
    System.out.println("************************* :");
    
    System.out.println("Lütfen m/s cinsinden hızı giriniz :");
    double hız = input.nextDouble();
    System.out.println("************************* ");
    
    System.out.println("Lütfen m cinsinden yüksekliği giriniz ");
    double yükseklik = input.nextDouble();
    System.out.println("************************* ");
    
    double Ep = 10*kütle*yükseklik ;
    double Ek = kütle*hız*hız/2;
    
    System.out.println("Potansiyel Enerji= "+Ep);
    System.out.println("Kinetik Enerji= "+Ek);
    
    
    
    }
    
}
