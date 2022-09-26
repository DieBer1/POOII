package Modelo;
import Modelo.Estudiante;
import Modelo.Docente;
import Modelo.Administrativo;
import java.util.Scanner;
/**
 *
 * @author estudiante
 */
public class Aplicacion 
{
    public static void main(String [] args)
    {
        Scanner leer = new Scanner(System.in);
        Estudiante e = new Estudiante();
        Docente d = new Docente();
        Administrativo a = new Administrativo();
        int decision;
        System.out.println("Bienvenido usuario");
        System.out.println("Digite el numero correspondiente a la opccion que desea realizar");
        System.out.println("1. Calcular el IMC del docente");
        System.out.println("2. Saber si el estudiante puede matricular el proyecto de grado");
        System.out.println("3. Saber la antiguedad de los administrativos");
        System.out.println("4. Actualizar el salario del docente");
        decision=leer.nextInt();
        if(decision==1)
        {
            d.leerDocentes();
            d.IMC();
        }
        if(decision==2)
        {
            e.leerEstudiantes();
            e.determinarCreditos();
        }
        if(decision==3)
        {
            a.leerAdministrativos();
            a.antiguedad();
        }
        if(decision==4)
        {
            d.leerDocentes();
            d.aSalario();
        }
        if(decision>=5 && decision<=0)
        {
            System.out.println("Por favor digite nuevamente");
        }
    }
}
