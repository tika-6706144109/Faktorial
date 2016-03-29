package belah.ketupat;

import java.util.Scanner;

/**
 *
 * @author Tika Febriyanti
 */
public class BelahKetupat {
    public static void main(String[] args) {
       Scanner masukkan = new Scanner(System.in);
       System.out.print("Masukkan Inputan :");
       
       int a = masukkan.nextInt();
       for(int x=a; x>=1; x--){
            for(int y=x-1; y>=1; y--){
            System.out.print(" ");
            }
            for(int z=1; z<=((a+1)-x)*2; z++){
            System.out.print("*");
            }
            System.out.println();
        }
        for(int i=a; i>=1; i--){
            for(int k=1; k<=a-i; k++){
            System.out.print(" ");
            }
            for(int j=i*2; j>=1; j--){
            System.out.print("*");
            }
            System.out.println();
        }
     }
}