/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author SMK TELKOM
 */
public class TestBola {
    public static void main(String[] args){
    double Jarijari=14;
        Bola objekbola=new Bola(7);
        objekbola.showDiameter();
        objekbola.showLuasPermukaan();
        objekbola.showVolume();
        System.out.println("\n\n");
        objekbola.setJarijari(Jarijari);
        objekbola.showDiameter();
        objekbola.showLuasPermukaan();
        objekbola.showVolume();
    }
}
