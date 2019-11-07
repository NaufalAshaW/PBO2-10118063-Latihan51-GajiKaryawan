/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118063.latihan51;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA   : Naufal Asha
 * KELAS  : IF-2
 * NIM    : 10118063
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager manager = new Manager();
        
        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukkan NIK : ");
        manager.setNik(sc.nextLine());
        System.out.print("Masukkan Nama : ");
        manager.setNama(sc.nextLine());
        System.out.print("Masukkan Golongan : ");
        manager.setGolongan(sc.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        manager.setJabatan(sc.next());
        System.out.print("Masukkan Jumlah Kehadiran : ");
        manager.setKehadiran(sc.nextInt());
        
        System.out.println("\n====Hasil Perhitungan====");
        System.out.println("NIK\t: " + manager.getNik());
        System.out.println("NAMA\t: " + manager.getNama());
        System.out.println("GOLONGAN\t: " + manager.getGolongan());
        System.out.println("JABATAN\t: " + manager.getJabatan());
        
        System.out.println("\nTUNJANGAN GOLONGAN\t: " + 
                manager.tunjanganGolongan(manager.getGolongan()));
        System.out.println("\nTUNJANGAN JABATAN\t: " + 
                manager.tunjanganJabatan(manager.getJabatan()));
        System.out.println("\nTUNJANGAN KEHADIRAN\t: " + 
                manager.tunjanganKehadiran(manager.getKehadiran()));
        System.out.println("\nGAJI TOTAL\t\t: " + manager.gajiTotal());
    }
    
}
