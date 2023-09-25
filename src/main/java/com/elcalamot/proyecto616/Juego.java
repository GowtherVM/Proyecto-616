import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Juego extends JFrame {
    private int personajeX;
    private int personajeY;
    private Image personajeImagen;

    public Juego() {
        setTitle("Projecto 616"); //Titulo de la pantalla
        setSize(800, 600); //Le establecemos las medidas de la pantalla
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addKeyListener(new TecladoListener()); //le pasamos nuestro metodo para que escuche las teclas que 
        //pulsamos y lo que pasa cuando las pulsamos
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        personajeX = 100;
        personajeY = 100;
        personajeImagen = new ImageIcon("imagenes/Demo_Sprite3.png").getImage(); //cargo el sprite

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(personajeImagen, personajeX, personajeY, null); //me dibuja el sprite
    }

    private class TecladoListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode(); //Guardamos en la variable keyCode el valor del codigo de la tecla 
            //que hemos pulsado

            // En este switch revisa que el codigo de la tecla coincida con el evento de las teclas especificadas
            switch (keyCode) {
                case KeyEvent.VK_LEFT:
                    personajeX -= 10;
                    break;
                case KeyEvent.VK_A:
                    personajeX -= 10;
                    break;
                case KeyEvent.VK_RIGHT:
                    personajeX += 10;
                    break;
                case KeyEvent.VK_D:
                    personajeX += 10;
                    break;
                case KeyEvent.VK_UP:
                    personajeY -= 10;
                    break;
                case KeyEvent.VK_W:
                    personajeY -= 10;
                    break;
                case KeyEvent.VK_DOWN:
                    personajeY += 10;
                    break;
                case KeyEvent.VK_S:
                    personajeY += 10;
                    break;
            }

            repaint(); // Vuelve a dibujar la ventana para mostrar el nuevo estado del personaje
        }
    }

    
}