/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_9;

/**
 *
 * @author Gary
 */
public class Rectangulo extends Figura {
    //Horizontal seria 1 de los lados Horizontales, lo mismo para vertical
    private float horizontal, vertical;

    public Rectangulo() {
    }
    
    //Getters y Setters
    public float getHorizontal() {
        return horizontal;
    }

    public void setHorizontal(float hozrizontal) {
        this.horizontal = hozrizontal;
    }

    public float getVertical() {
        return vertical;
    }

    public void setVertical(float vertical) {
        this.vertical = vertical;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public double retornarPerimetro(){
        return ((horizontal * 2) + (vertical * 2));
    }
    @Override
    public double retornarArea(){
        return horizontal * vertical;
    }
}
