/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspertemuanketigafinal;

/**
 *
 * @author ASUS
 */
class MahasiswaBeasiswa extends Mahasiswa {
    public MahasiswaBeasiswa(String nama, int uangSaku) {
        super(nama, uangSaku);
    }

   
    @Override
    public void infoUangSaku() {
        System.out.println("Mahasiswa Beasiswa " + nama + " memiliki uang saku: Rp" + uangSaku);
    }

   
    @Override
    public void tambahUangSaku(int jumlah) {
        super.tambahUangSaku(jumlah);
        
    }
}