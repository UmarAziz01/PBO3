/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspertemuanketigafinal;

/**
 *
 * @author ASUS
 */
public abstract class Mahasiswa {

    protected String nama;
    protected int uangSaku;

    // Constructor
    public Mahasiswa(String nama, int uangSaku) {
        this.nama = nama;
        this.uangSaku = uangSaku;
    }

    // Abstract method 
    abstract void infoUangSaku();

    // Method overloading
    public void tambahUangSaku(int jumlah) {
        this.uangSaku += jumlah;
        System.out.println("Uang saku ditambah: " + jumlah);
    }

    public void tambahUangSaku(int jumlah, String keterangan) {
        this.uangSaku += jumlah;
        System.out.println("Uang saku ditambah: " + jumlah + " dengan keterangan" + keterangan);
    }
}
