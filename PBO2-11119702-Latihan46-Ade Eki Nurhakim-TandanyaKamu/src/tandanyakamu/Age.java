/*Nama 	 : Ade Eki Nurhakim
NIM 	 : 10119702
Fakultas : Teknik Dan Ilmu Komputer
Prodi 	 : Teknik Informatika
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tandanyakamu;

/**
 *
 * @author Ekiw
 */
public class Age {
    private int yearBirth;
    private int yearNow;
    private String red;
    
    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }
    public int getYearNow() {
        return 2019;
    }
     public int hitungUmur(){
        return yearNow-yearBirth;
        
    }

    public String tandanyaKamu(){
        int hitungUmur=yearNow-yearBirth;
         if (hitungUmur<=5){
            System.out.println("Lagi Lucu lucunya");
        }
        else if(hitungUmur<=10){
            System.out.println("Masih Anak Anak");}
        else if(hitungUmur<=13){
            System.out.println("Masih Remaja");}
        else if(hitungUmur<=19){
            System.out.println("Alay");}
        else if(hitungUmur<=29){
        System.out.println("Lagi Nyari Jodoh");}
        else if(hitungUmur<=35){
            System.out.println("Lagi Sibuk Nyari Uang");}
        else if(hitungUmur<=150){
            System.out.println("Sudah Tua");}
        else if(hitungUmur>150){
            System.out.println("Tidak Terdeteksi Kehidupan");
        }
        return null;
        }
}
