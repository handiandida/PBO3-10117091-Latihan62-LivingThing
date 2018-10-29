/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117091.latihan62.livingthing;

/**
 *
 * @author 
 * NAMA  : Dida Handian
 * Kelas : PBO3
 * NIM   : 10117091
 * Deskripsi Tugas : Membuat Program Abstrak menampilkan 3 Kegiatan yang berbeda
 */
public class PBO310117091Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Human human = new Human();
        human.setNama("Rizki Adam Kurniawan");
        System.out.print(human.getNama()+" ");
        human.walk("");
        System.out.print(human.getNama()+" ");
        human.breath("");
        System.out.print(human.getNama()+" ");
        human.eat("");
    }
    
}
