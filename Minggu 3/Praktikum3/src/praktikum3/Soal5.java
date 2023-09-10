/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

import java.util.Scanner;

/**
 *
 * @author Olympus
 */
public class Soal5 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan plat nomor empat mobil : ");
        String input = sc.nextLine();
        String[] platNomer = input.split(" ");
        
        String gabunganPlat = "";
        for (String nomer : platNomer)
        {
            gabunganPlat += nomer;
        }
        long gabunganAngka = Long.parseLong(gabunganPlat);
        
        if ((gabunganAngka - 999999) % 5 == 0)
        {
            System.out.println("Jalan");
        }
        else
        {
            System.out.println("Berhenti");
        }
    }
}
