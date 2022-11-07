/*
1.Başla;
2.Yarıçap değerini r ile tanımlayın;
3.Hacim formulünü giriniz (3.14*r*r*r*4/3);
4.Alan formulünü giriniz(4*3.14*r*r);
5.Yazdır;
6.Bitir.

/**
 *
 * @author spgam
 */
import java.util.Scanner;

public class küre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.println("Yarıçap değerini girin :" );
    double r = input.nextDouble();
    
    double hacim = 3.14*r*r*r*4/3 ;
    
    System.out.println("Kürenin Hacmi= "+hacim);
    
    double alan = 4*3.14*r*r ;
    System.out.println("Kürenin Alanı= "+alan);
    
    System.out.println("İşlemleriniz başarıyla gerçekleştirildi. ");
    }
    
}
