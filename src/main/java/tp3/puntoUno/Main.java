/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3.puntoUno;

/**
 *
 * @author Pinku
 */
public class Main {

    public static void main(String[] args) {
        VerificarCuenta vc = new VerificarCuenta();
        Thread Luis = new Thread(vc, "Luis");
        Thread Manuel = new Thread(vc, "Manuel");
        Thread Juan = new Thread(vc, "Juan");
        Luis.start();
        Manuel.start();
        Juan.start();
    }

}
