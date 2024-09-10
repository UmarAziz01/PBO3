/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspertemuanketigafinal;

/**
 *
 * @author ASUS
 */
public class Main {

    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new MahasiswaReguler("Ari", 1000000);
        mahasiswa1.infoUangSaku(); //informasi uang saku
        mahasiswa1.tambahUangSaku(500000);//method overload
        mahasiswa1.infoUangSaku();//info uang saku setelah overload

        System.out.println("");
        Mahasiswa mahasiswa2 = new MahasiswaBeasiswa("Rio", 1500000);
        mahasiswa2.infoUangSaku();
        mahasiswa2.tambahUangSaku(300000, " dari pemberi beasiswa");
        mahasiswa2.infoUangSaku();
    }
}
