/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.elcalamot.proyecto616;

import javax.swing.SwingUtilities;

/**
 *
 * @author Admin
 */
public class Emulador {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> { //se utiliza para crear y mostrar la ventana del juego en el hilo 
            //de eventos de Swing de una manera segura y adecuada.
            Juego juego = new Juego();
            juego.setVisible(true);
        });
    }
}
