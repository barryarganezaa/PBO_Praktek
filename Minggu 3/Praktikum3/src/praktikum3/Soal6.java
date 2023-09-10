/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

import java.util.Scanner;
import java.math.BigInteger;
/**
 *
 * @author Olympus
 */
public class Soal6 
{
    public static void main(String[] args) 
    {
        Scanner angka = new Scanner(System.in);
        
        System.out.print("Masukkan angka pertama : ");
        String angka1 = angka.nextLine();
        System.out.print("Masukkan angka kedua : ");
        String angka2 = angka.nextLine();
        
        BigInteger number1 = new BigInteger(angka1);
        BigInteger number2 = new BigInteger(angka2);
                
        BigInteger Sum = number1.add(number2);
        BigInteger Multiply = number1.multiply(number2);
        
        System.out.println(Sum);
        System.out.println(Multiply);
    }
}
