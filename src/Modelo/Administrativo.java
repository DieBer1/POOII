/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.util.Scanner;

/**
 *
 * @author estudiante
 */
public class Administrativo 
{
    private int cantidad;
    private int cod[], aIng[];
    private String nom[], ape[];
    
    public Administrativo() 
    {
        
    }

    public Administrativo(int[] cod, int[] aIng, String[] nom, String[] ape) {
        this.cod = cod;
        this.aIng = aIng;
        this.nom = nom;
        this.ape = ape;
    }

    public int[] getCod() {
        return cod;
    }

    public void setCod(int[] cod) {
        this.cod = cod;
    }

    public int[] getaIng() {
        return aIng;
    }

    public void setaIng(int[] aIng) {
        this.aIng = aIng;
    }

    public String[] getNom() {
        return nom;
    }

    public void setNom(String[] nom) {
        this.nom = nom;
    }

    public String[] getApe() {
        return ape;
    }

    public void setApe(String[] ape) {
        this.ape = ape;
    }
    
    public void antiguedad()
    {
        for(int i=1;i<cantidad;i++)
        {
            int años = 2022-aIng[i];
            System.out.println("El admisnitrador "+nom[i]+" lleva "+años+" en la entidad");  
        }
    }
    public void leerAdministrativos()
    {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Digite la cantidad de administrativos a analizar");
        cantidad = leer.nextInt();
        System.out.println("Ingrese los datos de los usuarios");
        for(int i=0;i<cantidad;i++)
        {
            System.out.println("Digite el codigo del administrador "+i);
            cod[i]=leer.nextInt();
            System.out.println("Digite el nombre del administrador "+i);
            nom[i]=leer.nextLine();
            System.out.println("Digite el apellido del administrador "+i);
            ape[i]=leer.nextLine();
            System.out.println("Digite el año en el que ingreso el administrador "+i);
            aIng[i]=leer.nextInt();
        }
    }
}
