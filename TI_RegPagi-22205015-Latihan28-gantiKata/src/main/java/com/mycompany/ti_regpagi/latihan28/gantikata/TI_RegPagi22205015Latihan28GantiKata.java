/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ti_regpagi.latihan28.gantikata;

import java.util.Scanner;

/**
 * Nama         : Ahmad Nurfaqih
 * Nim          : 22205015
 * prodi        : Teknik Informatia
 * Deskripsi    : Program ini berisi tentang mengganti kata
 * @author 62895
 */
public class TI_RegPagi22205015Latihan28GantiKata {

    public static void main(String[] args) {
        System.out.println("===LATIHAN 28===  ");
      Scanner scanner = new Scanner(System.in);
      
//      meminta user untuk memasukan kalimat
      System.out.print("Masukan kalimat: ");
      String kalimat = scanner.nextLine();
      
//      meminta user untuk memasukankata yang akan di ganti
      System.out.print("Ganti kata: ");
      String katalama = scanner.nextLine();
      
//      kata penggantinya
      System.out.print("Kata Pengganti: ");
      String katabaru = scanner.nextLine();
      
//      ganti kata dalam kalimat
      String kalimatbaru = kalimat.replace(katalama, katabaru);
      
      System.out.println("\n====HASIL FORMATING===="                                                               );
      System.out.println("Kalimat awal: "+kalimat);
      System.out.println("Kalimat baru: "+kalimatbaru);
    }
}
