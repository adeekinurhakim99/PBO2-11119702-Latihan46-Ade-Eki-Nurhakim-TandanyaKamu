/*Nama 	 : Ade Eki Nurhakim
NIM 	 : 10119702
Fakultas : Teknik Dan Ilmu Komputer
Prodi 	 : Teknik Informatika
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tandanyakamu;
import java.util.Scanner;
/**
 *
 * @author Ekiw
 */
public class Main {
    public static void main(String[] args) {
        Age ag = new Age();
        Scanner i = new Scanner(System.in);
            System.out.println("Masukkan Tahun Lahir Anda :");
            ag.setYearBirth(i.nextInt());
            System.out.println("===== Hasil Perhitungan Umur =====");
            System.out.println("Tahun Lahir Anda : "+ag.getYearBirth());
            System.out.println("Hari Ini Tahun : "+ag.getYearNow());
            System.out.println("Umur Kamu Sampai Hari Ini : "+ag.hitungUmur());
            System.out.println("Tandanya Kamu : "+ag.tandanyaKamu());
            
    }        
    }
