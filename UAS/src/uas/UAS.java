/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;
import javax.swing.JOptionPane;
/**
 *
 * @author koplak
 */
public class UAS {
private static String name;
    private static String des;
    private static String gender;
    private static String kelamin;
    private static int validDes;
    static StringBuilder Hasilbiner= new StringBuilder();
    static StringBuilder Hasilhexa= new StringBuilder();
    static StringBuilder Hasiloktal= new StringBuilder();
    static String k;

    /**
     * @param n
     */
  
       public static void keBiner(int n){
        if(n>1){
            keBiner(n/2);
        }
        System.out.print(n%2);
        Hasilbiner.append(n%2);
    }
    public static void keHexa(int n){
        char[] daftarHexa={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        if(n>0){
            keHexa(n/16);
            System.out.print(daftarHexa[n%16]);
            Hasilhexa.append(daftarHexa[n%16]);
        }
    }
    public static void keOktal(int n){
        char[] daftarOktal={'0','1','2','3','4','5','6','7'};
        if(n>0){
            keOktal(n/8);
            System.out.print(daftarOktal[n%8]);
        Hasiloktal.append(daftarOktal[n%8]);
        }
    }
 // TODO code application logic here
    }
    