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
public class Docente 
{
    private int cantidad;
    private String nom[], ape[];
    private int pes[], est[], sal[], cod[];

    public Docente()
    {
        
    }

    public Docente(int cantidad, String[] nom, String[] ape, int[] pes, int[] est, int[] sal, int[] cod) {
        this.cantidad = cantidad;
        this.nom = nom;
        this.ape = ape;
        this.pes = pes;
        this.est = est;
        this.sal = sal;
        this.cod = cod;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
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

    public int[] getPes() {
        return pes;
    }

    public void setPes(int[] pes) {
        this.pes = pes;
    }

    public int[] getEst() {
        return est;
    }

    public void setEst(int[] est) {
        this.est = est;
    }

    public int[] getSal() {
        return sal;
    }

    public void setSal(int[] sal) {
        this.sal = sal;
    }

    public int[] getCod() {
        return cod;
    }

    public void setCod(int[] cod) {
        this.cod = cod;
    }
    
    public void IMC()
    {
        for(int i=1;i<cantidad;i++){
        int imc = pes[i]/(est[i]*est[i]);
        if(imc<18.5)
        {
            System.out.println("Composicion corporal inferior al normal, su IMC es de: "+imc);
        }
        if(imc>18.5 && imc<24.9)
        {
            System.out.println("Composicion corporal normal, su IMC es de: "+imc);
        }
        if(imc>25 && imc<29.9)
        {
            System.out.println("Composicion corporal superior al promedio, si IMC es de: "+imc);
        }
        if(imc>30)
        {
            System.out.println("Composicion corporal obesa, su IMC es de: "+imc);
        }
        }
    }
    public void aSalario()
    {
        int i;
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite el codigo del docente");
        i=leer.nextInt();
        System.out.println("Digite el nuevo salario del docente: ");
        int salario = leer.nextInt();
        sal[i]=salario;
    }
    
    public void leerDocentes()
    {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Digite la cantidad de docentes a analizar");
        cantidad = leer.nextInt();
        System.out.println("Ingrese los datos de los usuarios");
        for(int i=0;i<cantidad;i++)
        {
            System.out.println("Digite el codigo del docente "+i);
            cod[i]=leer.nextInt();
            System.out.println("Digite el nombre del docente "+i);
            nom[i]=leer.nextLine();
            System.out.println("Digite el apellido del docente "+i);
            ape[i]=leer.nextLine();
            System.out.println("Digite el peso del docente "+i);
            pes[i]=leer.nextInt();
            System.out.println("Digite la altura del docente "+i);
            est[i]=leer.nextInt();
            System.out.println("Digite el salario del docente "+i);
            sal[i]=leer.nextInt();
        }
    }
}
