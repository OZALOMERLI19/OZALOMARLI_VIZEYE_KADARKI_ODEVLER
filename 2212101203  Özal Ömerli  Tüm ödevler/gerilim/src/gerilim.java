/*
1.Başla;
2.Direnç değerini giriniz;
3.Akım değerini giriniz;
4.Gerilim değerini bulmak için formulü giriniz(R*I);
5.Yazdır;
6.Bitir
 */

/**
 *
 * @author spgam
 */
import java.util.Scanner;

public class gerilim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Scanner input = new Scanner (System.in);
    System.out.println("Direnç değerini giriniz :");
    double R = input.nextDouble();
    
    System.out.println("Akım değerini giriniz :");
    double I = input.nextDouble();
    
   double Gerilim = R*I;
   System.out.println("Gerilim = "+Gerilim );
   
    }
    
}
