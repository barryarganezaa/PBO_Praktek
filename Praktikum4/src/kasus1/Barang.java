/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kasus1;

/**
 *
 * @author Olympus
 */
public class Barang 
{
    String kode_barang;
    String nama_barang;
    private int stok;

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok += stok;
    }
    
    public Barang(String kode, String nama, int stk) 
    {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }
}
