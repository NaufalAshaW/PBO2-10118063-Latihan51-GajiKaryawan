/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118063.latihan51;

/**
 *
 * @author 
 * NAMA   : Naufal Asha
 * KELAS  : IF-2
 * NIM    : 10118063
 */
public class Manager extends Karyawan{
    private int kehadiran;
    private float tunjanganGolongan, tunjanganJabatan, tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }
    
    public float tunjanganKehadiran(int kehadiran){
        return tunjanganKehadiran = kehadiran * 10000;
    }
    
    public float tunjanganJabatan(String jabatan){
        switch(jabatan){
            case "Manager" :
                tunjanganJabatan = 2000000; break;
            case "Kabag" :
                tunjanganJabatan = 1000000; break;
            default : 
                tunjanganJabatan = 0; break;
        }
        return tunjanganJabatan;
    }
    
    public float tunjanganGolongan(int golongan){
        switch(golongan){
            case 1 :
                tunjanganGolongan = 500000; break;
            case 2 :
                tunjanganGolongan = 1000000; break;
            case 3 :
                tunjanganGolongan = 1500000; break;
            default :
                tunjanganGolongan = 0; break;
        }
        return tunjanganGolongan;
    }
    
    public float gajiTotal(){
        return tunjanganJabatan + tunjanganGolongan + tunjanganKehadiran;
    }
}