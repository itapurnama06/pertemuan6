package pertemuann6;

import java.util.Scanner;

/**
 *
 * @author LAB F
 * tgl: 2024-04-29
 */
public class Pertemuann6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dIN = new Scanner(System.in);
        
        System.out.print("Nilai Alas : ");
        float nALAS = dIN.nextFloat();
   
        System.out.print("Nilai Tinggi : ");
        float nTINGGI = dIN.nextFloat();
        
       Hitungluassegi3 LS = new Hitungluassegi3(nALAS, nTINGGI);
       
       //LS.setALAS(71);
       //LS.setTINGGI(86);
       LS.HLuasSegi3();
       
       System.out.println("Nilai Alas  :" + LS.getALAS() );
       System.out.println("Nilai Tinggi  :" + LS.getTINGGI() );
       System.out.println("Jadi Luas Segi Tiga: ");
       System.out.println("Luas = ½ X Alas X Tingg");
       System.out.println("     = ½ X "+ LS.getALAS()+" x "+LS.getTINGGI() ); 
       System.out.println("     = " + LS.getLUAS() );
       
    }
    
}
