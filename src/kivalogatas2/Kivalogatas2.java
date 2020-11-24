/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kivalogatas2;

/**
 *
 * @author szark
 */
import java.util.Scanner;
public class Kivalogatas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("\n\tKiválogatás tétel (Kibővített verzió)");
    System.out.println("\t\t\t\t  2020.11.19.\n");
    
        Scanner be=new Scanner(System.in);
        System.out.print("Hány darab érdemjegyet szeretne? ");
        int jegyekSzama=be.nextInt();
        
        int[] jegyek=new int[jegyekSzama];
        int[] egyesek=new int[jegyekSzama];
        int[] kettesek=new int[jegyekSzama];
        int[] harmasok=new int[jegyekSzama];
        int[] negyesek=new int[jegyekSzama];
        int[] otosok=new int[jegyekSzama];
        
        System.out.println("Érdemjegyek: ");
        
        for (int i = 0; i <jegyekSzama; i++){
            jegyek[i]=(int)(Math.random()*5)+1;
            System.out.print(jegyek[i]+" ");
        }
        
        int dbEgyes=0;
        int dbKettes=0;
        int dbHarmas=0;
        int dbNegyes=0;
        int dbOtos=0;
                                                         System.out.println("");
        for (int i = 0; i < jegyekSzama; i++){
            if (jegyek[i]==1){
                egyesek[dbEgyes++]=jegyek[i];
            }
            if (jegyek[i]==2){
                kettesek[dbKettes++]=jegyek[i];
            }
            if (jegyek[i]==3){
                harmasok[dbHarmas++]=jegyek[i];
            }
            if (jegyek[i]==4){
                negyesek[dbNegyes++]=jegyek[i];
            }
            if (jegyek[i]==5){
                otosok[dbOtos++]=jegyek[i];
            }
        }
                
        System.out.print("\nEgyesek: ");
        for (int i = 0; i <dbEgyes; i++){
            System.out.print(egyesek[i]+" ");
        }
        System.out.print("\nKettesek: ");
        for (int i = 0; i <dbKettes; i++){
            System.out.print(kettesek[i]+" ");
        }
        System.out.print("\nHármasok: ");
        for (int i = 0; i <dbHarmas; i++){
            System.out.print(harmasok[i]+" ");
        }
        System.out.print("\nNégyesek: ");
        for (int i = 0; i <dbNegyes; i++){
            System.out.print(negyesek[i]+" ");
        }
        System.out.print("\nÖtösök: ");
        for (int i = 0; i <dbOtos; i++){
            System.out.print(otosok[i]+" ");
        }
                                                         System.out.println("");
        System.out.println("\nEgyesek darabszáma:"+dbEgyes);
        System.out.println("\nKettesek darabszáma:"+dbKettes);
        System.out.println("\nHármasok darabszáma:"+dbHarmas);
        System.out.println("\nNégyesek száma:"+dbNegyes);
        System.out.println("\nÖtösök darabszáma:"+dbOtos);
    }
}