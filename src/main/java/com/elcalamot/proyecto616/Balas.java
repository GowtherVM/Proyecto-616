/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.elcalamot.proyecto616;

import java.awt.Image;

/**
 *
 * @author Admin
 */
public class Balas {
    
    private int velocidad;
    private int posicionX;
    private int posicionY;
    private float daño;
    private Image aparencia;

    public Balas(int velocidad, int posicionX, int posicionY, float daño, Image aparencia) {
        this.velocidad = velocidad;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.daño = daño;
        this.aparencia = aparencia;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }

    public float getDaño() {
        return daño;
    }

    public void setDaño(float daño) {
        this.daño = daño;
    }

    public Image getAparencia() {
        return aparencia;
    }

    public void setAparencia(Image aparencia) {
        this.aparencia = aparencia;
    }

    
}
