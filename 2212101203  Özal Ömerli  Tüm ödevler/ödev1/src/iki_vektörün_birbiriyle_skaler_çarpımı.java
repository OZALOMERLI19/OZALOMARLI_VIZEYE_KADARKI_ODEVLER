/*
1.Başla;
2.Birinci vektörü giriniz;
3.İkinci vektörü giriniz;
4.Skaler çarpım formulünü uygulayınız((A*B)*1/2);
5.Yazdır;
6.Bitir...
 */

/**
 *
 * @author spgam
 */
import java.util.Scanner ;

public class iki_vektörün_birbiriyle_skaler_çarpımı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.println("Birinci vektörü giriniz: ");
    double A = input.nextDouble();
    System.out.println("------------------------: ");
    
    System.out.println("İkinci vektörü giriniz: ");
    double B = input.nextDouble();
    System.out.println("------------------------: ");
   
    double Çarpım = (A*B)*1/2 ;
    System.out.println("Çarpım = "+Çarpım );
   
}
}
