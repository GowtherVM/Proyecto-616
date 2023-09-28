package com.elcalamot.proyecto616;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Juego extends JFrame {

    private int personajeX;
    private int personajeY;
    private Image personajeImagen;
    private boolean leftPressed;
    private boolean rightPressed;
    private boolean upPressed;
    private boolean downPressed;
    private int anchoNuevo;
    private int altoNuevo;

    public Juego() {
        setTitle("Projecto 616"); //Titulo de la pantalla
        setSize(800, 600); //Le establecemos las medidas de la pantalla
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addKeyListener(new TecladoListener()); //le pasamos nuestro metodo para que escuche las teclas que 
        //pulsamos y lo que pasa cuando las pulsamos
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        personajeX = 350;
        personajeY = 250;
        anchoNuevo = 100;
        altoNuevo = 100;
        personajeImagen = new ImageIcon("imagenes/Demo_Sprite4.png").getImage();
        
        
        // Crea un bucle de juego utilizando un Timer
        int velocidadMovimiento = 5; // Ajusta la velocidad de movimiento según tu preferencia
        Timer timer = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Actualiza la posición del personaje en función del estado de las teclas
                if (leftPressed) {
                    personajeX -= velocidadMovimiento;
                }
                if (rightPressed) {
                    personajeX += velocidadMovimiento;
                }
                if (upPressed) {
                    personajeY -= velocidadMovimiento;
                }
                if (downPressed) {
                    personajeY += velocidadMovimiento;
                }
                
                repaint(); // Vuelve a dibujar la ventana para mostrar el nuevo estado del personaje
            }
        });

        timer.start(); // Iniciar el bucle de juego
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(personajeImagen, personajeX, personajeY, anchoNuevo, altoNuevo, null);
    }

    private class TecladoListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();

            // Configura el estado de las teclas según las teclas presionadas
            if (keyCode == KeyEvent.VK_LEFT) {
                leftPressed = true;
            }
            if (keyCode == KeyEvent.VK_RIGHT) {
                rightPressed = true;
            }
            if (keyCode == KeyEvent.VK_UP) {
                upPressed = true;
            }
            if (keyCode == KeyEvent.VK_DOWN) {
                downPressed = true;
            }
            if (keyCode == KeyEvent.VK_A) {
                leftPressed = true;
            }
            if (keyCode == KeyEvent.VK_D) {
                rightPressed = true;
            }
            if (keyCode == KeyEvent.VK_W) {
                upPressed = true;
            }
            if (keyCode == KeyEvent.VK_S) {
                downPressed = true;
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
            int keyCode = e.getKeyCode();

            // Restablece el estado de las teclas según las teclas liberadas
            if (keyCode == KeyEvent.VK_LEFT) {
                leftPressed = false;
            }
            if (keyCode == KeyEvent.VK_RIGHT) {
                rightPressed = false;
            }
            if (keyCode == KeyEvent.VK_UP) {
                upPressed = false;
            }
            if (keyCode == KeyEvent.VK_DOWN) {
                downPressed = false;
            }
            if (keyCode == KeyEvent.VK_A) {
                leftPressed = false;
            }
            if (keyCode == KeyEvent.VK_D) {
                rightPressed = false;
            }
            if (keyCode == KeyEvent.VK_W) {
                upPressed = false;
            }
            if (keyCode == KeyEvent.VK_S) {
                downPressed = false;
            }
        }
    }
    }
    
  

