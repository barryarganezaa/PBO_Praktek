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
public class Soal4 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah penjualan : ");
        int jumlahPenjualan = sc.nextInt();
        
        int gajiPokok = 500000;
        int hargaPerItem = 50000;
        double bonus = 0;
        int batasBonus1 = 40;
        int batasBonus2 = 80;
        int totalPenjualan = jumlahPenjualan * hargaPerItem;
        
        if (jumlahPenjualan >= batasBonus2)
        {
            bonus = 0.35 * totalPenjualan;
        }
        else if (jumlahPenjualan >= batasBonus1)
        {
            bonus = 0.25 * totalPenjualan;
        }
        else if (jumlahPenjualan >= 15)
        {
            bonus = 0.10 * totalPenjualan;
        } 
        else
        {
            // Jika penjualan kurang dari 15 item, kena denda
            double denda = 0.15 * (15 * hargaPerItem - totalPenjualan);
            bonus = -denda;
        }
        double totalGaji = gajiPokok + bonus;
        System.out.println("Total gaji : Rp " + totalGaji);
    }
}
