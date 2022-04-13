


package logika;
import java.util.Scanner;


/**
 *
 * @author MOKLET-01
 */
public class Logika {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        // TODO code application logic here
 int pertama, kedua, ketiga, terbesar;
 Scanner scan = new Scanner(System.in);
  
 System.out.print("Masukkan bilangan pertama = ");
 pertama = scan.nextInt();
  
 System.out.print("Masukkan bilangan kedua = ");
 kedua = scan.nextInt();
  
 System.out.print("Masukkan bilangan ketiga = ");
 ketiga = scan.nextInt();
  
 if(pertama>kedua && pertama>ketiga){
 terbesar = pertama;
 }else{
 if(kedua>ketiga){
 terbesar=kedua;
 }else{
 terbesar=ketiga;
 }
 }
  
 System.out.println("Bilangan terbesar adalah "+terbesar);
    }
    
}