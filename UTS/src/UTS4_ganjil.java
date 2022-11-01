/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Ajar Basyar Tsani
 */
public class UTS4_ganjil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


    for(var counter = 1; counter <= 100; counter++){
      if(counter % 2 == 0){
        continue;
      }

      System.out.println("Perulangan ganjil " + counter);
    }

  }
}
