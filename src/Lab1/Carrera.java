/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Lab1;

import java.util.Scanner;

/**
 *
 * @author estudiante
 */
public class Carrera 
{
    private int cod[];
    public int cCre[];
    private String nombre[];

    public Carrera() {
    }

    public Carrera(int[] cod, int[] cCre, String[] nombre) {
        this.cod = cod;
        this.cCre = cCre;
        this.nombre = nombre;
    }

    public int[] getCod() {
        return cod;
    }

    public void setCod(int[] cod) {
        this.cod = cod;
    }

    public int[] getcCre() {
        return cCre;
    }

    public void setcCre(int[] cCre) {
        this.cCre = cCre;
    }

    public String[] getNombre() {
        return nombre;
    }

    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }
    
    
}
