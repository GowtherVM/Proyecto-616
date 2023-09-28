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
public class Enemigo {
    
    private String nom;
    private float ataque;
    private float vida;
    private int velocidad;
    private int posicionX;
    private int posicionY;
    private Image aparencia;

    public Enemigo(String nom, float ataque, float vida, int velocidad, int posicionX, int posicionY, Image aparencia) {
        this.nom = nom;
        this.ataque = ataque;
        this.vida = vida;
        this.velocidad = velocidad;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.aparencia = aparencia;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getAtaque() {
        return ataque;
    }

    public void setAtaque(float ataque) {
        this.ataque = ataque;
    }

    public float getVida() {
        return vida;
    }

    public void setVida(float vida) {
        this.vida = vida;
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

    public Image getAparencia() {
        return aparencia;
    }

    public void setAparencia(Image aparencia) {
        this.aparencia = aparencia;
    }

    
    
}
