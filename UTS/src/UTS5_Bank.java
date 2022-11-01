/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ajar Basyar Tsani
 */
public class UTS5_Bank {
    
    int saldoAink;
    int total;
    UTS5_Bank(int saldo){
        saldoAink = saldo;
    }
    
    void getSaldo(){
        System.out.println("Selamat datang di Bank ABC");
        System.out.println("Saldo saat ini : Rp." + saldoAink);
        
    }
    void simpanUang(int simpan){
        total = simpan + saldoAink;
        System.out.println("Simpan uang : " + simpan);
        System.out.println("Saldo saat ini : Rp." + total);
    }
    void ambilUang(int ambil){
        System.out.println("Anda mengambil RP." + ambil);
        if (total >= ambil){
            total -= ambil;
            System.out.println("Saldo Anda : RP."+ total);
            System.out.println("uang anda berhasil diambil");
        }else if(total <= ambil){
            System.out.println("Saldo Tidak cukup");
        }
         
    }
    
}

