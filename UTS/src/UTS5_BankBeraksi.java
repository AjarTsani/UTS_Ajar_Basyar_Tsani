/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Ajar Basyar Tsani
 */
public class UTS5_BankBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        UTS5_Bank saldo = new UTS5_Bank(100000);
        
        saldo.getSaldo();
        saldo.simpanUang(500000);
        saldo.ambilUang(500000);
        saldo.ambilUang(100000);
        saldo.ambilUang(100000);
        
    }
    
}
